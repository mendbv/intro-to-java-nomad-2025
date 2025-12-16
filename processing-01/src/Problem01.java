import processing.core.PApplet;

public class Problem01 extends PApplet {
    int x;
    int y;
    int customWidth = 900;
    int customHeight = 900;

    @Override
    public void settings() {
        size(customWidth, customHeight);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(255);

        x = customWidth / 3;
        y = customHeight / 3;

        int squareSize = 50;
        int currentDeltaY = 0;
        int padding = 20;

        int darkColor = color(50);
        int lightColor = color(200);
        int hoverColor = color(255, 0, 0);
        int frameColor = color(139, 69, 19);

        int xFrame = customWidth / 3;
        int yFrame = customHeight / 3;

        int frameSize = (8 * squareSize) + (2 * padding);

        noStroke();
        fill(frameColor);
        square(xFrame, yFrame, frameSize);

        x = xFrame + padding;
        y = yFrame + padding;

        for (int i = 0; i < 8; i++) {
            int currentDeltaX = 0;

            for (int j = 0; j < 8; j++) {
                int currentX = x + currentDeltaX;
                int currentY = y + currentDeltaY;

                boolean isHovering = (mouseX >= currentX && mouseX < currentX + squareSize &&
                        mouseY >= currentY && mouseY < currentY + squareSize);

                if (isHovering) {
                    fill(hoverColor);
                } else {
                    if ((i + j) % 2 == 0) {
                        fill(lightColor);
                    } else {
                        fill(darkColor);
                    }
                }

                square(currentX, currentY, squareSize);

                currentDeltaX += squareSize;
            }
            currentDeltaY += squareSize;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}