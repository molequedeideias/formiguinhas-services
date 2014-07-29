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
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  // Relationship Keys

  // Attributes
  public static final String NOME_KEY = NOME.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_Fornecedor.class);

  public Fornecedor localInstanceIn(EOEditingContext editingContext) {
    Fornecedor localInstance = (Fornecedor)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
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