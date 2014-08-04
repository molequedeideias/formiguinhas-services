// DO NOT EDIT.  Make changes to Entrega.java instead.
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
public abstract class _Entrega extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Entrega";

  // Attribute Keys
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.AcordoEntrePares> ACORDO = new ERXKey<net.formiguinhas.negocios.AcordoEntrePares>("acordo");
  public static final ERXKey<net.formiguinhas.negocios.Endereco> ENDERECO = new ERXKey<net.formiguinhas.negocios.Endereco>("endereco");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario> LISTAS_DE_COMPRAS_DE_USUARIOS = new ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario>("listasDeComprasDeUsuarios");

  // Attributes
  // Relationships
  public static final String ACORDO_KEY = ACORDO.key();
  public static final String ENDERECO_KEY = ENDERECO.key();
  public static final String LISTAS_DE_COMPRAS_DE_USUARIOS_KEY = LISTAS_DE_COMPRAS_DE_USUARIOS.key();

  private static Logger LOG = Logger.getLogger(_Entrega.class);

  public Entrega localInstanceIn(EOEditingContext editingContext) {
    Entrega localInstance = (Entrega)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

	// Creators  sem parâmetros
	public static Entrega createEOEntrega( EOEditingContext context )
	{
		return (Entrega) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.AcordoEntrePares acordo() {
    return (net.formiguinhas.negocios.AcordoEntrePares)storedValueForKey(_Entrega.ACORDO_KEY);
  }
  
  public void setAcordo(net.formiguinhas.negocios.AcordoEntrePares value) {
    takeStoredValueForKey(value, _Entrega.ACORDO_KEY);
  }

  public void setAcordoRelationship(net.formiguinhas.negocios.AcordoEntrePares value) {
    if (_Entrega.LOG.isDebugEnabled()) {
      _Entrega.LOG.debug("updating acordo from " + acordo() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setAcordo(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.AcordoEntrePares oldValue = acordo();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Entrega.ACORDO_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _Entrega.ACORDO_KEY);
    }
  }
  
  public net.formiguinhas.negocios.Endereco endereco() {
    return (net.formiguinhas.negocios.Endereco)storedValueForKey(_Entrega.ENDERECO_KEY);
  }
  
  public void setEndereco(net.formiguinhas.negocios.Endereco value) {
    takeStoredValueForKey(value, _Entrega.ENDERECO_KEY);
  }

  public void setEnderecoRelationship(net.formiguinhas.negocios.Endereco value) {
    if (_Entrega.LOG.isDebugEnabled()) {
      _Entrega.LOG.debug("updating endereco from " + endereco() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setEndereco(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Endereco oldValue = endereco();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Entrega.ENDERECO_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _Entrega.ENDERECO_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuarios() {
    return (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)storedValueForKey(_Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuarios(EOQualifier qualifier) {
    return listasDeComprasDeUsuarios(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuarios(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> results;
      results = listasDeComprasDeUsuarios();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToListasDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    includeObjectIntoPropertyWithKey(object, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void removeFromListasDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    excludeObjectFromPropertyWithKey(object, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void addToListasDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Entrega.LOG.isDebugEnabled()) {
      _Entrega.LOG.debug("adding " + object + " to listasDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListasDeComprasDeUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public void removeFromListasDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Entrega.LOG.isDebugEnabled()) {
      _Entrega.LOG.debug("removing " + object + " from listasDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListasDeComprasDeUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeComprasDeUsuario createListasDeComprasDeUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeComprasDeUsuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
    return (net.formiguinhas.negocios.ListaDeComprasDeUsuario) eo;
  }

  public void deleteListasDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Entrega.LISTAS_DE_COMPRAS_DE_USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListasDeComprasDeUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeComprasDeUsuario> objects = listasDeComprasDeUsuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListasDeComprasDeUsuariosRelationship(objects.nextElement());
    }
  }


  public static Entrega createEntrega(EOEditingContext editingContext, net.formiguinhas.negocios.AcordoEntrePares acordo, net.formiguinhas.negocios.Endereco endereco) {
    Entrega eo = (Entrega) EOUtilities.createAndInsertInstance(editingContext, _Entrega.ENTITY_NAME);    
    eo.setAcordoRelationship(acordo);
    eo.setEnderecoRelationship(endereco);
    return eo;
  }

  public static ERXFetchSpecification<Entrega> fetchSpec() {
    return new ERXFetchSpecification<Entrega>(_Entrega.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Entrega> fetchAllEntregas(EOEditingContext editingContext) {
    return _Entrega.fetchAllEntregas(editingContext, null);
  }

  public static NSArray<Entrega> fetchAllEntregas(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Entrega.fetchEntregas(editingContext, null, sortOrderings);
  }

  public static NSArray<Entrega> fetchEntregas(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Entrega> fetchSpec = new ERXFetchSpecification<Entrega>(_Entrega.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Entrega> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Entrega fetchEntrega(EOEditingContext editingContext, String keyName, Object value) {
    return _Entrega.fetchEntrega(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Entrega fetchEntrega(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Entrega> eoObjects = _Entrega.fetchEntregas(editingContext, qualifier, null);
    Entrega eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Entrega that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Entrega fetchRequiredEntrega(EOEditingContext editingContext, String keyName, Object value) {
    return _Entrega.fetchRequiredEntrega(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Entrega fetchRequiredEntrega(EOEditingContext editingContext, EOQualifier qualifier) {
    Entrega eoObject = _Entrega.fetchEntrega(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Entrega that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Entrega localInstanceIn(EOEditingContext editingContext, Entrega eo) {
    Entrega localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}