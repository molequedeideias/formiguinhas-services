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
  public static final ERXKey<String> CPF = new ERXKey<String>("cpf");
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> NOME = new ERXKey<String>("nome");
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  // Relationship Keys
  public static final ERXKey<net.formiguinhas.negocios.AcordoEntrePares> ACORDOS_PROPOSTOS_PARA_MIM = new ERXKey<net.formiguinhas.negocios.AcordoEntrePares>("acordosPropostosParaMim");
  public static final ERXKey<net.formiguinhas.negocios.AcordoEntrePares> ACORDOS_PROPOSTOS_PELO_USUARIO = new ERXKey<net.formiguinhas.negocios.AcordoEntrePares>("acordosPropostosPeloUsuario");
  public static final ERXKey<net.formiguinhas.netDadosBancarios> DADOS_BANCARIOS = new ERXKey<net.formiguinhas.netDadosBancarios>("dadosBancarios");
  public static final ERXKey<net.formiguinhas.negocios.Endereco> ENDERECOS = new ERXKey<net.formiguinhas.negocios.Endereco>("enderecos");
  public static final ERXKey<net.formiguinhas.negocios.Fone> FONES = new ERXKey<net.formiguinhas.negocios.Fone>("fones");
  public static final ERXKey<net.formiguinhas.negocios.Fornecedor> FORNECEDORES = new ERXKey<net.formiguinhas.negocios.Fornecedor>("fornecedores");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario> LISTAS_DE_COMPRAS_DE_USUARIO = new ERXKey<net.formiguinhas.negocios.ListaDeComprasDeUsuario>("listasDeComprasDeUsuario");
  public static final ERXKey<net.formiguinhas.negocios.ListaDeCompras> LISTAS_DE_COMPRAS_ORGANIZADAS = new ERXKey<net.formiguinhas.negocios.ListaDeCompras>("listasDeComprasOrganizadas");

  // Attributes
  public static final String CPF_KEY = CPF.key();
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String NOME_KEY = NOME.key();
  public static final String PASSWORD_KEY = PASSWORD.key();
  // Relationships
  public static final String ACORDOS_PROPOSTOS_PARA_MIM_KEY = ACORDOS_PROPOSTOS_PARA_MIM.key();
  public static final String ACORDOS_PROPOSTOS_PELO_USUARIO_KEY = ACORDOS_PROPOSTOS_PELO_USUARIO.key();
  public static final String DADOS_BANCARIOS_KEY = DADOS_BANCARIOS.key();
  public static final String ENDERECOS_KEY = ENDERECOS.key();
  public static final String FONES_KEY = FONES.key();
  public static final String FORNECEDORES_KEY = FORNECEDORES.key();
  public static final String LISTAS_DE_COMPRAS_DE_USUARIO_KEY = LISTAS_DE_COMPRAS_DE_USUARIO.key();
  public static final String LISTAS_DE_COMPRAS_ORGANIZADAS_KEY = LISTAS_DE_COMPRAS_ORGANIZADAS.key();

  private static Logger LOG = Logger.getLogger(_Usuario.class);

  public Usuario localInstanceIn(EOEditingContext editingContext) {
    Usuario localInstance = (Usuario)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String cpf() {
    return (String) storedValueForKey(_Usuario.CPF_KEY);
  }

  public void setCpf(String value) {
    if (_Usuario.LOG.isDebugEnabled()) {
            _Usuario.LOG.debug( "updating cpf from " + cpf() + " to " + value);
    }
    takeStoredValueForKey(value, _Usuario.CPF_KEY);
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
  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosParaMim() {
    return (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)storedValueForKey(_Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosParaMim(EOQualifier qualifier) {
    return acordosPropostosParaMim(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosParaMim(EOQualifier qualifier, boolean fetch) {
    return acordosPropostosParaMim(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosParaMim(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.AcordoEntrePares> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.AcordoEntrePares.ACEITANTE_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.AcordoEntrePares.fetchAcordoEntrePareses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = acordosPropostosParaMim();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToAcordosPropostosParaMim(net.formiguinhas.negocios.AcordoEntrePares object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
  }

  public void removeFromAcordosPropostosParaMim(net.formiguinhas.negocios.AcordoEntrePares object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
  }

  public void addToAcordosPropostosParaMimRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to acordosPropostosParaMim relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToAcordosPropostosParaMim(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
    }
  }

  public void removeFromAcordosPropostosParaMimRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from acordosPropostosParaMim relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromAcordosPropostosParaMim(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
    }
  }

  public net.formiguinhas.negocios.AcordoEntrePares createAcordosPropostosParaMimRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.AcordoEntrePares.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
    return (net.formiguinhas.negocios.AcordoEntrePares) eo;
  }

  public void deleteAcordosPropostosParaMimRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PARA_MIM_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllAcordosPropostosParaMimRelationships() {
    Enumeration<net.formiguinhas.negocios.AcordoEntrePares> objects = acordosPropostosParaMim().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAcordosPropostosParaMimRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosPeloUsuario() {
    return (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)storedValueForKey(_Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosPeloUsuario(EOQualifier qualifier) {
    return acordosPropostosPeloUsuario(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosPeloUsuario(EOQualifier qualifier, boolean fetch) {
    return acordosPropostosPeloUsuario(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.AcordoEntrePares> acordosPropostosPeloUsuario(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.AcordoEntrePares> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.AcordoEntrePares.PROPONENTE_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.AcordoEntrePares.fetchAcordoEntrePareses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = acordosPropostosPeloUsuario();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.AcordoEntrePares>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToAcordosPropostosPeloUsuario(net.formiguinhas.negocios.AcordoEntrePares object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
  }

  public void removeFromAcordosPropostosPeloUsuario(net.formiguinhas.negocios.AcordoEntrePares object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
  }

  public void addToAcordosPropostosPeloUsuarioRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to acordosPropostosPeloUsuario relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToAcordosPropostosPeloUsuario(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
    }
  }

  public void removeFromAcordosPropostosPeloUsuarioRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from acordosPropostosPeloUsuario relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromAcordosPropostosPeloUsuario(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
    }
  }

  public net.formiguinhas.negocios.AcordoEntrePares createAcordosPropostosPeloUsuarioRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.AcordoEntrePares.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
    return (net.formiguinhas.negocios.AcordoEntrePares) eo;
  }

  public void deleteAcordosPropostosPeloUsuarioRelationship(net.formiguinhas.negocios.AcordoEntrePares object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ACORDOS_PROPOSTOS_PELO_USUARIO_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllAcordosPropostosPeloUsuarioRelationships() {
    Enumeration<net.formiguinhas.negocios.AcordoEntrePares> objects = acordosPropostosPeloUsuario().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAcordosPropostosPeloUsuarioRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.netDadosBancarios> dadosBancarios() {
    return (NSArray<net.formiguinhas.netDadosBancarios>)storedValueForKey(_Usuario.DADOS_BANCARIOS_KEY);
  }

  public NSArray<net.formiguinhas.netDadosBancarios> dadosBancarios(EOQualifier qualifier) {
    return dadosBancarios(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.netDadosBancarios> dadosBancarios(EOQualifier qualifier, boolean fetch) {
    return dadosBancarios(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.netDadosBancarios> dadosBancarios(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.netDadosBancarios> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.netDadosBancarios.USUARIO_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.netDadosBancarios.fetchDadosBancarioses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = dadosBancarios();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.netDadosBancarios>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.netDadosBancarios>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDadosBancarios(net.formiguinhas.netDadosBancarios object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.DADOS_BANCARIOS_KEY);
  }

  public void removeFromDadosBancarios(net.formiguinhas.netDadosBancarios object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.DADOS_BANCARIOS_KEY);
  }

  public void addToDadosBancariosRelationship(net.formiguinhas.netDadosBancarios object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to dadosBancarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToDadosBancarios(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.DADOS_BANCARIOS_KEY);
    }
  }

  public void removeFromDadosBancariosRelationship(net.formiguinhas.netDadosBancarios object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from dadosBancarios relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromDadosBancarios(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.DADOS_BANCARIOS_KEY);
    }
  }

  public net.formiguinhas.netDadosBancarios createDadosBancariosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.netDadosBancarios.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.DADOS_BANCARIOS_KEY);
    return (net.formiguinhas.netDadosBancarios) eo;
  }

  public void deleteDadosBancariosRelationship(net.formiguinhas.netDadosBancarios object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.DADOS_BANCARIOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDadosBancariosRelationships() {
    Enumeration<net.formiguinhas.netDadosBancarios> objects = dadosBancarios().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDadosBancariosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Endereco> enderecos() {
    return (NSArray<net.formiguinhas.negocios.Endereco>)storedValueForKey(_Usuario.ENDERECOS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Endereco> enderecos(EOQualifier qualifier) {
    return enderecos(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Endereco> enderecos(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Endereco> results;
      results = enderecos();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Endereco>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Endereco>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEnderecos(net.formiguinhas.negocios.Endereco object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.ENDERECOS_KEY);
  }

  public void removeFromEnderecos(net.formiguinhas.negocios.Endereco object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.ENDERECOS_KEY);
  }

  public void addToEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to enderecos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToEnderecos(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.ENDERECOS_KEY);
    }
  }

  public void removeFromEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from enderecos relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromEnderecos(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ENDERECOS_KEY);
    }
  }

  public net.formiguinhas.negocios.Endereco createEnderecosRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Endereco.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.ENDERECOS_KEY);
    return (net.formiguinhas.negocios.Endereco) eo;
  }

  public void deleteEnderecosRelationship(net.formiguinhas.negocios.Endereco object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.ENDERECOS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEnderecosRelationships() {
    Enumeration<net.formiguinhas.negocios.Endereco> objects = enderecos().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEnderecosRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones() {
    return (NSArray<net.formiguinhas.negocios.Fone>)storedValueForKey(_Usuario.FONES_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones(EOQualifier qualifier) {
    return fones(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Fone> fones(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Fone> results;
      results = fones();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Fone>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Fone>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToFones(net.formiguinhas.negocios.Fone object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.FONES_KEY);
  }

  public void removeFromFones(net.formiguinhas.negocios.Fone object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.FONES_KEY);
  }

  public void addToFonesRelationship(net.formiguinhas.negocios.Fone object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to fones relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToFones(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.FONES_KEY);
    }
  }

  public void removeFromFonesRelationship(net.formiguinhas.negocios.Fone object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from fones relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromFones(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.FONES_KEY);
    }
  }

  public net.formiguinhas.negocios.Fone createFonesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Fone.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.FONES_KEY);
    return (net.formiguinhas.negocios.Fone) eo;
  }

  public void deleteFonesRelationship(net.formiguinhas.negocios.Fone object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.FONES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllFonesRelationships() {
    Enumeration<net.formiguinhas.negocios.Fone> objects = fones().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteFonesRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores() {
    return (NSArray<net.formiguinhas.negocios.Fornecedor>)storedValueForKey(_Usuario.FORNECEDORES_KEY);
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores(EOQualifier qualifier) {
    return fornecedores(qualifier, null);
  }

  public NSArray<net.formiguinhas.negocios.Fornecedor> fornecedores(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<net.formiguinhas.negocios.Fornecedor> results;
      results = fornecedores();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.Fornecedor>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.Fornecedor>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToFornecedores(net.formiguinhas.negocios.Fornecedor object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.FORNECEDORES_KEY);
  }

  public void removeFromFornecedores(net.formiguinhas.negocios.Fornecedor object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.FORNECEDORES_KEY);
  }

  public void addToFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to fornecedores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToFornecedores(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.FORNECEDORES_KEY);
    }
  }

  public void removeFromFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from fornecedores relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromFornecedores(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.FORNECEDORES_KEY);
    }
  }

  public net.formiguinhas.negocios.Fornecedor createFornecedoresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.Fornecedor.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.FORNECEDORES_KEY);
    return (net.formiguinhas.negocios.Fornecedor) eo;
  }

  public void deleteFornecedoresRelationship(net.formiguinhas.negocios.Fornecedor object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.FORNECEDORES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllFornecedoresRelationships() {
    Enumeration<net.formiguinhas.negocios.Fornecedor> objects = fornecedores().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteFornecedoresRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuario() {
    return (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)storedValueForKey(_Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuario(EOQualifier qualifier) {
    return listasDeComprasDeUsuario(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuario(EOQualifier qualifier, boolean fetch) {
    return listasDeComprasDeUsuario(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> listasDeComprasDeUsuario(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.ListaDeComprasDeUsuario.USUARIO_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.ListaDeComprasDeUsuario.fetchListaDeComprasDeUsuarios(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = listasDeComprasDeUsuario();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeComprasDeUsuario>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToListasDeComprasDeUsuario(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
  }

  public void removeFromListasDeComprasDeUsuario(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
  }

  public void addToListasDeComprasDeUsuarioRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to listasDeComprasDeUsuario relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListasDeComprasDeUsuario(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
    }
  }

  public void removeFromListasDeComprasDeUsuarioRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from listasDeComprasDeUsuario relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListasDeComprasDeUsuario(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeComprasDeUsuario createListasDeComprasDeUsuarioRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeComprasDeUsuario.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
    return (net.formiguinhas.negocios.ListaDeComprasDeUsuario) eo;
  }

  public void deleteListasDeComprasDeUsuarioRelationship(net.formiguinhas.negocios.ListaDeComprasDeUsuario object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_DE_USUARIO_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListasDeComprasDeUsuarioRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeComprasDeUsuario> objects = listasDeComprasDeUsuario().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListasDeComprasDeUsuarioRelationship(objects.nextElement());
    }
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeComprasOrganizadas() {
    return (NSArray<net.formiguinhas.negocios.ListaDeCompras>)storedValueForKey(_Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeComprasOrganizadas(EOQualifier qualifier) {
    return listasDeComprasOrganizadas(qualifier, null, false);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeComprasOrganizadas(EOQualifier qualifier, boolean fetch) {
    return listasDeComprasOrganizadas(qualifier, null, fetch);
  }

  public NSArray<net.formiguinhas.negocios.ListaDeCompras> listasDeComprasOrganizadas(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<net.formiguinhas.negocios.ListaDeCompras> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(net.formiguinhas.negocios.ListaDeCompras.ORGANIZADOR_KEY, EOQualifier.QualifierOperatorEqual, this);
            
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = net.formiguinhas.negocios.ListaDeCompras.fetchListaDeComprases(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = listasDeComprasOrganizadas();
      if (qualifier != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<net.formiguinhas.negocios.ListaDeCompras>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToListasDeComprasOrganizadas(net.formiguinhas.negocios.ListaDeCompras object) {
    includeObjectIntoPropertyWithKey(object, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
  }

  public void removeFromListasDeComprasOrganizadas(net.formiguinhas.negocios.ListaDeCompras object) {
    excludeObjectFromPropertyWithKey(object, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
  }

  public void addToListasDeComprasOrganizadasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("adding " + object + " to listasDeComprasOrganizadas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            addToListasDeComprasOrganizadas(object);
    }
    else {
            addObjectToBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
    }
  }

  public void removeFromListasDeComprasOrganizadasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    if (_Usuario.LOG.isDebugEnabled()) {
      _Usuario.LOG.debug("removing " + object + " from listasDeComprasOrganizadas relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
            removeFromListasDeComprasOrganizadas(object);
    }
    else {
            removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
    }
  }

  public net.formiguinhas.negocios.ListaDeCompras createListasDeComprasOrganizadasRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( net.formiguinhas.negocios.ListaDeCompras.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
    return (net.formiguinhas.negocios.ListaDeCompras) eo;
  }

  public void deleteListasDeComprasOrganizadasRelationship(net.formiguinhas.negocios.ListaDeCompras object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Usuario.LISTAS_DE_COMPRAS_ORGANIZADAS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListasDeComprasOrganizadasRelationships() {
    Enumeration<net.formiguinhas.negocios.ListaDeCompras> objects = listasDeComprasOrganizadas().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListasDeComprasOrganizadasRelationship(objects.nextElement());
    }
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