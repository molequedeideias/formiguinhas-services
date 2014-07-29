// DO NOT EDIT.  Make changes to Usuario.java instead.
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
public abstract class _Usuario extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Usuario";

  // Attribute Keys
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  // Relationship Keys

  // Attributes
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String NOME_KEY = NOME.key();
  public static final String PASSWORD_KEY = PASSWORD.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_Usuario.class);

  public Usuario localInstanceIn(EOEditingContext editingContext) {
    Usuario localInstance = (Usuario)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String email() {
    return (String) storedValueForKey(_Usuario.EMAIL_KEY);
  }

  public void setEmail(String value) {
    if (_Usuario.LOG.isDebugEnabled()) {
            _Usuario.LOG.debug( "updating email from " + email() + " to " + value);
    }
    takeStoredValueForKey(value, _Usuario.EMAIL_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_Usuario.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_Usuario.LOG.isDebugEnabled()) {
            _Usuario.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _Usuario.LOGIN_KEY);
  }

  public String nome() {
    return (String) storedValueForKey(_Usuario.NOME_KEY);
  }

  public void setNome(String value) {
    if (_Usuario.LOG.isDebugEnabled()) {
            _Usuario.LOG.debug( "updating nome from " + nome() + " to " + value);
    }
    takeStoredValueForKey(value, _Usuario.NOME_KEY);
  }

  public String password() {
    return (String) storedValueForKey(_Usuario.PASSWORD_KEY);
  }

  public void setPassword(String value) {
    if (_Usuario.LOG.isDebugEnabled()) {
            _Usuario.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, _Usuario.PASSWORD_KEY);
  }

	// Creators  sem parâmetros
	public static Usuario createEOUsuario( EOEditingContext context )
	{
		return (Usuario) EOUtilities.createAndInsertInstance( context, ENTITY_NAME );
	}

  public static Usuario createUsuario(EOEditingContext editingContext, String email
, String login
, String nome
, String password
) {
    Usuario eo = (Usuario) EOUtilities.createAndInsertInstance(editingContext, _Usuario.ENTITY_NAME);    
                eo.setEmail(email);
                eo.setLogin(login);
                eo.setNome(nome);
                eo.setPassword(password);
    return eo;
  }

  public static ERXFetchSpecification<Usuario> fetchSpec() {
    return new ERXFetchSpecification<Usuario>(_Usuario.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Usuario> fetchAllUsuarios(EOEditingContext editingContext) {
    return _Usuario.fetchAllUsuarios(editingContext, null);
  }

  public static NSArray<Usuario> fetchAllUsuarios(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Usuario.fetchUsuarios(editingContext, null, sortOrderings);
  }

  public static NSArray<Usuario> fetchUsuarios(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Usuario> fetchSpec = new ERXFetchSpecification<Usuario>(_Usuario.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Usuario> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Usuario fetchUsuario(EOEditingContext editingContext, String keyName, Object value) {
    return _Usuario.fetchUsuario(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Usuario fetchUsuario(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Usuario> eoObjects = _Usuario.fetchUsuarios(editingContext, qualifier, null);
    Usuario eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Usuario that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Usuario fetchRequiredUsuario(EOEditingContext editingContext, String keyName, Object value) {
    return _Usuario.fetchRequiredUsuario(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Usuario fetchRequiredUsuario(EOEditingContext editingContext, EOQualifier qualifier) {
    Usuario eoObject = _Usuario.fetchUsuario(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Usuario that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Usuario localInstanceIn(EOEditingContext editingContext, Usuario eo) {
    Usuario localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<net.formiguinhas.negocios.Usuario> fetchLogin(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("login", _Usuario.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<net.formiguinhas.negocios.Usuario>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<net.formiguinhas.negocios.Usuario> fetchLogin(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("login", _Usuario.ENTITY_NAME);
    return (NSArray<net.formiguinhas.negocios.Usuario>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<net.formiguinhas.negocios.Usuario> fetchLoginSenha(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("LoginSenha", _Usuario.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<net.formiguinhas.negocios.Usuario>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<net.formiguinhas.negocios.Usuario> fetchLoginSenha(EOEditingContext editingContext,
        String loginBinding,
        String passwordBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("LoginSenha", _Usuario.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(loginBinding, "login");
    bindings.takeValueForKey(passwordBinding, "password");
        fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<net.formiguinhas.negocios.Usuario>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}