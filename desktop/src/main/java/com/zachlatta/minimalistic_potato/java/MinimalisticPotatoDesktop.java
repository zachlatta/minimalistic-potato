package com.zachlatta.minimalistic_potato.java;

import com.zachlatta.minimalistic_potato.core.MinimalisticPotato;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MinimalisticPotatoDesktop {
	public static void main(String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.useGL20 = true;
		new LwjglApplication(new MinimalisticPotato(), config);
	}
}
