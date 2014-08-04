// DO NOT EDIT.  Make changes to TransferenciaDePagamento.java instead.
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
public abstract class _TransferenciaDePagamento extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "TransferenciaDePagamento";

  // Attribute Keys
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.AcordoEntrePares> ACORDO_ENTRE_PARES = new ERXKey<net.formiguinhas.negocios.AcordoEntrePares>("acordoEntrePares");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario> LISTA_DE_COMPRAS_DE_USUARIOS = new ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario>("listaDeComprasDeUsuarios");
  public static final ERXKey<net.formiguinhas.net.Pagamento> PAGAMENTOS = new ERXKey<net.formiguinhas.net.Pagamento>("pagamentos");

  // Attributes
  // Relationships
  public static final String ACORDO_ENTRE_PARES_KEY = ACORDO_ENTRE_PARES.key();
  public static final String LISTA_DE_COMPRAS_DE_USUARIOS_KEY = LISTA_DE_COMPRAS_DE_USUARIOS.key();
  public static final String PAGAMENTOS_KEY = PAGAMENTOS.key();

  private static Logger LOG = Logger.getLogger(_TransferenciaDePagamento.class);

  public TransferenciaDePagamento localInstanceIn(EOEditingContext editingContext) {
    TransferenciaDePagamento localInstance = (TransferenciaDePagamento)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

	// Creators  sem parâmetros
	public static TransferenciaDePagamento createEOTransferenciaDePagamento( EOEditingContext context )
	{
		return (TransferenciaDePagamento) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.AcordoEntrePares acordoEntrePares() {
    return (net.formiguinhas.negocios.AcordoEntrePares)storedValueForKey(_TransferenciaDePagamento.ACORDO_ENTRE_PARES_KEY);
  }
  
  public void setAcordoEntrePares(net.formiguinhas.negocios.AcordoEntrePares value) {
    takeStoredValueForKey(value, _TransferenciaDePagamento.ACORDO_ENTRE_PARES_KEY);
  }

  public void setAcordoEntreParesRelationship(net.formiguinhas.negocios.AcordoEntrePares value) {
    if (_TransferenciaDePagamento.LOG.isDebugEnabled()) {
      _TransferenciaDePagamento.LOG.debug("updating acordoEntrePares from " + acordoEntrePares() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setAcordoEntrePares(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.AcordoEntrePares oldValue = acordoEntrePares();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _TransferenciaDePagamento.ACORDO_ENTRE_PARES_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _TransferenciaDePagamento.ACORDO_ENTRE_PARES_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listaDeComprasDeUsuarios() {
    return (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)storedValueForKey(_TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listaDeComprasDeUsuarios(EOQualifier qualifier) {
    return listaDeComprasDeUsuarios(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listaDeComprasDeUsuarios(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> results;
      results = listaDeComprasDeUsuarios();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToListaDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    includeObjectIntoPropertyWithKey(object, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void removeFromListaDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    excludeObjectFromPropertyWithKey(object, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void addToListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_TransferenciaDePagamento.LOG.isDebugEnabled()) {
      _TransferenciaDePagamento.LOG.debug("adding " + object + " to listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListaDeComprasDeUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public void removeFromListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_TransferenciaDePagamento.LOG.isDebugEnabled()) {
      _TransferenciaDePagamento.LOG.debug("removing " + object + " from listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListaDeComprasDeUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeComprasDeUsuario createListaDeComprasDeUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeComprasDeUsuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    return (net.formiguinhas.negocios.ListaDeComprasDeUsuario) eo;
  }

  public void deleteListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListaDeComprasDeUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeComprasDeUsuario> objects = listaDeComprasDeUsuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListaDeComprasDeUsuariosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.net.Pagamento> pagamentos() {
    return (NSArray<net.formiguinhas.net.Pagamento>)storedValueForKey(_TransferenciaDePagamento.PAGAMENTOS_KEY);
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
    includeObjectIntoPropertyWithKey(object, _TransferenciaDePagamento.PAGAMENTOS_KEY);
  }

  public void removeFromPagamentos(net.formiguinhas.net.Pagamento object) {
    excludeObjectFromPropertyWithKey(object, _TransferenciaDePagamento.PAGAMENTOS_KEY);
  }

  public void addToPagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    if (_TransferenciaDePagamento.LOG.isDebugEnabled()) {
      _TransferenciaDePagamento.LOG.debug("adding " + object + " to pagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToPagamentos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.PAGAMENTOS_KEY);
    }
  }

  public void removeFromPagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    if (_TransferenciaDePagamento.LOG.isDebugEnabled()) {
      _TransferenciaDePagamento.LOG.debug("removing " + object + " from pagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromPagamentos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.PAGAMENTOS_KEY);
    }
  }

  public net.formiguinhas.net.Pagamento createPagamentosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.net.Pagamento.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _TransferenciaDePagamento.PAGAMENTOS_KEY);
    return (net.formiguinhas.net.Pagamento) eo;
  }

  public void deletePagamentosRelationship(net.formiguinhas.net.Pagamento object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _TransferenciaDePagamento.PAGAMENTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPagamentosRelationships() {
    Enumeration<net.formiguinhas.net.Pagamento> objects = pagamentos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePagamentosRelationship(objects.nextElement());
    }
  }


  public static TransferenciaDePagamento createTransferenciaDePagamento(EOEditingContext editingContext, net.formiguinhas.negocios.AcordoEntrePares acordoEntrePares) {
    TransferenciaDePagamento eo = (TransferenciaDePagamento) EOUtilities.createAndInsertInstance(editingContext, _TransferenciaDePagamento.ENTITY_NAME);    
    eo.setAcordoEntreParesRelationship(acordoEntrePares);
    return eo;
  }

  public static ERXFetchSpecification<TransferenciaDePagamento> fetchSpec() {
    return new ERXFetchSpecification<TransferenciaDePagamento>(_TransferenciaDePagamento.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<TransferenciaDePagamento> fetchAllTransferenciaDePagamentos(EOEditingContext editingContext) {
    return _TransferenciaDePagamento.fetchAllTransferenciaDePagamentos(editingContext, null);
  }

  public static NSArray<TransferenciaDePagamento> fetchAllTransferenciaDePagamentos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _TransferenciaDePagamento.fetchTransferenciaDePagamentos(editingContext, null, sortOrderings);
  }

  public static NSArray<TransferenciaDePagamento> fetchTransferenciaDePagamentos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<TransferenciaDePagamento> fetchSpec = new ERXFetchSpecification<TransferenciaDePagamento>(_TransferenciaDePagamento.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<TransferenciaDePagamento> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static TransferenciaDePagamento fetchTransferenciaDePagamento(EOEditingContext editingContext, String keyName, Object value) {
    return _TransferenciaDePagamento.fetchTransferenciaDePagamento(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TransferenciaDePagamento fetchTransferenciaDePagamento(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<TransferenciaDePagamento> eoObjects = _TransferenciaDePagamento.fetchTransferenciaDePagamentos(editingContext, qualifier, null);
    TransferenciaDePagamento eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one TransferenciaDePagamento that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TransferenciaDePagamento fetchRequiredTransferenciaDePagamento(EOEditingContext editingContext, String keyName, Object value) {
    return _TransferenciaDePagamento.fetchRequiredTransferenciaDePagamento(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static TransferenciaDePagamento fetchRequiredTransferenciaDePagamento(EOEditingContext editingContext, EOQualifier qualifier) {
    TransferenciaDePagamento eoObject = _TransferenciaDePagamento.fetchTransferenciaDePagamento(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no TransferenciaDePagamento that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static TransferenciaDePagamento localInstanceIn(EOEditingContext editingContext, TransferenciaDePagamento eo) {
    TransferenciaDePagamento localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}