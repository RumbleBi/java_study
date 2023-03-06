package org.example.graphicEditor.step01;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[ARRAY_LENGTH];  // 4byte ref x5
        Ellipse[] ellipses = new Ellipse[ARRAY_LENGTH];
        Line[] lines = new Line[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNum = (int)(Math.random() * 3);

            if (randomNum == 0) {
                rectangles[i] = new Rectangle();
            } else if (randomNum == 1) {
                ellipses[i] = new Ellipse();
            } else {
                lines[i] = new Line();
            }
        }
        // Drawing Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (rectangles[i] != null) {
                rectangles[i].drawRectangle();
            } else if (ellipses[i] != null) {
                ellipses[i].drawEllipse();
            } else {
                lines[i].drawLine();
            }
        }

    }
}
