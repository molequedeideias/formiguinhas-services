// DO NOT EDIT.  Make changes to Endereco.java instead.
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
public abstract class _Endereco extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Endereco";

  // Attribute Keys
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  // Relationship Keys

  // Attributes
  public static final String NOME_KEY = NOME.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_Endereco.class);

  public Endereco localInstanceIn(EOEditingContext editingContext) {
    Endereco localInstance = (Endereco)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String nome() {
    return (String) storedValueForKey(_Endereco.NOME_KEY);
  }

  public void setNome(String value) {
    if (_Endereco.LOG.isDebugEnabled()) {
            _Endereco.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _Endereco.NOME_KEY);
  }

	// Creators  sem parâmetros
	public static Endereco createEOEndereco( EOEditingContext context )
	{
		return (Endereco) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}

  public static Endereco createEndereco(EOEditingContext editingContext, String nome
) {
    Endereco eo = (Endereco) EOUtilities.createAndInsertInstance(editingContext, _Endereco.ENTITY_NAME);    
                eo.setNome(nome);
    return eo;
  }

  public static ERXFetchSpecification<Endereco> fetchSpec() {
    return new ERXFetchSpecification<Endereco>(_Endereco.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Endereco> fetchAllEnderecos(EOEditingContext editingContext) {
    return _Endereco.fetchAllEnderecos(editingContext, null);
  }

  public static NSArray<Endereco> fetchAllEnderecos(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Endereco.fetchEnderecos(editingContext, null, sortOrderings);
  }

  public static NSArray<Endereco> fetchEnderecos(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Endereco> fetchSpec = new ERXFetchSpecification<Endereco>(_Endereco.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Endereco> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Endereco fetchEndereco(EOEditingContext editingContext, String keyName, Object value) {
    return _Endereco.fetchEndereco(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Endereco fetchEndereco(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Endereco> eoObjects = _Endereco.fetchEnderecos(editingContext, qualifier, null);
    Endereco eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Endereco that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Endereco fetchRequiredEndereco(EOEditingContext editingContext, String keyName, Object value) {
    return _Endereco.fetchRequiredEndereco(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Endereco fetchRequiredEndereco(EOEditingContext editingContext, EOQualifier qualifier) {
    Endereco eoObject = _Endereco.fetchEndereco(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Endereco that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Endereco localInstanceIn(EOEditingContext editingContext, Endereco eo) {
    Endereco localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}