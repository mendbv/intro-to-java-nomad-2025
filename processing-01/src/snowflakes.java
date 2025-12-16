import processing.core.PApplet;

public class snowflakes extends PApplet {
    int deltaY = 1;
    int count = 5;
    float [] x = new float[count];
    float [] y = new float[count];
    float [] angle = new float[count];

    @Override
    public void settings(){
        size(900, 900);
    }

    @Override
    public void setup(){
        for (int i = 0; i<count;i++){
            x[i] = 160 * i;
            y[i] = random(height);
            angle[i] = random(2*PI);
        }
    }

    @Override
    public void draw(){
        background(0);

        for (int i = 0; i < count; i++){
            pushMatrix();
            translate(x[i], y[i]);
            rotate(angle[i]);
            stroke(255);
            strokeWeight(20);
            line(-75, 0, 75, 0);
            line(0, -75, 0, 75);
            line(-45, -45, 45 ,45);
            line(-45, 45, 45 ,-45);
            popMatrix();

            y[i] += deltaY;
            angle[i] += 0.01f;
            if (y[i] > height){
                y[i] = 0;
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("snowflakes");
    }
}
