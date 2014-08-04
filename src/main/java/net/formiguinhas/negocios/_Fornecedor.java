// DO NOT EDIT.  Make changes to Fornecedor.java instead.
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
public abstract class _Fornecedor extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Fornecedor";

  // Attribute Keys
  public static final ERXKey<String> CNPJ = new ERXKey<String>("cnpj");
  public static final ERXKey<String> INSCRICAO_ESTADUAL = new ERXKey<String>("inscricaoEstadual");
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Endereco> ENDERECOS = new ERXKey<net.formiguinhas.negocios.Endereco>("enderecos");
  public static final ERXKey<net.formiguinhas.negocios.Fone> FONES = new ERXKey<net.formiguinhas.negocios.Fone>("fones");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeCompras> LISTAS_DE_COMPRAS = new ERXKey<net.formiguinhas.negocios.ListaDeCompras>("listasDeCompras");
  public static final ERXKey<net.formiguinhas.negocios.Produto> PRODUTOS = new ERXKey<net.formiguinhas.negocios.Produto>("produtos");
  public static final ERXKey<net.formiguinhas.negocios.Usuario> USUARIOS_ADMINISTRADORES = new ERXKey<net.formiguinhas.negocios.Usuario>("usuariosAdministradores");

  // Attributes
  public static final String CNPJ_KEY = CNPJ.key();
  public static final String INSCRICAO_ESTADUAL_KEY = INSCRICAO_ESTADUAL.key();
  public static final String NOME_KEY = NOME.key();
  // Relationships
  public static final String ENDERECOS_KEY = ENDERECOS.key();
  public static final String FONES_KEY = FONES.key();
  public static final String LISTAS_DE_COMPRAS_KEY = LISTAS_DE_COMPRAS.key();
  public static final String PRODUTOS_KEY = PRODUTOS.key();
  public static final String USUARIOS_ADMINISTRADORES_KEY = USUARIOS_ADMINISTRADORES.key();

  private static Logger LOG = Logger.getLogger(_Fornecedor.class);

  public Fornecedor localInstanceIn(EOEditingContext editingContext) {
    Fornecedor localInstance = (Fornecedor)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cnpj() {
    return (String) storedValueForKey(_Fornecedor.CNPJ_KEY);
  }

  public void setCnpj(String value) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
            _Fornecedor.LOG.debug( "updating cnpj from " + cnpj() + " to " + value);
    }
    takeStoredValueForKey(value, _Fornecedor.CNPJ_KEY);
  }

  public String inscricaoEstadual() {
    return (String) storedValueForKey(_Fornecedor.INSCRICAO_ESTADUAL_KEY);
  }

  public void setInscricaoEstadual(String value) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
            _Fornecedor.LOG.debug( "updating inscricaoEstadual from " + inscricaoEstadual() + " to " + value);
    }
    takeStoredValueForKey(value, _Fornecedor.INSCRICAO_ESTADUAL_KEY);
  }

  public String nome() {
    return (String) storedValueForKey(_Fornecedor.NOME_KEY);
  }

  public void setNome(String value) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
            _Fornecedor.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _Fornecedor.NOME_KEY);
  }

	// Creators  sem parâmetros
	public static Fornecedor createEOFornecedor( EOEditingContext context )
	{
		return (Fornecedor) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public NSArray<net.formiguinhas.negocios.Endereco> enderecos() {
    return (NSArray<net.formiguinhas.negocios.Endereco>)storedValueForKey(_Fornecedor.ENDERECOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Endereco> enderecos(EOQualifier qualifier) {
    return enderecos(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Endereco> enderecos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Endereco> results;
      results = enderecos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Endereco>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Endereco>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEnderecos(net.formiguinhas.negocios.Endereco object) {
    includeObjectIntoPropertyWithKey(object, _Fornecedor.ENDERECOS_KEY);
  }

  public void removeFromEnderecos(net.formiguinhas.negocios.Endereco object) {
    excludeObjectFromPropertyWithKey(object, _Fornecedor.ENDERECOS_KEY);
  }

  public void addToEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("adding " + object + " to enderecos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToEnderecos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fornecedor.ENDERECOS_KEY);
    }
  }

  public void removeFromEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("removing " + object + " from enderecos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromEnderecos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.ENDERECOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Endereco createEnderecosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Endereco.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fornecedor.ENDERECOS_KEY);
    return (net.formiguinhas.negocios.Endereco) eo;
  }

  public void deleteEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.ENDERECOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEnderecosRelationships() {
    Enumeration<net.formiguinhas.negocios.Endereco> objects = enderecos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEnderecosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones() {
    return (NSArray<net.formiguinhas.negocios.Fone>)storedValueForKey(_Fornecedor.FONES_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones(EOQualifier qualifier) {
    return fones(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Fone> results;
      results = fones();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Fone>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Fone>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToFones(net.formiguinhas.negocios.Fone object) {
    includeObjectIntoPropertyWithKey(object, _Fornecedor.FONES_KEY);
  }

  public void removeFromFones(net.formiguinhas.negocios.Fone object) {
    excludeObjectFromPropertyWithKey(object, _Fornecedor.FONES_KEY);
  }

  public void addToFonesRelationship(net.formiguinhas.negocios.Fone object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("adding " + object + " to fones relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToFones(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fornecedor.FONES_KEY);
    }
  }

  public void removeFromFonesRelationship(net.formiguinhas.negocios.Fone object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("removing " + object + " from fones relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromFones(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.FONES_KEY);
    }
  }

  public net.formiguinhas.negocios.Fone createFonesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Fone.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fornecedor.FONES_KEY);
    return (net.formiguinhas.negocios.Fone) eo;
  }

  public void deleteFonesRelationship(net.formiguinhas.negocios.Fone object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.FONES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllFonesRelationships() {
    Enumeration<net.formiguinhas.negocios.Fone> objects = fones().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteFonesRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras() {
    return (NSArray<net.formiguinhas.negocios.ListaDeCompras>)storedValueForKey(_Fornecedor.LISTAS_DE_COMPRAS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras(EOQualifier qualifier) {
    return listasDeCompras(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras(EOQualifier qualifier, boolean fetch) {
    return listasDeCompras(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.ListaDeCompras> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.ListaDeCompras.FORNECEDOR_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.ListaDeCompras.fetchListaDeComprases(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = listasDeCompras();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToListasDeCompras(net.formiguinhas.negocios.ListaDeCompras object) {
    includeObjectIntoPropertyWithKey(object, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
  }

  public void removeFromListasDeCompras(net.formiguinhas.negocios.ListaDeCompras object) {
    excludeObjectFromPropertyWithKey(object, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
  }

  public void addToListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("adding " + object + " to listasDeCompras relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListasDeCompras(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
    }
  }

  public void removeFromListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("removing " + object + " from listasDeCompras relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListasDeCompras(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeCompras createListasDeComprasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeCompras.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
    return (net.formiguinhas.negocios.ListaDeCompras) eo;
  }

  public void deleteListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.LISTAS_DE_COMPRAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListasDeComprasRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeCompras> objects = listasDeCompras().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListasDeComprasRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos() {
    return (NSArray<net.formiguinhas.negocios.Produto>)storedValueForKey(_Fornecedor.PRODUTOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos(EOQualifier qualifier) {
    return produtos(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos(EOQualifier qualifier, boolean fetch) {
    return produtos(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.Produto> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.Produto.FORNECEDOR_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.Produto.fetchProdutos(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = produtos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Produto>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Produto>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProdutos(net.formiguinhas.negocios.Produto object) {
    includeObjectIntoPropertyWithKey(object, _Fornecedor.PRODUTOS_KEY);
  }

  public void removeFromProdutos(net.formiguinhas.negocios.Produto object) {
    excludeObjectFromPropertyWithKey(object, _Fornecedor.PRODUTOS_KEY);
  }

  public void addToProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("adding " + object + " to produtos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToProdutos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fornecedor.PRODUTOS_KEY);
    }
  }

  public void removeFromProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("removing " + object + " from produtos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromProdutos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.PRODUTOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Produto createProdutosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Produto.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fornecedor.PRODUTOS_KEY);
    return (net.formiguinhas.negocios.Produto) eo;
  }

  public void deleteProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.PRODUTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProdutosRelationships() {
    Enumeration<net.formiguinhas.negocios.Produto> objects = produtos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProdutosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuariosAdministradores() {
    return (NSArray<net.formiguinhas.negocios.Usuario>)storedValueForKey(_Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuariosAdministradores(EOQualifier qualifier) {
    return usuariosAdministradores(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Usuario> usuariosAdministradores(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Usuario> results;
      results = usuariosAdministradores();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Usuario>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Usuario>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToUsuariosAdministradores(net.formiguinhas.negocios.Usuario object) {
    includeObjectIntoPropertyWithKey(object, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
  }

  public void removeFromUsuariosAdministradores(net.formiguinhas.negocios.Usuario object) {
    excludeObjectFromPropertyWithKey(object, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
  }

  public void addToUsuariosAdministradoresRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("adding " + object + " to usuariosAdministradores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToUsuariosAdministradores(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
    }
  }

  public void removeFromUsuariosAdministradoresRelationship(net.formiguinhas.negocios.Usuario object) {
    if (_Fornecedor.LOG.isDebugEnabled()) {
      _Fornecedor.LOG.debug("removing " + object + " from usuariosAdministradores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromUsuariosAdministradores(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
    }
  }

  public net.formiguinhas.negocios.Usuario createUsuariosAdministradoresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Usuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
    return (net.formiguinhas.negocios.Usuario) eo;
  }

  public void deleteUsuariosAdministradoresRelationship(net.formiguinhas.negocios.Usuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Fornecedor.USUARIOS_ADMINISTRADORES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllUsuariosAdministradoresRelationships() {
    Enumeration<net.formiguinhas.negocios.Usuario> objects = usuariosAdministradores().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteUsuariosAdministradoresRelationship(objects.nextElement());
    }
  }


  public static Fornecedor createFornecedor(EOEditingContext editingContext, String nome
) {
    Fornecedor eo = (Fornecedor) EOUtilities.createAndInsertInstance(editingContext, _Fornecedor.ENTITY_NAME);    
                eo.setNome(nome);
    return eo;
  }

  public static ERXFetchSpecification<Fornecedor> fetchSpec() {
    return new ERXFetchSpecification<Fornecedor>(_Fornecedor.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Fornecedor> fetchAllFornecedors(EOEditingContext editingContext) {
    return _Fornecedor.fetchAllFornecedors(editingContext, null);
  }

  public static NSArray<Fornecedor> fetchAllFornecedors(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Fornecedor.fetchFornecedors(editingContext, null, sortOrderings);
  }

  public static NSArray<Fornecedor> fetchFornecedors(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Fornecedor> fetchSpec = new ERXFetchSpecification<Fornecedor>(_Fornecedor.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Fornecedor> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Fornecedor fetchFornecedor(EOEditingContext editingContext, String keyName, Object value) {
    return _Fornecedor.fetchFornecedor(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Fornecedor fetchFornecedor(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Fornecedor> eoObjects = _Fornecedor.fetchFornecedors(editingContext, qualifier, null);
    Fornecedor eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Fornecedor that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Fornecedor fetchRequiredFornecedor(EOEditingContext editingContext, String keyName, Object value) {
    return _Fornecedor.fetchRequiredFornecedor(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Fornecedor fetchRequiredFornecedor(EOEditingContext editingContext, EOQualifier qualifier) {
    Fornecedor eoObject = _Fornecedor.fetchFornecedor(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Fornecedor that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Fornecedor localInstanceIn(EOEditingContext editingContext, Fornecedor eo) {
    Fornecedor localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}