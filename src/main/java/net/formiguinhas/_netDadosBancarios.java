// DO NOT EDIT.  Make changes to netDadosBancarios.java instead.
package net.formiguinhas;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _netDadosBancarios extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "DadosBancarios";

  // Attribute Keys
  public static final ERXKey<net.formiguinhas.enums.DadosBancariosBanco> BANCO = new ERXKey<net.formiguinhas.enums.DadosBancariosBanco>("banco");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Usuario> USUARIO = new ERXKey<net.formiguinhas.negocios.Usuario>("usuario");

  // Attributes
  public static final String BANCO_KEY = BANCO.key();
  // Relationships
  public static final String USUARIO_KEY = USUARIO.key();

  private static Logger LOG = Logger.getLogger(_netDadosBancarios.class);

  public netDadosBancarios localInstanceIn(EOEditingContext editingContext) {
    netDadosBancarios localInstance = (netDadosBancarios)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public net.formiguinhas.enums.DadosBancariosBanco banco() {
    return (net.formiguinhas.enums.DadosBancariosBanco) storedValueForKey(_netDadosBancarios.BANCO_KEY);
  }

  public void setBanco(net.formiguinhas.enums.DadosBancariosBanco value) {
    if (_netDadosBancarios.LOG.isDebugEnabled()) {
            _netDadosBancarios.LOG.debug( "updating banco from " + banco() + " to " + value);
    }
    takeStoredValueForKey(value, _netDadosBancarios.BANCO_KEY);
  }

	// Creators  sem parâmetros
	public static netDadosBancarios createEOnetDadosBancarios( EOEditingContext context )
	{
		return (netDadosBancarios) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.Usuario usuario() {
    return (net.formiguinhas.negocios.Usuario)storedValueForKey(_netDadosBancarios.USUARIO_KEY);
  }
  
  public void setUsuario(net.formiguinhas.negocios.Usuario value) {
    takeStoredValueForKey(value, _netDadosBancarios.USUARIO_KEY);
  }

  public void setUsuarioRelationship(net.formiguinhas.negocios.Usuario value) {
    if (_netDadosBancarios.LOG.isDebugEnabled()) {
      _netDadosBancarios.LOG.debug("updating usuario from " + usuario() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setUsuario(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Usuario oldValue = usuario();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _netDadosBancarios.USUARIO_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _netDadosBancarios.USUARIO_KEY);
    }
  }
  

  public static netDadosBancarios createDadosBancarios(EOEditingContext editingContext, net.formiguinhas.enums.DadosBancariosBanco banco
, net.formiguinhas.negocios.Usuario usuario) {
    netDadosBancarios eo = (netDadosBancarios) EOUtilities.createAndInsertInstance(editingContext, _netDadosBancarios.ENTITY_NAME);    
                eo.setBanco(banco);
    eo.setUsuarioRelationship(usuario);
    return eo;
  }

  public static ERXFetchSpecification<netDadosBancarios> fetchSpec() {
    return new ERXFetchSpecification<netDadosBancarios>(_netDadosBancarios.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<netDadosBancarios> fetchAllDadosBancarioses(EOEditingContext editingContext) {
    return _netDadosBancarios.fetchAllDadosBancarioses(editingContext, null);
  }

  public static NSArray<netDadosBancarios> fetchAllDadosBancarioses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _netDadosBancarios.fetchDadosBancarioses(editingContext, null, sortOrderings);
  }

  public static NSArray<netDadosBancarios> fetchDadosBancarioses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<netDadosBancarios> fetchSpec = new ERXFetchSpecification<netDadosBancarios>(_netDadosBancarios.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<netDadosBancarios> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static netDadosBancarios fetchDadosBancarios(EOEditingContext editingContext, String keyName, Object value) {
    return _netDadosBancarios.fetchDadosBancarios(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static netDadosBancarios fetchDadosBancarios(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<netDadosBancarios> eoObjects = _netDadosBancarios.fetchDadosBancarioses(editingContext, qualifier, null);
    netDadosBancarios eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one DadosBancarios that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static netDadosBancarios fetchRequiredDadosBancarios(EOEditingContext editingContext, String keyName, Object value) {
    return _netDadosBancarios.fetchRequiredDadosBancarios(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static netDadosBancarios fetchRequiredDadosBancarios(EOEditingContext editingContext, EOQualifier qualifier) {
    netDadosBancarios eoObject = _netDadosBancarios.fetchDadosBancarios(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no DadosBancarios that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static netDadosBancarios localInstanceIn(EOEditingContext editingContext, netDadosBancarios eo) {
    netDadosBancarios localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}