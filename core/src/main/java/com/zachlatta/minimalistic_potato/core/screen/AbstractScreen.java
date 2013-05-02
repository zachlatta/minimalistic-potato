package com.zachlatta.minimalistic_potato.core.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Other screens extend this.
 *
 * @author Zachary Latta
 */
public abstract class AbstractScreen implements Screen
{
    private static final boolean STRETCH = false;

    protected Stage stage;

    public AbstractScreen()
    {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(255, 255, 255, 0);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height)
    {
        stage.setViewport(width, height, STRETCH);
    }

    @Override
    public void show()
    {
    }

    @Override
    public void hide()
    {
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
