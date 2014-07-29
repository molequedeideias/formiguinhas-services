/**
 *
 */
package net.formiguinhas.delegates;

import net.formiguinhas.negocios.Usuario;

import org.apache.log4j.Logger;

import com.webobjects.eoaccess.ERXEntity;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSSet;

import er.extensions.eof.ERXGenericRecord;
import er.extensions.eof.ERXGuardedObjectInterface;
import er.extensions.foundation.ERXProperties;

/**
 * @author nlessa
 *
 */
public class CanUpdateDelegate {

	 private static Logger LOG = Logger.getLogger(CanUpdateDelegate.class);


	public static String PROFILE_OVERULE_ACTIVATE_PROPERTY = "delegates.CanUpdateDelegate.profile_overule_activate";


	private static boolean delegateAtivo() {
		return ERXProperties.booleanForKeyWithDefault(PROFILE_OVERULE_ACTIVATE_PROPERTY, false);
	}

	public CanUpdateDelegate() {
		super();
	}

	/* (non-Javadoc)
	 * @see er.extensions.eof.ERXGuardedObjectInterface#canDelete()
	 */
	public static boolean canDelete(boolean resultadoCanDeleteObjetoAnalisado, Usuario quemEstaRealizandoOperacao ) {

		LOG.debug("resultadoCanDeleteObjetoAnalisado: " + resultadoCanDeleteObjetoAnalisado);

		if(resultadoCanDeleteObjetoAnalisado) {
			return resultadoCanDeleteObjetoAnalisado;
		}
		else if (delegateAtivo() && quemEstaRealizandoOperacao != null) {
				return ((quemEstaRealizandoOperacao.profile() != null)? quemEstaRealizandoOperacao.profile().name().equals("Super_Administrador"):false);
		}
		else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see er.extensions.eof.ERXGuardedObjectInterface#canUpdate()
	 */
	public static boolean canUpdate(boolean resultadoCanUpdateObjetoAnalisado, Usuario quemEstaRealizandoOperacao ) {
		LOG.debug("resultadoCanUpdateObjetoAnalisado: " + resultadoCanUpdateObjetoAnalisado);

		if(resultadoCanUpdateObjetoAnalisado) {

			return resultadoCanUpdateObjetoAnalisado;
		}
		else if (delegateAtivo() && quemEstaRealizandoOperacao != null) {
				return ((quemEstaRealizandoOperacao.profile() != null)? quemEstaRealizandoOperacao.profile().name().equals("Super_Administrador"):false);
		}
		else {
			return false;
		}
	}


	public static boolean canUpdate(ERXGenericRecord objeto,boolean resultadoCanUpdateObjetoAnalisado, Usuario quemEstaRealizandoOperacao) {

		if (resultadoCanUpdateObjetoAnalisado) {
			LOG.debug("resultadoCanUpdateObjetoAnalisado: " + resultadoCanUpdateObjetoAnalisado);
			return resultadoCanUpdateObjetoAnalisado;
		}
		else {
			if (canUpdateKeysEvaluation(objeto)) {
				return true;
			}
			else {
				if (delegateAtivo() && quemEstaRealizandoOperacao != null) {
					return ((quemEstaRealizandoOperacao.profile() != null)? quemEstaRealizandoOperacao.profile().name().equals("Super_Administrador"):false);
				}
				return false;
			}
		}

	}

	public static boolean canUpdateKeysEvaluation(ERXGenericRecord objeto) {
		ERXEntity entity = (ERXEntity) objeto.entity();
		NSSet canUpdateKeys = new NSSet((NSArray) entity.userInfo().valueForKey("CanUpdateKeys"));
		LOG.debug("canUpdateKeys: " + canUpdateKeys);

		if (canUpdateKeys.count() > 0) {
			NSArray atributosMudaram = objeto.changesFromCommittedSnapshot().allKeys();

			LOG.debug("atributosMudaram: " + atributosMudaram);

			return atributosMudaram.count() > 0?canUpdateKeys.containsAll(atributosMudaram):false;
		}
		else
			return false;
	}


	public static boolean canUpdate(ERXGuardedObjectInterface objetoDelegado) {

		return objetoDelegado.canUpdate();

	}

	public static boolean canDelete(ERXGuardedObjectInterface objetoDelegado) {

		return objetoDelegado.canDelete();

	}

}
