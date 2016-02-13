package com.corimi.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.corimi.utils.Global;

/**
 * Created by timi on 12.02.2016.
 */
public class MyScreen implements Screen{
    OrthographicCamera camera;
    Batch batch;

    public MyScreen() {
        camera = new OrthographicCamera();
        camera.position.set(Global.SCREEN_WIDTH/2f, Global.SCREEN_HEIGHT/2f, 0);
        camera.update();
        batch = new SpriteBatch();
        batch.setProjectionMatrix(camera.combined);
        Global.setShapeRenderer(camera);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
