package com.zachlatta.minimalistic_potato.html;

import com.zachlatta.minimalistic_potato.core.MinimalisticPotato;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class MinimalisticPotatoHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new MinimalisticPotato();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
