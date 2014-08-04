package net.formiguinhas.negocios;

import net.formiguinhas.enums.Profile;

import org.apache.log4j.Logger;

public class Usuario extends _Usuario {

	private Profile profile;
        @SuppressWarnings("unused")
        private static Logger log = Logger.getLogger(Usuario.class);
		/**
		 * @return the profile
		 */
		public Profile profile() {
			return profile;
		}
		/**
		 * @param profile the profile to set
		 */
		public void setProfile(Profile profile) {
			this.profile = profile;
		}
	


}