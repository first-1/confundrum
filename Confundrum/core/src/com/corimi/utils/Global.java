package com.corimi.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by timi on 12.02.2016.
 */
public class Global {

    public static float SCREEN_WIDTH = 12f;
    public static float SCREEN_HEIGHT = 18f;
    public static int circleSmoothness = 100;


    public static ShapeRenderer shapeRenderer;

    public static void setShapeRenderer(OrthographicCamera camera) {
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);
    }

    public static void drawSquircle(Batch batch, Color color, float x, float y, float width, float height, float radius) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(color);
        shapeRenderer.circle(x + width/2 - radius, y + height/2 - radius, radius, circleSmoothness);
        shapeRenderer.circle(x - width/2 + radius, y + height/2 - radius, radius, circleSmoothness);
        shapeRenderer.circle(x - width/2 + radius, y - height/2 + radius, radius, circleSmoothness);
        shapeRenderer.circle(x + width/2 - radius, y - height/2 + radius, radius, circleSmoothness);

        shapeRenderer.rect(x - width/2 + radius, y + height/2 - 2*radius, width - 2*radius, 2*radius);
        shapeRenderer.rect(x - width/2, y - height/2 + radius, 2*radius, height - 2*radius);
        shapeRenderer.rect(x - width/2 + radius, y - height/2, width - 2*radius, 2*radius);
        shapeRenderer.rect(x + width/2 - 2*radius, y - height/2 + radius, 2*radius, height - 2*radius);

        shapeRenderer.rect(x - width/2 + radius, y - height/2 + radius, width - 2*radius, height - 2*radius);
        shapeRenderer.end();
    }

}
