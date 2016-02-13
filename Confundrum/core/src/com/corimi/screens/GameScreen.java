package com.corimi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.corimi.utils.Global;
import java.awt.color.*;

/**
 * Created by timi on 12.02.2016.
 */
public class GameScreen extends MyScreen{

    public GameScreen() {
        super();
    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor( 1, 1, 1, 1 );
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        Global.drawSquircle(super.batch, Global.getColorFromHSB(45, 0.5f, 0.65f), 5, 5, 7, 4, 1);
        Global.drawSquircle(super.batch, Global.getColorFromHSB(45, 0.35f, 1f), 5, 5, 6, 3, 1);
    }

    @Override
    public void dispose() {

    }

    @Override
    public void show() {

    }
}
