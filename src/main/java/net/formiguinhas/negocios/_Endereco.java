// DO NOT EDIT.  Make changes to Endereco.java instead.
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
public abstract class _Endereco extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Endereco";

  // Attribute Keys
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.Entrega> ENTREGAS = new ERXKey<net.formiguinhas.Entrega>("entregas");
  public static final ERXKey<net.formiguinhas.negocios.Fornecedor> FORNECEDORES = new ERXKey<net.formiguinhas.negocios.Fornecedor>("fornecedores");
  public static final ERXKey<net.formiguinhas.negocios.Usuario> USUARIOS = new ERXKey<net.formiguinhas.negocios.Usuario>("usuarios");

  // Attributes
  public static final String NOME_KEY = NOME.key();
  // Relationships
  public static final String ENTREGAS_KEY = ENTREGAS.key();
  public static final String FORNECEDORES_KEY = FORNECEDORES.key();
  public static final String USUARIOS_KEY = USUARIOS.key();

  private static Logger LOG = Logger.getLogger(_Endereco.class);

  public Endereco localInstanceIn(EOEditingContext editingContext) {
    Endereco localInstance = (Endereco)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String nome() {
    return (String) storedValueForKey(_Endereco.NOME_KEY);
  }

  public void setNome(String value) {
    if (_Endereco.LOG.isDebugEnabled()) {
            _Endereco.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _Endereco.NOME_KEY);
  }

	// Creators  sem parâmetros
	public static Endereco createEOEndereco( EOEditingContext context )
	{
		return (Endereco) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public NSArray<net.formiguinhas.Entrega> entregas() {
    return (NSArray<net.formiguinhas.Entrega>)storedValueForKey(_Endereco.ENTREGAS_KEY);
  }

  public NSArray<net.formiguinhas.Entrega> entregas(EOQualifier qualifier) {
    return entregas(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.Entrega> entregas(EOQualifier qualifier, boolean fetch) {
    return entregas(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.Entrega> entregas(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.Entrega> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.Entrega.ENDERECO_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.Entrega.fetchEntregas(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = entregas();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.Entrega>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.Entrega>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEntregas(net.formiguinhas.Entrega object) {
    includeObjectIntoPropertyWithKey(object, _Endereco.ENTREGAS_KEY);
  }

  public void removeFromEntregas(net.formiguinhas.Entrega object) {
    excludeObjectFromPropertyWithKey(object, _Endereco.ENTREGAS_KEY);
  }

  public void addToEntregasRelationship(net.formiguinhas.Entrega object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("adding " + object + " to entregas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToEntregas(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Endereco.ENTREGAS_KEY);
    }
  }

  public void removeFromEntregasRelationship(net.formiguinhas.Entrega object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("removing " + object + " from entregas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromEntregas(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.ENTREGAS_KEY);
    }
  }

  public net.formiguinhas.Entrega createEntregasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.Entrega.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Endereco.ENTREGAS_KEY);
    return (net.formiguinhas.Entrega) eo;
  }

  public void deleteEntregasRelationship(net.formiguinhas.Entrega object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.ENTREGAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEntregasRelationships() {
    Enumeration<net.formiguinhas.Entrega> objects = entregas().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEntregasRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores() {
    return (NSArray<net.formiguinhas.negocios.Fornecedor>)storedValueForKey(_Endereco.FORNECEDORES_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores(EOQualifier qualifier) {
    return fornecedores(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Fornecedor> results;
      results = fornecedores();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Fornecedor>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Fornecedor>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToFornecedores(net.formiguinhas.negocios.Fornecedor object) {
    includeObjectIntoPropertyWithKey(object, _Endereco.FORNECEDORES_KEY);
  }

  public void removeFromFornecedores(net.formiguinhas.negocios.Fornecedor object) {
    excludeObjectFromPropertyWithKey(object, _Endereco.FORNECEDORES_KEY);
  }

  public void addToFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("adding " + object + " to fornecedores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToFornecedores(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Endereco.FORNECEDORES_KEY);
    }
  }

  public void removeFromFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("removing " + object + " from fornecedores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromFornecedores(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.FORNECEDORES_KEY);
    }
  }

  public net.formiguinhas.negocios.Fornecedor createFornecedoresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Fornecedor.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Endereco.FORNECEDORES_KEY);
    return (net.formiguinhas.negocios.Fornecedor) eo;
  }

  public void deleteFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.FORNECEDORES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllFornecedoresRelationships() {
    Enumeration<net.formiguinhas.negocios.Fornecedor> objects = fornecedores().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteFornecedoresRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuarios() {
    return (NSArray<net.formiguinhas.negocios.Usuario>)storedValueForKey(_Endereco.USUARIOS_KEY);
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
    includeObjectIntoPropertyWithKey(object, _Endereco.USUARIOS_KEY);
  }

  public void removeFromUsuarios(net.formiguinhas.negocios.Usuario object) {
    excludeObjectFromPropertyWithKey(object, _Endereco.USUARIOS_KEY);
  }

  public void addToUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("adding " + object + " to usuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Endereco.USUARIOS_KEY);
    }
  }

  public void removeFromUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Endereco.LOG.isDebugEnabled()) {
      _Endereco.LOG.debug("removing " + object + " from usuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Usuario createUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Usuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Endereco.USUARIOS_KEY);
    return (net.formiguinhas.negocios.Usuario) eo;
  }

  public void deleteUsuariosRelationship(net.formiguinhas.negocios.Usuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Endereco.USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.Usuario> objects = usuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteUsuariosRelationship(objects.nextElement());
    }
  }


  public static Endereco createEndereco(EOEditingContext editingContext, String nome
) {
    Endereco eo = (Endereco) EOUtilities.createAndInsertInstance(editingContext, _Endereco.ENTITY_NAME);    
                eo.setNome(nome);
    return eo;
  }

  public static ERXFetchSpecification<Endereco> fetchSpec() {
    return new ERXFetchSpecification<Endereco>(_Endereco.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Endereco> fetchAllEnderecos(EOEditingContext editingContext) {
    return _Endereco.fetchAllEnderecos(editingContext, null);
  }

  public static NSArray<Endereco> fetchAllEnderecos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Endereco.fetchEnderecos(editingContext, null, sortOrderings);
  }

  public static NSArray<Endereco> fetchEnderecos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Endereco> fetchSpec = new ERXFetchSpecification<Endereco>(_Endereco.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Endereco> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Endereco fetchEndereco(EOEditingContext editingContext, String keyName, Object value) {
    return _Endereco.fetchEndereco(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Endereco fetchEndereco(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Endereco> eoObjects = _Endereco.fetchEnderecos(editingContext, qualifier, null);
    Endereco eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Endereco that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Endereco fetchRequiredEndereco(EOEditingContext editingContext, String keyName, Object value) {
    return _Endereco.fetchRequiredEndereco(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Endereco fetchRequiredEndereco(EOEditingContext editingContext, EOQualifier qualifier) {
    Endereco eoObject = _Endereco.fetchEndereco(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Endereco that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Endereco localInstanceIn(EOEditingContext editingContext, Endereco eo) {
    Endereco localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}