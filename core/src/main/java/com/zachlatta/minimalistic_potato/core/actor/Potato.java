package com.zachlatta.minimalistic_potato.core.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Potatos gonna potate.
 *
 * @author Zachary Latta
 */
public class Potato extends Actor
{
    private Texture texture;

    public Potato()
    {
        texture = new Texture(Gdx.files.internal("potato.png"));

        setWidth(texture.getWidth());
        setHeight(texture.getHeight());
    }

    public void draw(SpriteBatch batch)
    {
        batch.draw(texture, getX(), getY());
    }
}
