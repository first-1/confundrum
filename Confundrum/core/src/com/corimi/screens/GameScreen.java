package com.corimi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.corimi.utils.Global;

/**
 * Created by timi on 12.02.2016.
 */
public class GameScreen extends MyScreen{

    public GameScreen() {
        super();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor( 0, 1, 1, 1 );
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Global.drawSquircle(super.batch, Color.BROWN, 5, 5, 6, 3, 1);
        Global.drawSquircle(super.batch, Color.);
    }

    @Override
    public void dispose() {

    }

    @Override
    public void show() {

    }
}
