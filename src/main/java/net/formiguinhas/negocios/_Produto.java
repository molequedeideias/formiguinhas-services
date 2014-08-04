// DO NOT EDIT.  Make changes to Produto.java instead.
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
public abstract class _Produto extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Produto";

  // Attribute Keys
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  public static final ERXKey<java.math.BigDecimal> PRECO = new ERXKey<java.math.BigDecimal>("preco");
  public static final ERXKey<java.math.BigDecimal> QUANTIDADE_EM_QUE_EH_VENDIDO = new ERXKey<java.math.BigDecimal>("quantidadeEmQueEhVendido");
  public static final ERXKey<net.formiguinhas.enums.ProdutoUnidade> UNIDADE = new ERXKey<net.formiguinhas.enums.ProdutoUnidade>("unidade");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Fornecedor> FORNECEDOR = new ERXKey<net.formiguinhas.negocios.Fornecedor>("fornecedor");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeCompras> LISTAS_DE_COMPRAS = new ERXKey<net.formiguinhas.negocios.ListaDeCompras>("listasDeCompras");

  // Attributes
  public static final String NOME_KEY = NOME.key();
  public static final String PRECO_KEY = PRECO.key();
  public static final String QUANTIDADE_EM_QUE_EH_VENDIDO_KEY = QUANTIDADE_EM_QUE_EH_VENDIDO.key();
  public static final String UNIDADE_KEY = UNIDADE.key();
  // Relationships
  public static final String FORNECEDOR_KEY = FORNECEDOR.key();
  public static final String LISTAS_DE_COMPRAS_KEY = LISTAS_DE_COMPRAS.key();

  private static Logger LOG = Logger.getLogger(_Produto.class);

  public Produto localInstanceIn(EOEditingContext editingContext) {
    Produto localInstance = (Produto)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String nome() {
    return (String) storedValueForKey(_Produto.NOME_KEY);
  }

  public void setNome(String value) {
    if (_Produto.LOG.isDebugEnabled()) {
            _Produto.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _Produto.NOME_KEY);
  }

  public java.math.BigDecimal preco() {
    return (java.math.BigDecimal) storedValueForKey(_Produto.PRECO_KEY);
  }

  public void setPreco(java.math.BigDecimal value) {
    if (_Produto.LOG.isDebugEnabled()) {
            _Produto.LOG.debug( "updating preco from " + preco() + " to " + value);
    }
    takeStoredValueForKey(value, _Produto.PRECO_KEY);
  }

  public java.math.BigDecimal quantidadeEmQueEhVendido() {
    return (java.math.BigDecimal) storedValueForKey(_Produto.QUANTIDADE_EM_QUE_EH_VENDIDO_KEY);
  }

  public void setQuantidadeEmQueEhVendido(java.math.BigDecimal value) {
    if (_Produto.LOG.isDebugEnabled()) {
            _Produto.LOG.debug( "updating quantidadeEmQueEhVendido from " + quantidadeEmQueEhVendido() + " to " + value);
    }
    takeStoredValueForKey(value, _Produto.QUANTIDADE_EM_QUE_EH_VENDIDO_KEY);
  }

  public net.formiguinhas.enums.ProdutoUnidade unidade() {
    return (net.formiguinhas.enums.ProdutoUnidade) storedValueForKey(_Produto.UNIDADE_KEY);
  }

  public void setUnidade(net.formiguinhas.enums.ProdutoUnidade value) {
    if (_Produto.LOG.isDebugEnabled()) {
            _Produto.LOG.debug( "updating unidade from " + unidade() + " to " + value);
    }
    takeStoredValueForKey(value, _Produto.UNIDADE_KEY);
  }

	// Creators  sem parâmetros
	public static Produto createEOProduto( EOEditingContext context )
	{
		return (Produto) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.Fornecedor fornecedor() {
    return (net.formiguinhas.negocios.Fornecedor)storedValueForKey(_Produto.FORNECEDOR_KEY);
  }
  
  public void setFornecedor(net.formiguinhas.negocios.Fornecedor value) {
    takeStoredValueForKey(value, _Produto.FORNECEDOR_KEY);
  }

  public void setFornecedorRelationship(net.formiguinhas.negocios.Fornecedor value) {
    if (_Produto.LOG.isDebugEnabled()) {
      _Produto.LOG.debug("updating fornecedor from " + fornecedor() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setFornecedor(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Fornecedor oldValue = fornecedor();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Produto.FORNECEDOR_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _Produto.FORNECEDOR_KEY);
    }
  }
  
  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras() {
    return (NSArray<net.formiguinhas.negocios.ListaDeCompras>)storedValueForKey(_Produto.LISTAS_DE_COMPRAS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras(EOQualifier qualifier) {
    return listasDeCompras(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeCompras(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.ListaDeCompras> results;
      results = listasDeCompras();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToListasDeCompras(net.formiguinhas.negocios.ListaDeCompras object) {
    includeObjectIntoPropertyWithKey(object, _Produto.LISTAS_DE_COMPRAS_KEY);
  }

  public void removeFromListasDeCompras(net.formiguinhas.negocios.ListaDeCompras object) {
    excludeObjectFromPropertyWithKey(object, _Produto.LISTAS_DE_COMPRAS_KEY);
  }

  public void addToListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Produto.LOG.isDebugEnabled()) {
      _Produto.LOG.debug("adding " + object + " to listasDeCompras relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListasDeCompras(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Produto.LISTAS_DE_COMPRAS_KEY);
    }
  }

  public void removeFromListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Produto.LOG.isDebugEnabled()) {
      _Produto.LOG.debug("removing " + object + " from listasDeCompras relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListasDeCompras(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Produto.LISTAS_DE_COMPRAS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeCompras createListasDeComprasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeCompras.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Produto.LISTAS_DE_COMPRAS_KEY);
    return (net.formiguinhas.negocios.ListaDeCompras) eo;
  }

  public void deleteListasDeComprasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Produto.LISTAS_DE_COMPRAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListasDeComprasRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeCompras> objects = listasDeCompras().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListasDeComprasRelationship(objects.nextElement());
    }
  }


  public static Produto createProduto(EOEditingContext editingContext, String nome
, java.math.BigDecimal quantidadeEmQueEhVendido
, net.formiguinhas.negocios.Fornecedor fornecedor) {
    Produto eo = (Produto) EOUtilities.createAndInsertInstance(editingContext, _Produto.ENTITY_NAME);    
                eo.setNome(nome);
                eo.setQuantidadeEmQueEhVendido(quantidadeEmQueEhVendido);
    eo.setFornecedorRelationship(fornecedor);
    return eo;
  }

  public static ERXFetchSpecification<Produto> fetchSpec() {
    return new ERXFetchSpecification<Produto>(_Produto.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Produto> fetchAllProdutos(EOEditingContext editingContext) {
    return _Produto.fetchAllProdutos(editingContext, null);
  }

  public static NSArray<Produto> fetchAllProdutos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Produto.fetchProdutos(editingContext, null, sortOrderings);
  }

  public static NSArray<Produto> fetchProdutos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Produto> fetchSpec = new ERXFetchSpecification<Produto>(_Produto.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Produto> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Produto fetchProduto(EOEditingContext editingContext, String keyName, Object value) {
    return _Produto.fetchProduto(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Produto fetchProduto(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Produto> eoObjects = _Produto.fetchProdutos(editingContext, qualifier, null);
    Produto eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Produto that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Produto fetchRequiredProduto(EOEditingContext editingContext, String keyName, Object value) {
    return _Produto.fetchRequiredProduto(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Produto fetchRequiredProduto(EOEditingContext editingContext, EOQualifier qualifier) {
    Produto eoObject = _Produto.fetchProduto(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Produto that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Produto localInstanceIn(EOEditingContext editingContext, Produto eo) {
    Produto localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}