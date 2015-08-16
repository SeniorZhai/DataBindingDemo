package io.github.seniorzhai.databindingdemo;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by zhaitao on 15/8/15.
 */
public class RandomColor {
    public final static int getColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
