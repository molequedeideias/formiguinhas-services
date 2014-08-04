// DO NOT EDIT.  Make changes to ListaDeComprasDeUsuario.java instead.
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
public abstract class _ListaDeComprasDeUsuario extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ListaDeComprasDeUsuario";

  // Attribute Keys
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.Entrega> ENTREGAS = new ERXKey<net.formiguinhas.Entrega>("entregas");
  public static final ERXKey<net.formiguinhas.net.Pagamento> PAGAMENTOS = new ERXKey<net.formiguinhas.net.Pagamento>("pagamentos");
  public static final ERXKey<net.formiguinhas.net.ProdutoEmLista> PRODUTOS_EM_LISTAS = new ERXKey<net.formiguinhas.net.ProdutoEmLista>("produtosEmListas");
  public static final ERXKey<net.formiguinhas.TransferenciaDePagamento> TRANSFERENCIAS_DE_PAGAMENTOS = new ERXKey<net.formiguinhas.TransferenciaDePagamento>("transferenciasDePagamentos");
  public static final ERXKey<net.formiguinhas.negocios.Usuario> USUARIO = new ERXKey<net.formiguinhas.negocios.Usuario>("usuario");

  // Attributes
  // Relationships
  public static final String ENTREGAS_KEY = ENTREGAS.key();
  public static final String PAGAMENTOS_KEY = PAGAMENTOS.key();
  public static final String PRODUTOS_EM_LISTAS_KEY = PRODUTOS_EM_LISTAS.key();
  public static final String TRANSFERENCIAS_DE_PAGAMENTOS_KEY = TRANSFERENCIAS_DE_PAGAMENTOS.key();
  public static final String USUARIO_KEY = USUARIO.key();

  private static Logger LOG = Logger.getLogger(_ListaDeComprasDeUsuario.class);

  public ListaDeComprasDeUsuario localInstanceIn(EOEditingContext editingContext) {
    ListaDeComprasDeUsuario localInstance = (ListaDeComprasDeUsuario)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

	// Creators  sem parâmetros
	public static ListaDeComprasDeUsuario createEOListaDeComprasDeUsuario( EOEditingContext context )
	{
		return (ListaDeComprasDeUsuario) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.Usuario usuario() {
    return (net.formiguinhas.negocios.Usuario)storedValueForKey(_ListaDeComprasDeUsuario.USUARIO_KEY);
  }
  
  public void setUsuario(net.formiguinhas.negocios.Usuario value) {
    takeStoredValueForKey(value, _ListaDeComprasDeUsuario.USUARIO_KEY);
  }

  public void setUsuarioRelationship(net.formiguinhas.negocios.Usuario value) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("updating usuario from " + usuario() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setUsuario(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Usuario oldValue = usuario();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ListaDeComprasDeUsuario.USUARIO_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _ListaDeComprasDeUsuario.USUARIO_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.Entrega> entregas() {
    return (NSArray<net.formiguinhas.Entrega>)storedValueForKey(_ListaDeComprasDeUsuario.ENTREGAS_KEY);
  }

  public NSArray<net.formiguinhas.Entrega> entregas(EOQualifier qualifier) {
    return entregas(qualifier, null);
  }

  public NSArray<net.formiguinhas.Entrega> entregas(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.Entrega> results;
      results = entregas();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.Entrega>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.Entrega>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEntregas(net.formiguinhas.Entrega object) {
    includeObjectIntoPropertyWithKey(object, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
  }

  public void removeFromEntregas(net.formiguinhas.Entrega object) {
    excludeObjectFromPropertyWithKey(object, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
  }

  public void addToEntregasRelationship(net.formiguinhas.Entrega object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("adding " + object + " to entregas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToEntregas(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
    }
  }

  public void removeFromEntregasRelationship(net.formiguinhas.Entrega object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("removing " + object + " from entregas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromEntregas(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
    }
  }

  public net.formiguinhas.Entrega createEntregasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.Entrega.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
    return (net.formiguinhas.Entrega) eo;
  }

  public void deleteEntregasRelationship(net.formiguinhas.Entrega object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.ENTREGAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEntregasRelationships() {
    Enumeration<net.formiguinhas.Entrega> objects = entregas().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEntregasRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.net.Pagamento> pagamentos() {
    return (NSArray<net.formiguinhas.net.Pagamento>)storedValueForKey(_ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
  }

  public NSArray<net.formiguinhas.net.Pagamento> pagamentos(EOQualifier qualifier) {
    return pagamentos(qualifier, null);
  }

  public NSArray<net.formiguinhas.net.Pagamento> pagamentos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.net.Pagamento> results;
      results = pagamentos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.net.Pagamento>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.net.Pagamento>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPagamentos(net.formiguinhas.net.Pagamento object) {
    includeObjectIntoPropertyWithKey(object, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
  }

  public void removeFromPagamentos(net.formiguinhas.net.Pagamento object) {
    excludeObjectFromPropertyWithKey(object, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
  }

  public void addToPagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("adding " + object + " to pagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToPagamentos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
    }
  }

  public void removeFromPagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("removing " + object + " from pagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromPagamentos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
    }
  }

  public net.formiguinhas.net.Pagamento createPagamentosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.net.Pagamento.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
    return (net.formiguinhas.net.Pagamento) eo;
  }

  public void deletePagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PAGAMENTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPagamentosRelationships() {
    Enumeration<net.formiguinhas.net.Pagamento> objects = pagamentos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePagamentosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.net.ProdutoEmLista> produtosEmListas() {
    return (NSArray<net.formiguinhas.net.ProdutoEmLista>)storedValueForKey(_ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
  }

  public NSArray<net.formiguinhas.net.ProdutoEmLista> produtosEmListas(EOQualifier qualifier) {
    return produtosEmListas(qualifier, null);
  }

  public NSArray<net.formiguinhas.net.ProdutoEmLista> produtosEmListas(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.net.ProdutoEmLista> results;
      results = produtosEmListas();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.net.ProdutoEmLista>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.net.ProdutoEmLista>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToProdutosEmListas(net.formiguinhas.net.ProdutoEmLista object) {
    includeObjectIntoPropertyWithKey(object, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
  }

  public void removeFromProdutosEmListas(net.formiguinhas.net.ProdutoEmLista object) {
    excludeObjectFromPropertyWithKey(object, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
  }

  public void addToProdutosEmListasRelationship(net.formiguinhas.net.ProdutoEmLista object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("adding " + object + " to produtosEmListas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToProdutosEmListas(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
    }
  }

  public void removeFromProdutosEmListasRelationship(net.formiguinhas.net.ProdutoEmLista object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("removing " + object + " from produtosEmListas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromProdutosEmListas(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
    }
  }

  public net.formiguinhas.net.ProdutoEmLista createProdutosEmListasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.net.ProdutoEmLista.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
    return (net.formiguinhas.net.ProdutoEmLista) eo;
  }

  public void deleteProdutosEmListasRelationship(net.formiguinhas.net.ProdutoEmLista object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.PRODUTOS_EM_LISTAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProdutosEmListasRelationships() {
    Enumeration<net.formiguinhas.net.ProdutoEmLista> objects = produtosEmListas().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProdutosEmListasRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciasDePagamentos() {
    return (NSArray<net.formiguinhas.TransferenciaDePagamento>)storedValueForKey(_ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciasDePagamentos(EOQualifier qualifier) {
    return transferenciasDePagamentos(qualifier, null);
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciasDePagamentos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.TransferenciaDePagamento> results;
      results = transferenciasDePagamentos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.TransferenciaDePagamento>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.TransferenciaDePagamento>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToTransferenciasDePagamentos(net.formiguinhas.TransferenciaDePagamento object) {
    includeObjectIntoPropertyWithKey(object, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
  }

  public void removeFromTransferenciasDePagamentos(net.formiguinhas.TransferenciaDePagamento object) {
    excludeObjectFromPropertyWithKey(object, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
  }

  public void addToTransferenciasDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("adding " + object + " to transferenciasDePagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToTransferenciasDePagamentos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
    }
  }

  public void removeFromTransferenciasDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    if (_ListaDeComprasDeUsuario.LOG.isDebugEnabled()) {
      _ListaDeComprasDeUsuario.LOG.debug("removing " + object + " from transferenciasDePagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromTransferenciasDePagamentos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
    }
  }

  public net.formiguinhas.TransferenciaDePagamento createTransferenciasDePagamentosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.TransferenciaDePagamento.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
    return (net.formiguinhas.TransferenciaDePagamento) eo;
  }

  public void deleteTransferenciasDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeComprasDeUsuario.TRANSFERENCIAS_DE_PAGAMENTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllTransferenciasDePagamentosRelationships() {
    Enumeration<net.formiguinhas.TransferenciaDePagamento> objects = transferenciasDePagamentos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTransferenciasDePagamentosRelationship(objects.nextElement());
    }
  }


  public static ListaDeComprasDeUsuario createListaDeComprasDeUsuario(EOEditingContext editingContext, net.formiguinhas.negocios.Usuario usuario) {
    ListaDeComprasDeUsuario eo = (ListaDeComprasDeUsuario) EOUtilities.createAndInsertInstance(editingContext, _ListaDeComprasDeUsuario.ENTITY_NAME);    
    eo.setUsuarioRelationship(usuario);
    return eo;
  }

  public static ERXFetchSpecification<ListaDeComprasDeUsuario> fetchSpec() {
    return new ERXFetchSpecification<ListaDeComprasDeUsuario>(_ListaDeComprasDeUsuario.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<ListaDeComprasDeUsuario> fetchAllListaDeComprasDeUsuarios(EOEditingContext editingContext) {
    return _ListaDeComprasDeUsuario.fetchAllListaDeComprasDeUsuarios(editingContext, null);
  }

  public static NSArray<ListaDeComprasDeUsuario> fetchAllListaDeComprasDeUsuarios(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ListaDeComprasDeUsuario.fetchListaDeComprasDeUsuarios(editingContext, null, sortOrderings);
  }

  public static NSArray<ListaDeComprasDeUsuario> fetchListaDeComprasDeUsuarios(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<ListaDeComprasDeUsuario> fetchSpec = new ERXFetchSpecification<ListaDeComprasDeUsuario>(_ListaDeComprasDeUsuario.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ListaDeComprasDeUsuario> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static ListaDeComprasDeUsuario fetchListaDeComprasDeUsuario(EOEditingContext editingContext, String keyName, Object value) {
    return _ListaDeComprasDeUsuario.fetchListaDeComprasDeUsuario(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ListaDeComprasDeUsuario fetchListaDeComprasDeUsuario(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ListaDeComprasDeUsuario> eoObjects = _ListaDeComprasDeUsuario.fetchListaDeComprasDeUsuarios(editingContext, qualifier, null);
    ListaDeComprasDeUsuario eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ListaDeComprasDeUsuario that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ListaDeComprasDeUsuario fetchRequiredListaDeComprasDeUsuario(EOEditingContext editingContext, String keyName, Object value) {
    return _ListaDeComprasDeUsuario.fetchRequiredListaDeComprasDeUsuario(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ListaDeComprasDeUsuario fetchRequiredListaDeComprasDeUsuario(EOEditingContext editingContext, EOQualifier qualifier) {
    ListaDeComprasDeUsuario eoObject = _ListaDeComprasDeUsuario.fetchListaDeComprasDeUsuario(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ListaDeComprasDeUsuario that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ListaDeComprasDeUsuario localInstanceIn(EOEditingContext editingContext, ListaDeComprasDeUsuario eo) {
    ListaDeComprasDeUsuario localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}