package net.formiguinhas.migration;

import org.apache.log4j.Logger;

import com.webobjects.eoaccess.EOModel;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXModelVersion;
import er.extensions.migration.IERXPostMigration;

	public class Formiguinhas0 extends ERXMigrationDatabase.Migration implements IERXPostMigration

	 {

		private static Logger LOG = Logger.getLogger(Formiguinhas0.class);

		@Override
		public NSArray<ERXModelVersion> modelDependencies() {
		     //return new NSArray<ERXModelVersion>(new ERXModelVersion[] { new ERXModelVersion("ERAttachment", 0) });
			return null;
		}

		@Override
		public void downgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
			// DO NOTHING
		}


		@Override
		public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
			ERXMigrationTable usuarioTable = database.newTableNamed("Usuario");
			usuarioTable.newStringColumn("email", 50, false);
			usuarioTable.newIntegerColumn("id", false);
			usuarioTable.newStringColumn("login", 16, false);
			usuarioTable.newStringColumn("nome", 50, false);
			usuarioTable.newStringColumn("password", 16, false);
			usuarioTable.create();
		 	usuarioTable.setPrimaryKey("id");
		 	
		    LOG.info("Iniciado população de dados!");

		    ERXJDBCUtilities.executeUpdateScriptFromResourceNamed(database.adaptorChannel(), "Formiguinhas0-" + ERXJDBCUtilities.databaseProductName(database.adaptorChannel()) + ".sql", null);


		}

			@Override
			public void postUpgrade(EOEditingContext editingContext,
					EOModel model) throws Throwable {
				// TODO Auto-generated method stub

			}


}
