package net.formiguinhas.delegates;

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import er.directtoweb.delegates.ERD2WQueryActionDelegate;
import er.directtoweb.delegates.ERDQueryDataSourceDelegateInterface;
import er.directtoweb.pages.ERD2WQueryPage;
import er.directtoweb.pages.templates.ERD2WQueryPageTemplate;

/**
 * @d2wKey extraRestrictingQualifier
 * @d2wKey fetchSpecificationName
 * @author nlessa
 * */

public class MOLQueryDataSourceWithRestrictingQualifier implements
		ERDQueryDataSourceDelegateInterface {

	private static Logger LOG = Logger.getLogger(MOLQueryDataSourceWithRestrictingQualifier.class);

	public MOLQueryDataSourceWithRestrictingQualifier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public interface Keys {
		public static final String extraRestrictingQualifier = "extraRestrictingQualifier";
		public static final String extraFetchRestrictingSpecificationName = "extraFetchRestrictingSpecificationName";
	}

	public EODataSource queryDataSource(ERD2WQueryPage sender) {
		EODataSource ds = sender.dataSource();

		if (ds == null || !(ds instanceof EODatabaseDataSource)) {
			ds = new EODatabaseDataSource(sender.session()
					.defaultEditingContext(), sender.entity().name());
			sender.setDataSource(ds);
		}

		EOFetchSpecification fs = ((EODatabaseDataSource) ds)
				.fetchSpecification();
		fs.setQualifier(qualifierFromSender(sender));
		fs.setIsDeep(sender.isDeep());
		fs.setUsesDistinct(sender.usesDistinct());
		fs.setRefreshesRefetchedObjects(sender.refreshRefetchedObjects());

		int limit = sender.fetchLimit();
		if (limit != 0) {
			fs.setFetchLimit(limit);
		}
		NSArray prefetchingRelationshipKeyPaths = sender
				.prefetchingRelationshipKeyPaths();
		if (prefetchingRelationshipKeyPaths != null
				&& prefetchingRelationshipKeyPaths.count() > 0) {
			fs.setPrefetchingRelationshipKeyPaths(prefetchingRelationshipKeyPaths);
		}
		return ds;
	}

	private EOQualifier qualifierFromSender(ERD2WQueryPage sender) {
		EOQualifier q = sender.qualifier();
		LOG.info((q!=null)?q.toString():"Sem qualifier no sender");
		// q = ... create your OR qualifier here
		// verifica se tem qualificar restritivo

		EOQualifier extraQualifier = (EOQualifier) sender.d2wContext()
				.valueForKey(Keys.extraRestrictingQualifier);

		if (q != null && extraQualifier != null) {
			q = new EOAndQualifier(new NSArray(
					new Object[] { q, extraQualifier }));
		} else if (extraQualifier != null) {
			q = extraQualifier;
		}

		// verifica se tem qualificar restritivo de fetchSpecification
		// restritiva
		String fetchSpecName = (String) sender.d2wContext().valueForKey(
				Keys.extraFetchRestrictingSpecificationName);
		// _fetchSpecificationName=name;
		if (fetchSpecName != null) {
			EOFetchSpecification fsrest = sender.entity()
					.fetchSpecificationNamed(fetchSpecName);
			if (fsrest != null) {
				extraQualifier = sender.entity()
						.fetchSpecificationNamed(fetchSpecName).qualifier();
				if (q != null && extraQualifier != null) {
					q = new EOAndQualifier(new NSArray(new Object[] { q,
							extraQualifier }));
				} else if (extraQualifier != null) {
					q = extraQualifier;
				}
			}
		}
		LOG.info((q!=null)?q.toString():"Qualifier vazio");
		return q;
	}

}
