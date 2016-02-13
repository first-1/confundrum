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

    /// 0 <= hue < 360, 0 <= saturation, brightness <= 1
    public static Color getColorFromHSB(int hue, float saturation, float brightness) {
        float c = saturation * brightness;
        float x = c * (1 - Math.abs(hue/60 % 2 - 1));
        float m = brightness - c;
        float rr, gg, bb;
        rr = gg = bb = 0;
        if (0 <= hue && hue < 60){
            rr = c; gg = x; bb = 0;
        } else if (60 <= hue && hue < 120){
            rr = x; gg = c; bb = 0;
        } else if (120 <= hue && hue < 180){
            rr = 0; gg = c; bb = x;
        } else if (180 <= hue && hue < 240){
            rr = 0; gg = x; bb = c;
        } else if (240 <= hue && hue < 300){
            rr = x; gg = 0; bb = c;
        } else if (300 <= hue && hue < 360){
            rr = c; gg = 0; bb = x;
        }
        float r = rr + m;
        float g = gg + m;
        float b = bb + m;

        return new Color(r, g, b, 1);
    }

}
