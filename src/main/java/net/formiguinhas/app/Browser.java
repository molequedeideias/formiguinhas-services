package net.formiguinhas.app;
//
// Browser
// Project DocRef
//
// Created by nlessa on Mon Apr 05 2004
//

import com.webobjects.foundation.NSDictionary;

import er.extensions.appserver.ERXBasicBrowser;

public class Browser extends ERXBasicBrowser
{
	public Browser( String browserName, String version, String mozillaVersion, String platform, NSDictionary userInfo )
	{
		super( browserName, version, mozillaVersion, platform, userInfo );
	}

	public boolean doesHandleCSSLineHeightCorrectly()
	{
		return !doesHandleCSSLineHeightIncorrectly();
	}

	public boolean doesHandleCSSLineHeightIncorrectly()
	{
		return ( isNetscape() && isMozilla40Compatible() ) || ( isOmniWeb() && isVersion4() );
	}

	public boolean isSupportedBrowser()
	{
		return true;
	}
}
