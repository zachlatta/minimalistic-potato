package com.zachlatta.minimalistic_potato.core;

import com.badlogic.gdx.Game;
import com.zachlatta.minimalistic_potato.core.screen.GameplayScreen;

public class MinimalisticPotato extends Game
{
    public GameplayScreen gameplayScreen = new GameplayScreen();

    @Override
    public void create()
    {
        setScreen(gameplayScreen);
    }
}
