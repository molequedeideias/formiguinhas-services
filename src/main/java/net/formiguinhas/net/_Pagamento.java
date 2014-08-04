// DO NOT EDIT.  Make changes to Pagamento.java instead.
package net.formiguinhas.net;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Pagamento extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Pagamento";

  // Attribute Keys
  public static final ERXKey<java.math.BigDecimal> VALOR = new ERXKey<java.math.BigDecimal>("valor");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.AcordoEntrePares> ACORDO = new ERXKey<net.formiguinhas.negocios.AcordoEntrePares>("acordo");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario> LISTA_DE_COMPRAS_DE_USUARIOS = new ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario>("listaDeComprasDeUsuarios");
  public static final ERXKey<net.formiguinhas.TransferenciaDePagamento> TRANSFERENCIA_DE_PAGAMENTOS = new ERXKey<net.formiguinhas.TransferenciaDePagamento>("transferenciaDePagamentos");

  // Attributes
  public static final String VALOR_KEY = VALOR.key();
  // Relationships
  public static final String ACORDO_KEY = ACORDO.key();
  public static final String LISTA_DE_COMPRAS_DE_USUARIOS_KEY = LISTA_DE_COMPRAS_DE_USUARIOS.key();
  public static final String TRANSFERENCIA_DE_PAGAMENTOS_KEY = TRANSFERENCIA_DE_PAGAMENTOS.key();

  private static Logger LOG = Logger.getLogger(_Pagamento.class);

  public Pagamento localInstanceIn(EOEditingContext editingContext) {
    Pagamento localInstance = (Pagamento)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public java.math.BigDecimal valor() {
    return (java.math.BigDecimal) storedValueForKey(_Pagamento.VALOR_KEY);
  }

  public void setValor(java.math.BigDecimal value) {
    if (_Pagamento.LOG.isDebugEnabled()) {
            _Pagamento.LOG.debug( "updating valor from " + valor() + " to " + value);
    }
    takeStoredValueForKey(value, _Pagamento.VALOR_KEY);
  }

	// Creators  sem parâmetros
	public static Pagamento createEOPagamento( EOEditingContext context )
	{
		return (Pagamento) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.AcordoEntrePares acordo() {
    return (net.formiguinhas.negocios.AcordoEntrePares)storedValueForKey(_Pagamento.ACORDO_KEY);
  }
  
  public void setAcordo(net.formiguinhas.negocios.AcordoEntrePares value) {
    takeStoredValueForKey(value, _Pagamento.ACORDO_KEY);
  }

  public void setAcordoRelationship(net.formiguinhas.negocios.AcordoEntrePares value) {
    if (_Pagamento.LOG.isDebugEnabled()) {
      _Pagamento.LOG.debug("updating acordo from " + acordo() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setAcordo(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.AcordoEntrePares oldValue = acordo();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Pagamento.ACORDO_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _Pagamento.ACORDO_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listaDeComprasDeUsuarios() {
    return (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)storedValueForKey(_Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
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
    includeObjectIntoPropertyWithKey(object, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void removeFromListaDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    excludeObjectFromPropertyWithKey(object, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void addToListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Pagamento.LOG.isDebugEnabled()) {
      _Pagamento.LOG.debug("adding " + object + " to listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListaDeComprasDeUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public void removeFromListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Pagamento.LOG.isDebugEnabled()) {
      _Pagamento.LOG.debug("removing " + object + " from listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListaDeComprasDeUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeComprasDeUsuario createListaDeComprasDeUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeComprasDeUsuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    return (net.formiguinhas.negocios.ListaDeComprasDeUsuario) eo;
  }

  public void deleteListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Pagamento.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListaDeComprasDeUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeComprasDeUsuario> objects = listaDeComprasDeUsuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListaDeComprasDeUsuariosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciaDePagamentos() {
    return (NSArray<net.formiguinhas.TransferenciaDePagamento>)storedValueForKey(_Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciaDePagamentos(EOQualifier qualifier) {
    return transferenciaDePagamentos(qualifier, null);
  }

  public NSArray<net.formiguinhas.TransferenciaDePagamento> transferenciaDePagamentos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.TransferenciaDePagamento> results;
      results = transferenciaDePagamentos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.TransferenciaDePagamento>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.TransferenciaDePagamento>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToTransferenciaDePagamentos(net.formiguinhas.TransferenciaDePagamento object) {
    includeObjectIntoPropertyWithKey(object, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
  }

  public void removeFromTransferenciaDePagamentos(net.formiguinhas.TransferenciaDePagamento object) {
    excludeObjectFromPropertyWithKey(object, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
  }

  public void addToTransferenciaDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    if (_Pagamento.LOG.isDebugEnabled()) {
      _Pagamento.LOG.debug("adding " + object + " to transferenciaDePagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToTransferenciaDePagamentos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
    }
  }

  public void removeFromTransferenciaDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    if (_Pagamento.LOG.isDebugEnabled()) {
      _Pagamento.LOG.debug("removing " + object + " from transferenciaDePagamentos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromTransferenciaDePagamentos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
    }
  }

  public net.formiguinhas.TransferenciaDePagamento createTransferenciaDePagamentosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.TransferenciaDePagamento.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
    return (net.formiguinhas.TransferenciaDePagamento) eo;
  }

  public void deleteTransferenciaDePagamentosRelationship(net.formiguinhas.TransferenciaDePagamento object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Pagamento.TRANSFERENCIA_DE_PAGAMENTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllTransferenciaDePagamentosRelationships() {
    Enumeration<net.formiguinhas.TransferenciaDePagamento> objects = transferenciaDePagamentos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTransferenciaDePagamentosRelationship(objects.nextElement());
    }
  }


  public static Pagamento createPagamento(EOEditingContext editingContext, java.math.BigDecimal valor
, net.formiguinhas.negocios.AcordoEntrePares acordo) {
    Pagamento eo = (Pagamento) EOUtilities.createAndInsertInstance(editingContext, _Pagamento.ENTITY_NAME);    
                eo.setValor(valor);
    eo.setAcordoRelationship(acordo);
    return eo;
  }

  public static ERXFetchSpecification<Pagamento> fetchSpec() {
    return new ERXFetchSpecification<Pagamento>(_Pagamento.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Pagamento> fetchAllPagamentos(EOEditingContext editingContext) {
    return _Pagamento.fetchAllPagamentos(editingContext, null);
  }

  public static NSArray<Pagamento> fetchAllPagamentos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Pagamento.fetchPagamentos(editingContext, null, sortOrderings);
  }

  public static NSArray<Pagamento> fetchPagamentos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Pagamento> fetchSpec = new ERXFetchSpecification<Pagamento>(_Pagamento.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Pagamento> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Pagamento fetchPagamento(EOEditingContext editingContext, String keyName, Object value) {
    return _Pagamento.fetchPagamento(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Pagamento fetchPagamento(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Pagamento> eoObjects = _Pagamento.fetchPagamentos(editingContext, qualifier, null);
    Pagamento eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Pagamento that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Pagamento fetchRequiredPagamento(EOEditingContext editingContext, String keyName, Object value) {
    return _Pagamento.fetchRequiredPagamento(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Pagamento fetchRequiredPagamento(EOEditingContext editingContext, EOQualifier qualifier) {
    Pagamento eoObject = _Pagamento.fetchPagamento(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Pagamento that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Pagamento localInstanceIn(EOEditingContext editingContext, Pagamento eo) {
    Pagamento localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}