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
  // Relationship Keys

  // Attributes
  // Relationships

  private static Logger LOG = Logger.getLogger(_Produto.class);

  public Produto localInstanceIn(EOEditingContext editingContext) {
    Produto localInstance = (Produto)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

	// Creators  sem parâmetros
	public static Produto createEOProduto( EOEditingContext context )
	{
		return (Produto) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}

  public static Produto createProduto(EOEditingContext editingContext) {
    Produto eo = (Produto) EOUtilities.createAndInsertInstance(editingContext, _Produto.ENTITY_NAME);    
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