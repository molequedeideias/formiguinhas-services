// DO NOT EDIT.  Make changes to ListaDeCompras.java instead.
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
public abstract class _ListaDeCompras extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ListaDeCompras";

  // Attribute Keys
  public static final ERXKey<org.joda.time.LocalDateTime> DATA_LIMITE_PARA_PEDIDOS = new ERXKey<org.joda.time.LocalDateTime>("dataLimiteParaPedidos");
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  public static final ERXKey<net.formiguinhas.enums.ListaDeComprasStatus> STATUS = new ERXKey<net.formiguinhas.enums.ListaDeComprasStatus>("status");
  public static final ERXKey<java.math.BigDecimal> VALOR_MAXIMO = new ERXKey<java.math.BigDecimal>("valorMaximo");
  public static final ERXKey<java.math.BigDecimal> VALOR_MINIMO = new ERXKey<java.math.BigDecimal>("valorMinimo");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Fornecedor> FORNECEDOR = new ERXKey<net.formiguinhas.negocios.Fornecedor>("fornecedor");
  public static final ERXKey<net.formiguinhas.negocios.Usuario> ORGANIZADOR = new ERXKey<net.formiguinhas.negocios.Usuario>("organizador");
  public static final ERXKey<net.formiguinhas.negocios.Produto> PRODUTOS = new ERXKey<net.formiguinhas.negocios.Produto>("produtos");

  // Attributes
  public static final String DATA_LIMITE_PARA_PEDIDOS_KEY = DATA_LIMITE_PARA_PEDIDOS.key();
  public static final String NOME_KEY = NOME.key();
  public static final String STATUS_KEY = STATUS.key();
  public static final String VALOR_MAXIMO_KEY = VALOR_MAXIMO.key();
  public static final String VALOR_MINIMO_KEY = VALOR_MINIMO.key();
  // Relationships
  public static final String FORNECEDOR_KEY = FORNECEDOR.key();
  public static final String ORGANIZADOR_KEY = ORGANIZADOR.key();
  public static final String PRODUTOS_KEY = PRODUTOS.key();

  private static Logger LOG = Logger.getLogger(_ListaDeCompras.class);

  public ListaDeCompras localInstanceIn(EOEditingContext editingContext) {
    ListaDeCompras localInstance = (ListaDeCompras)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public org.joda.time.LocalDateTime dataLimiteParaPedidos() {
    return (org.joda.time.LocalDateTime) storedValueForKey(_ListaDeCompras.DATA_LIMITE_PARA_PEDIDOS_KEY);
  }

  public void setDataLimiteParaPedidos(org.joda.time.LocalDateTime value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
            _ListaDeCompras.LOG.debug( "updating dataLimiteParaPedidos from " + dataLimiteParaPedidos() + " to " + value);
    }
    takeStoredValueForKey(value, _ListaDeCompras.DATA_LIMITE_PARA_PEDIDOS_KEY);
  }

  public String nome() {
    return (String) storedValueForKey(_ListaDeCompras.NOME_KEY);
  }

  public void setNome(String value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
            _ListaDeCompras.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _ListaDeCompras.NOME_KEY);
  }

  public net.formiguinhas.enums.ListaDeComprasStatus status() {
    return (net.formiguinhas.enums.ListaDeComprasStatus) storedValueForKey(_ListaDeCompras.STATUS_KEY);
  }

  public void setStatus(net.formiguinhas.enums.ListaDeComprasStatus value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
            _ListaDeCompras.LOG.debug( "updating status from " + status() + " to " + value);
    }
    takeStoredValueForKey(value, _ListaDeCompras.STATUS_KEY);
  }

  public java.math.BigDecimal valorMaximo() {
    return (java.math.BigDecimal) storedValueForKey(_ListaDeCompras.VALOR_MAXIMO_KEY);
  }

  public void setValorMaximo(java.math.BigDecimal value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
            _ListaDeCompras.LOG.debug( "updating valorMaximo from " + valorMaximo() + " to " + value);
    }
    takeStoredValueForKey(value, _ListaDeCompras.VALOR_MAXIMO_KEY);
  }

  public java.math.BigDecimal valorMinimo() {
    return (java.math.BigDecimal) storedValueForKey(_ListaDeCompras.VALOR_MINIMO_KEY);
  }

  public void setValorMinimo(java.math.BigDecimal value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
            _ListaDeCompras.LOG.debug( "updating valorMinimo from " + valorMinimo() + " to " + value);
    }
    takeStoredValueForKey(value, _ListaDeCompras.VALOR_MINIMO_KEY);
  }

	// Creators  sem parâmetros
	public static ListaDeCompras createEOListaDeCompras( EOEditingContext context )
	{
		return (ListaDeCompras) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.Fornecedor fornecedor() {
    return (net.formiguinhas.negocios.Fornecedor)storedValueForKey(_ListaDeCompras.FORNECEDOR_KEY);
  }
  
  public void setFornecedor(net.formiguinhas.negocios.Fornecedor value) {
    takeStoredValueForKey(value, _ListaDeCompras.FORNECEDOR_KEY);
  }

  public void setFornecedorRelationship(net.formiguinhas.negocios.Fornecedor value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
      _ListaDeCompras.LOG.debug("updating fornecedor from " + fornecedor() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setFornecedor(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Fornecedor oldValue = fornecedor();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ListaDeCompras.FORNECEDOR_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _ListaDeCompras.FORNECEDOR_KEY);
    }
  }
  
  public net.formiguinhas.negocios.Usuario organizador() {
    return (net.formiguinhas.negocios.Usuario)storedValueForKey(_ListaDeCompras.ORGANIZADOR_KEY);
  }
  
  public void setOrganizador(net.formiguinhas.negocios.Usuario value) {
    takeStoredValueForKey(value, _ListaDeCompras.ORGANIZADOR_KEY);
  }

  public void setOrganizadorRelationship(net.formiguinhas.negocios.Usuario value) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
      _ListaDeCompras.LOG.debug("updating organizador from " + organizador() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setOrganizador(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Usuario oldValue = organizador();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ListaDeCompras.ORGANIZADOR_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _ListaDeCompras.ORGANIZADOR_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.negocios.Produto> produtos() {
    return (NSArray<net.formiguinhas.negocios.Produto>)storedValueForKey(_ListaDeCompras.PRODUTOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos(EOQualifier qualifier) {
    return produtos(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Produto> produtos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Produto> results;
      results = produtos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Produto>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Produto>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToProdutos(net.formiguinhas.negocios.Produto object) {
    includeObjectIntoPropertyWithKey(object, _ListaDeCompras.PRODUTOS_KEY);
  }

  public void removeFromProdutos(net.formiguinhas.negocios.Produto object) {
    excludeObjectFromPropertyWithKey(object, _ListaDeCompras.PRODUTOS_KEY);
  }

  public void addToProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
      _ListaDeCompras.LOG.debug("adding " + object + " to produtos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToProdutos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ListaDeCompras.PRODUTOS_KEY);
    }
  }

  public void removeFromProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    if (_ListaDeCompras.LOG.isDebugEnabled()) {
      _ListaDeCompras.LOG.debug("removing " + object + " from produtos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromProdutos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeCompras.PRODUTOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Produto createProdutosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Produto.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ListaDeCompras.PRODUTOS_KEY);
    return (net.formiguinhas.negocios.Produto) eo;
  }

  public void deleteProdutosRelationship(net.formiguinhas.negocios.Produto object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ListaDeCompras.PRODUTOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProdutosRelationships() {
    Enumeration<net.formiguinhas.negocios.Produto> objects = produtos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProdutosRelationship(objects.nextElement());
    }
  }


  public static ListaDeCompras createListaDeCompras(EOEditingContext editingContext, String nome
, net.formiguinhas.enums.ListaDeComprasStatus status
, net.formiguinhas.negocios.Fornecedor fornecedor, net.formiguinhas.negocios.Usuario organizador) {
    ListaDeCompras eo = (ListaDeCompras) EOUtilities.createAndInsertInstance(editingContext, _ListaDeCompras.ENTITY_NAME);    
                eo.setNome(nome);
                eo.setStatus(status);
    eo.setFornecedorRelationship(fornecedor);
    eo.setOrganizadorRelationship(organizador);
    return eo;
  }

  public static ERXFetchSpecification<ListaDeCompras> fetchSpec() {
    return new ERXFetchSpecification<ListaDeCompras>(_ListaDeCompras.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<ListaDeCompras> fetchAllListaDeComprases(EOEditingContext editingContext) {
    return _ListaDeCompras.fetchAllListaDeComprases(editingContext, null);
  }

  public static NSArray<ListaDeCompras> fetchAllListaDeComprases(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ListaDeCompras.fetchListaDeComprases(editingContext, null, sortOrderings);
  }

  public static NSArray<ListaDeCompras> fetchListaDeComprases(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<ListaDeCompras> fetchSpec = new ERXFetchSpecification<ListaDeCompras>(_ListaDeCompras.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ListaDeCompras> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static ListaDeCompras fetchListaDeCompras(EOEditingContext editingContext, String keyName, Object value) {
    return _ListaDeCompras.fetchListaDeCompras(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ListaDeCompras fetchListaDeCompras(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ListaDeCompras> eoObjects = _ListaDeCompras.fetchListaDeComprases(editingContext, qualifier, null);
    ListaDeCompras eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ListaDeCompras that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ListaDeCompras fetchRequiredListaDeCompras(EOEditingContext editingContext, String keyName, Object value) {
    return _ListaDeCompras.fetchRequiredListaDeCompras(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ListaDeCompras fetchRequiredListaDeCompras(EOEditingContext editingContext, EOQualifier qualifier) {
    ListaDeCompras eoObject = _ListaDeCompras.fetchListaDeCompras(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ListaDeCompras that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ListaDeCompras localInstanceIn(EOEditingContext editingContext, ListaDeCompras eo) {
    ListaDeCompras localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}