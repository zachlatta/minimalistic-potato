package com.zachlatta.minimalistic_potato.android;

import com.zachlatta.minimalistic_potato.core.MinimalisticPotato;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MinimalisticPotatoActivity extends AndroidApplication
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.useGL20 = true;
        initialize(new MinimalisticPotato(), config);
    }
}
