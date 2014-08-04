// DO NOT EDIT.  Make changes to AcordoEntrePares.java instead.
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
public abstract class _AcordoEntrePares extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "AcordoEntrePares";

  // Attribute Keys
  public static final ERXKey<net.formiguinhas.enums.AcordoStatus> STATUS = new ERXKey<net.formiguinhas.enums.AcordoStatus>("status");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.Usuario> ACEITANTE = new ERXKey<net.formiguinhas.negocios.Usuario>("aceitante");
  public static final ERXKey<net.formiguinhas.negocios.Usuario> PROPONENTE = new ERXKey<net.formiguinhas.negocios.Usuario>("proponente");

  // Attributes
  public static final String STATUS_KEY = STATUS.key();
  // Relationships
  public static final String ACEITANTE_KEY = ACEITANTE.key();
  public static final String PROPONENTE_KEY = PROPONENTE.key();

  private static Logger LOG = Logger.getLogger(_AcordoEntrePares.class);

  public AcordoEntrePares localInstanceIn(EOEditingContext editingContext) {
    AcordoEntrePares localInstance = (AcordoEntrePares)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public net.formiguinhas.enums.AcordoStatus status() {
    return (net.formiguinhas.enums.AcordoStatus) storedValueForKey(_AcordoEntrePares.STATUS_KEY);
  }

  public void setStatus(net.formiguinhas.enums.AcordoStatus value) {
    if (_AcordoEntrePares.LOG.isDebugEnabled()) {
            _AcordoEntrePares.LOG.debug( "updating status from " + status() + " to " + value);
    }
    takeStoredValueForKey(value, _AcordoEntrePares.STATUS_KEY);
  }

	// Creators  sem parâmetros
	public static AcordoEntrePares createEOAcordoEntrePares( EOEditingContext context )
	{
		return (AcordoEntrePares) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}
  public net.formiguinhas.negocios.Usuario aceitante() {
    return (net.formiguinhas.negocios.Usuario)storedValueForKey(_AcordoEntrePares.ACEITANTE_KEY);
  }
  
  public void setAceitante(net.formiguinhas.negocios.Usuario value) {
    takeStoredValueForKey(value, _AcordoEntrePares.ACEITANTE_KEY);
  }

  public void setAceitanteRelationship(net.formiguinhas.negocios.Usuario value) {
    if (_AcordoEntrePares.LOG.isDebugEnabled()) {
      _AcordoEntrePares.LOG.debug("updating aceitante from " + aceitante() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setAceitante(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Usuario oldValue = aceitante();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _AcordoEntrePares.ACEITANTE_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _AcordoEntrePares.ACEITANTE_KEY);
    }
  }
  
  public net.formiguinhas.negocios.Usuario proponente() {
    return (net.formiguinhas.negocios.Usuario)storedValueForKey(_AcordoEntrePares.PROPONENTE_KEY);
  }
  
  public void setProponente(net.formiguinhas.negocios.Usuario value) {
    takeStoredValueForKey(value, _AcordoEntrePares.PROPONENTE_KEY);
  }

  public void setProponenteRelationship(net.formiguinhas.negocios.Usuario value) {
    if (_AcordoEntrePares.LOG.isDebugEnabled()) {
      _AcordoEntrePares.LOG.debug("updating proponente from " + proponente() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            setProponente(value);
    }
    else if (value == null) {
            net.formiguinhas.negocios.Usuario oldValue = proponente();
            if (oldValue != null) {
                    removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _AcordoEntrePares.PROPONENTE_KEY);
      }
    } else {
            addObjectToBothSidesOfRelationshipWithKey(value, _AcordoEntrePares.PROPONENTE_KEY);
    }
  }
  

  public static AcordoEntrePares createAcordoEntrePares(EOEditingContext editingContext, net.formiguinhas.enums.AcordoStatus status
, net.formiguinhas.negocios.Usuario aceitante, net.formiguinhas.negocios.Usuario proponente) {
    AcordoEntrePares eo = (AcordoEntrePares) EOUtilities.createAndInsertInstance(editingContext, _AcordoEntrePares.ENTITY_NAME);    
                eo.setStatus(status);
    eo.setAceitanteRelationship(aceitante);
    eo.setProponenteRelationship(proponente);
    return eo;
  }

  public static ERXFetchSpecification<AcordoEntrePares> fetchSpec() {
    return new ERXFetchSpecification<AcordoEntrePares>(_AcordoEntrePares.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<AcordoEntrePares> fetchAllAcordoEntrePareses(EOEditingContext editingContext) {
    return _AcordoEntrePares.fetchAllAcordoEntrePareses(editingContext, null);
  }

  public static NSArray<AcordoEntrePares> fetchAllAcordoEntrePareses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _AcordoEntrePares.fetchAcordoEntrePareses(editingContext, null, sortOrderings);
  }

  public static NSArray<AcordoEntrePares> fetchAcordoEntrePareses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<AcordoEntrePares> fetchSpec = new ERXFetchSpecification<AcordoEntrePares>(_AcordoEntrePares.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<AcordoEntrePares> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static AcordoEntrePares fetchAcordoEntrePares(EOEditingContext editingContext, String keyName, Object value) {
    return _AcordoEntrePares.fetchAcordoEntrePares(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AcordoEntrePares fetchAcordoEntrePares(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<AcordoEntrePares> eoObjects = _AcordoEntrePares.fetchAcordoEntrePareses(editingContext, qualifier, null);
    AcordoEntrePares eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one AcordoEntrePares that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AcordoEntrePares fetchRequiredAcordoEntrePares(EOEditingContext editingContext, String keyName, Object value) {
    return _AcordoEntrePares.fetchRequiredAcordoEntrePares(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static AcordoEntrePares fetchRequiredAcordoEntrePares(EOEditingContext editingContext, EOQualifier qualifier) {
    AcordoEntrePares eoObject = _AcordoEntrePares.fetchAcordoEntrePares(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no AcordoEntrePares that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static AcordoEntrePares localInstanceIn(EOEditingContext editingContext, AcordoEntrePares eo) {
    AcordoEntrePares localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}