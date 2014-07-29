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
  // Relationship Keys

  // Attributes
  // Relationships

  private static Logger LOG = Logger.getLogger(_ListaDeCompras.class);

  public ListaDeCompras localInstanceIn(EOEditingContext editingContext) {
    ListaDeCompras localInstance = (ListaDeCompras)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

	// Creators  sem parâmetros
	public static ListaDeCompras createEOListaDeCompras( EOEditingContext context )
	{
		return (ListaDeCompras) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}

  public static ListaDeCompras createListaDeCompras(EOEditingContext editingContext) {
    ListaDeCompras eo = (ListaDeCompras) EOUtilities.createAndInsertInstance(editingContext, _ListaDeCompras.ENTITY_NAME);    
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