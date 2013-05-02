package com.zachlatta.minimalistic_potato.core.screen;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.zachlatta.minimalistic_potato.core.actor.Potato;

/**
 * The all-awesome and encompassing gameplay takes
 * place here.
 *
 * @author Zachary Latta
 */
public class GameplayScreen extends AbstractScreen
{
    /**
     * Spudnik, our hero.
     */
    private Actor spudnik = new Potato();

    /**
     * Constructor that centers
     */
    public GameplayScreen()
    {
        // Center spudnik
        spudnik.setX(stage.getWidth() / 2 - spudnik.getWidth() / 2);
        spudnik.setY(stage.getHeight() / 2 - spudnik.getHeight() / 2);
        spudnik.addListener(new InputListener()
        {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
            {
                return true;
            }
            public void touchUp(InputEvent event, float x, float y, int pointer, int button)
            {
                MoveToAction action = new MoveToAction();
                action.setPosition(x + spudnik.getX() - spudnik.getWidth() / 2,
                                   y + spudnik.getY() - spudnik.getHeight() / 2);
                action.setDuration(1);
                action.setInterpolation(Interpolation.exp5);
                spudnik.addAction(action);
            }
        });
        stage.addActor(spudnik);
    }
}
