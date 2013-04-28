package com.zachlatta.minimalistic_potato.core;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.zachlatta.minimalistic_potato.core.actor.Potato;

public class MinimalisticPotato implements ApplicationListener
{
    private static final boolean KEEP_ASPECT_RATIO = false;

    private Stage stage;
    private Actor potato;

    @Override
    public void create()
    {
        stage = new Stage();
        potato = new Potato();

        // Center dat potato
        potato.setX(stage.getWidth() / 2 - potato.getWidth() / 2);
        potato.setY(stage.getHeight() / 2 - potato.getHeight() / 2);

        stage.addActor(potato);

        for(final Actor actor : stage.getActors())
        {
            actor.addListener(new InputListener()
            {
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
                {
                    return true;
                }

                public void touchUp(InputEvent event, float x, float y, int pointer, int button)
                {
                    MoveToAction action = new MoveToAction();
                    action.setPosition(x + actor.getX() - actor.getWidth() / 2,
                                       y + actor.getY() - actor.getHeight() / 2);
                    action.setDuration(1);
                    action.setInterpolation(Interpolation.exp5);
                    actor.addAction(action);
                }
            });
        }

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void resize(int width, int height)
    {
        stage.setViewport(width, height, KEEP_ASPECT_RATIO);
    }

    @Override
    public void render()
    {
        Gdx.gl.glClearColor(MathUtils.randomBoolean() ? 1 : 0, MathUtils.randomBoolean() ? 1 : 0,
                MathUtils.randomBoolean() ? 1 : 0, 0);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

        if(MathUtils.random() > .99)
        {
            final Actor actor = new Potato();

            actor.setX(MathUtils.random(stage.getWidth() - actor.getWidth()));
            actor.setY(MathUtils.random(stage.getHeight() - actor.getHeight()));

            actor.addListener(new InputListener()
            {
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
                {
                    return true;
                }

                public void touchUp(InputEvent event, float x, float y, int pointer, int button)
                {
                    MoveToAction action = new MoveToAction();
                    action.setPosition(x + actor.getX() - actor.getWidth() / 2,
                            y + actor.getY() - actor.getHeight() / 2);
                    action.setDuration(1);
                    action.setInterpolation(Interpolation.exp5);
                    actor.addAction(action);
                }
            });

            stage.addActor(actor);
        }

        for (final Actor actor : stage.getActors())
        {
            if(actor.getActions().size == 0)
            {
                MoveToAction action = new MoveToAction();
                action.setPosition(MathUtils.random(stage.getWidth() - actor.getWidth()),
                        MathUtils.random(stage.getHeight() - actor.getHeight()));
                action.setDuration(.5f);
                action.setInterpolation(Interpolation.exp5);
                actor.addAction(action);
            }
        }
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
