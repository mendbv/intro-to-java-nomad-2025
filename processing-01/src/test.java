import processing.core.PApplet;

public class test extends PApplet {
    int height = 900;
    int width = 900;

    int frameSize = 8;
    int squareSize = 50;

    @Override
    public void settings(){
        size(width, height);
    }

    @Override
    public void setup(){

    }

    @Override
    public void draw(){
        int squareSize = 50;

        strokeWeight(1);
        stroke(0);

        for(int p = 0; p < frameSize; p++){
            for (int o = 0; o < frameSize; o++){
                float xPos = p * squareSize;
                float yPos = o * squareSize;

                if ((p + o) % 2 == 0) {
                    fill(255);
                } else {
                    fill(0);
                }

                if (mouseX >= xPos && mouseX < xPos + squareSize &&
                        mouseY >= yPos && mouseY < yPos + squareSize) {
                    fill(255, 0, 0);
                }

                square(xPos, yPos, squareSize);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("test");
    }
}