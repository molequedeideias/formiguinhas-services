// DO NOT EDIT.  Make changes to Fone.java instead.
package net.formiguinhas.negocios;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Fone extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Fone";

  // Attribute Keys
  public static final ERXKey<Integer> DDD = new ERXKey<Integer>("ddd");
  public static final ERXKey<String> NUMERO = new ERXKey<String>("numero");
  public static final ERXKey<net.formiguinhas.enums.FoneTipo> TIPO = new ERXKey<net.formiguinhas.enums.FoneTipo>("tipo");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Usuario> USUARIOS = new ERXKey<net.formiguinhas.negocios.Usuario>("usuarios");

  // Attributes
  public static final String DDD_KEY = DDD.key();
  public static final String NUMERO_KEY = NUMERO.key();
  public static final String TIPO_KEY = TIPO.key();
  // Relationships
  public static final String USUARIOS_KEY = USUARIOS.key();

  private static Logger LOG = Logger.getLogger(_Fone.class);

  public Fone localInstanceIn(EOEditingContext editingContext) {
    Fone localInstance = (Fone)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer ddd() {
    return (Integer) storedValueForKey(_Fone.DDD_KEY);
  }

  public void setDdd(Integer value) {
    if (_Fone.LOG.isDebugEnabled()) {
            _Fone.LOG.debug( "updating ddd from " + ddd() + " to " + value);
    }
    takeStoredValueForKey(value, _Fone.DDD_KEY);
  }

  public String numero() {
    return (String) storedValueForKey(_Fone.NUMERO_KEY);
  }

  public void setNumero(String value) {
    if (_Fone.LOG.isDebugEnabled()) {
            _Fone.LOG.debug( "updating numero from " + numero() + " to " + value);
    }
    takeStoredValueForKey(value, _Fone.NUMERO_KEY);
  }

  public net.formiguinhas.enums.FoneTipo tipo() {
    return (net.formiguinhas.enums.FoneTipo) storedValueForKey(_Fone.TIPO_KEY);
  }

  public void setTipo(net.formiguinhas.enums.FoneTipo value) {
    if (_Fone.LOG.isDebugEnabled()) {
            _Fone.LOG.debug( "updating tipo from " + tipo() + " to " + value);
    }
    takeStoredValueForKey(value, _Fone.TIPO_KEY);
  }

	// Creators  sem parâmetros
	public static Fone createEOFone( EOEditingContext context )
	{
		return (Fone) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public NSArray<net.formiguinhas.negocios.Usuario> usuarios() {
    return (NSArray<net.formiguinhas.negocios.Usuario>)storedValueForKey(_Fone.USUARIOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuarios(EOQualifier qualifier) {
    return usuarios(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuarios(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Usuario> results;
      results = usuarios();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Usuario>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Usuario>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToUsuarios(net.formiguinhas.negocios.Usuario object) {
    includeObjectIntoPropertyWithKey(object, _Fone.USUARIOS_KEY);
  }

  public void removeFromUsuarios(net.formiguinhas.negocios.Usuario object) {
    excludeObjectFromPropertyWithKey(object, _Fone.USUARIOS_KEY);
  }

  public void addToUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Fone.LOG.isDebugEnabled()) {
      _Fone.LOG.debug("adding " + object + " to usuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fone.USUARIOS_KEY);
    }
  }

  public void removeFromUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Fone.LOG.isDebugEnabled()) {
      _Fone.LOG.debug("removing " + object + " from usuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fone.USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Usuario createUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Usuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fone.USUARIOS_KEY);
    return (net.formiguinhas.negocios.Usuario) eo;
  }

  public void deleteUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fone.USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.Usuario> objects = usuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteUsuariosRelationship(objects.nextElement());
    }
  }


  public static Fone createFone(EOEditingContext editingContext, Integer ddd
, String numero
, net.formiguinhas.enums.FoneTipo tipo
) {
    Fone eo = (Fone) EOUtilities.createAndInsertInstance(editingContext, _Fone.ENTITY_NAME);    
                eo.setDdd(ddd);
                eo.setNumero(numero);
                eo.setTipo(tipo);
    return eo;
  }

  public static ERXFetchSpecification<Fone> fetchSpec() {
    return new ERXFetchSpecification<Fone>(_Fone.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Fone> fetchAllFones(EOEditingContext editingContext) {
    return _Fone.fetchAllFones(editingContext, null);
  }

  public static NSArray<Fone> fetchAllFones(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Fone.fetchFones(editingContext, null, sortOrderings);
  }

  public static NSArray<Fone> fetchFones(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Fone> fetchSpec = new ERXFetchSpecification<Fone>(_Fone.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Fone> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Fone fetchFone(EOEditingContext editingContext, String keyName, Object value) {
    return _Fone.fetchFone(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Fone fetchFone(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Fone> eoObjects = _Fone.fetchFones(editingContext, qualifier, null);
    Fone eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Fone that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Fone fetchRequiredFone(EOEditingContext editingContext, String keyName, Object value) {
    return _Fone.fetchRequiredFone(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Fone fetchRequiredFone(EOEditingContext editingContext, EOQualifier qualifier) {
    Fone eoObject = _Fone.fetchFone(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Fone that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Fone localInstanceIn(EOEditingContext editingContext, Fone eo) {
    Fone localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}