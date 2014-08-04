// DO NOT EDIT.  Make changes to ProdutoEmLista.java instead.
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
public abstract class _ProdutoEmLista extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ProdutoEmLista";

  // Attribute Keys
  public static final ERXKey<java.math.BigDecimal> PRECO = new ERXKey<java.math.BigDecimal>("preco");
  public static final ERXKey<java.math.BigDecimal> QUANTIDADE_EM_QUE_EH_VENDIDO = new ERXKey<java.math.BigDecimal>("quantidadeEmQueEhVendido");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario> LISTA_DE_COMPRAS_DE_USUARIOS = new ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario>("listaDeComprasDeUsuarios");

  // Attributes
  public static final String PRECO_KEY = PRECO.key();
  public static final String QUANTIDADE_EM_QUE_EH_VENDIDO_KEY = QUANTIDADE_EM_QUE_EH_VENDIDO.key();
  // Relationships
  public static final String LISTA_DE_COMPRAS_DE_USUARIOS_KEY = LISTA_DE_COMPRAS_DE_USUARIOS.key();

  private static Logger LOG = Logger.getLogger(_ProdutoEmLista.class);

  public ProdutoEmLista localInstanceIn(EOEditingContext editingContext) {
    ProdutoEmLista localInstance = (ProdutoEmLista)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public java.math.BigDecimal preco() {
    return (java.math.BigDecimal) storedValueForKey(_ProdutoEmLista.PRECO_KEY);
  }

  public void setPreco(java.math.BigDecimal value) {
    if (_ProdutoEmLista.LOG.isDebugEnabled()) {
            _ProdutoEmLista.LOG.debug( "updating preco from " + preco() + " to " + value);
    }
    takeStoredValueForKey(value, _ProdutoEmLista.PRECO_KEY);
  }

  public java.math.BigDecimal quantidadeEmQueEhVendido() {
    return (java.math.BigDecimal) storedValueForKey(_ProdutoEmLista.QUANTIDADE_EM_QUE_EH_VENDIDO_KEY);
  }

  public void setQuantidadeEmQueEhVendido(java.math.BigDecimal value) {
    if (_ProdutoEmLista.LOG.isDebugEnabled()) {
            _ProdutoEmLista.LOG.debug( "updating quantidadeEmQueEhVendido from " + quantidadeEmQueEhVendido() + " to " + value);
    }
    takeStoredValueForKey(value, _ProdutoEmLista.QUANTIDADE_EM_QUE_EH_VENDIDO_KEY);
  }

	// Creators  sem parâmetros
	public static ProdutoEmLista createEOProdutoEmLista( EOEditingContext context )
	{
		return (ProdutoEmLista) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listaDeComprasDeUsuarios() {
    return (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)storedValueForKey(_ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
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
    includeObjectIntoPropertyWithKey(object, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void removeFromListaDeComprasDeUsuarios(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    excludeObjectFromPropertyWithKey(object, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
  }

  public void addToListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_ProdutoEmLista.LOG.isDebugEnabled()) {
      _ProdutoEmLista.LOG.debug("adding " + object + " to listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListaDeComprasDeUsuarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public void removeFromListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_ProdutoEmLista.LOG.isDebugEnabled()) {
      _ProdutoEmLista.LOG.debug("removing " + object + " from listaDeComprasDeUsuarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListaDeComprasDeUsuarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeComprasDeUsuario createListaDeComprasDeUsuariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeComprasDeUsuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    return (net.formiguinhas.negocios.ListaDeComprasDeUsuario) eo;
  }

  public void deleteListaDeComprasDeUsuariosRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ProdutoEmLista.LISTA_DE_COMPRAS_DE_USUARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListaDeComprasDeUsuariosRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeComprasDeUsuario> objects = listaDeComprasDeUsuarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListaDeComprasDeUsuariosRelationship(objects.nextElement());
    }
  }


  public static ProdutoEmLista createProdutoEmLista(EOEditingContext editingContext, java.math.BigDecimal preco
, java.math.BigDecimal quantidadeEmQueEhVendido
) {
    ProdutoEmLista eo = (ProdutoEmLista) EOUtilities.createAndInsertInstance(editingContext, _ProdutoEmLista.ENTITY_NAME);    
                eo.setPreco(preco);
                eo.setQuantidadeEmQueEhVendido(quantidadeEmQueEhVendido);
    return eo;
  }

  public static ERXFetchSpecification<ProdutoEmLista> fetchSpec() {
    return new ERXFetchSpecification<ProdutoEmLista>(_ProdutoEmLista.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<ProdutoEmLista> fetchAllProdutoEmListas(EOEditingContext editingContext) {
    return _ProdutoEmLista.fetchAllProdutoEmListas(editingContext, null);
  }

  public static NSArray<ProdutoEmLista> fetchAllProdutoEmListas(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ProdutoEmLista.fetchProdutoEmListas(editingContext, null, sortOrderings);
  }

  public static NSArray<ProdutoEmLista> fetchProdutoEmListas(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<ProdutoEmLista> fetchSpec = new ERXFetchSpecification<ProdutoEmLista>(_ProdutoEmLista.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<ProdutoEmLista> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static ProdutoEmLista fetchProdutoEmLista(EOEditingContext editingContext, String keyName, Object value) {
    return _ProdutoEmLista.fetchProdutoEmLista(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ProdutoEmLista fetchProdutoEmLista(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<ProdutoEmLista> eoObjects = _ProdutoEmLista.fetchProdutoEmListas(editingContext, qualifier, null);
    ProdutoEmLista eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ProdutoEmLista that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ProdutoEmLista fetchRequiredProdutoEmLista(EOEditingContext editingContext, String keyName, Object value) {
    return _ProdutoEmLista.fetchRequiredProdutoEmLista(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static ProdutoEmLista fetchRequiredProdutoEmLista(EOEditingContext editingContext, EOQualifier qualifier) {
    ProdutoEmLista eoObject = _ProdutoEmLista.fetchProdutoEmLista(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ProdutoEmLista that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static ProdutoEmLista localInstanceIn(EOEditingContext editingContext, ProdutoEmLista eo) {
    ProdutoEmLista localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}