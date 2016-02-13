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

    Texture pls;

    public GameScreen() {
        super();
        pls = new Texture(Gdx.files.internal("badlogic.jpg"));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor( 1, 1, 1, 1 );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
        batch.begin();
        batch.draw(pls, 0, 0, 6, 6);
        batch.end();
        //Global.drawSquircle(super.batch, Color.BROWN, 1, 1, 6, 3, 1);
    }

    @Override
    public void dispose() {

    }

    @Override
    public void show() {

    }
}
