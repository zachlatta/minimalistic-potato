package com.zachlatta.minimalistic_potato.core;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.zachlatta.minimalistic_potato.core.actor.Potato;

public class MinimalisticPotato implements ApplicationListener
{
    private Stage stage;
    private Actor potato;

    @Override
    public void create()
    {
        stage = new Stage();
        potato = new Potato();

        potato.setX(stage.getWidth() / 2);
        potato.setY(stage.getHeight() / 2);

        potato.addListener(new InputListener()
        {
            public void touchUp(InputEvent event, float x, float y, int pointer, int button)
            {
                MoveToAction action = new MoveToAction();
                action.setPosition(x + potato.getX() - potato.getWidth() / 2,
                                   y + potato.getY() - potato.getHeight() / 2);
                action.setDuration(1);
                action.setInterpolation(Interpolation.exp5);

                potato.addAction(action);
            }
        });

        stage.addActor(potato);
    }

    @Override
    public void resize(int width, int height)
    {
    }

    @Override
    public void render()
    {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        stage.draw();
    }

    @Override
    public void pause()
    {
    }

    @Override
    public void resume()
    {
    }

    @Override
    public void dispose()
    {
        stage.dispose();
    }
}
