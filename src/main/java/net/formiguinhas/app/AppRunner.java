package net.formiguinhas.app;

import com.erpatcher.ERPatcherAgent;

import er.extensions.appserver.ERXApplication;

public class AppRunner {

	/**
	 * @param args
	 */
	public static void main(String argv[]) {
		ERPatcherAgent.initialize();
		ERXApplication.main(argv, Application.class);
	}

}
