package org.example.graphicEditor.step02;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;
    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNum = (int)(Math.random() * 3);

            if (randomNum == 0) {
                shapes[i] = new Rectangle();
            } else if (randomNum == 1) {
                shapes[i] = new Ellipse();
            } else {
                shapes[i] = new Line();
            }
        }
        // Drawing Shapes
        // @Overriding
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
