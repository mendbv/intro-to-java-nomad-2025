import processing.core.PApplet;

import javax.sound.sampled.Line;

public class Problem02 extends PApplet {
    int x = 0;
    int y = 0;
    int deltaY;
    int deltaX;
    public static float initValue;
    double angle = 0.0;
    int height=600;
    int width = 900;

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        initValue = PI/8;
        deltaY = 1;
        y = 0;
        deltaX = 10;
        x = 0;
    }

    @Override
    public void draw(){
        background(255);

        pushMatrix();
        translate(450, y);
        circle(0, 0, 250);
        rotate(initValue);
        line(0, 0, 100, 0);
        strokeWeight(7);
        popMatrix();

        y+=deltaY;
        initValue += 0.03f;


        if (y>height){
            y=0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }
}