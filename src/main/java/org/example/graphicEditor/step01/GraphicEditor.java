package org.example.graphicEditor.step01;

public class GraphicEditor {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];  // 4byte ref x5
        Ellipse[] ellipses = new Ellipse[5];
        Line[] lines = new Line[5];

        // Generate Shapes
        for(int i = 0; i < 5; i++) {
            int randomNum = (int)(Math.random() * 3);

            if(randomNum == 0) {
                rectangles[i] = new Rectangle();
            } else if (randomNum == 1) {
                ellipses[i] = new Ellipse();
            } else {
                lines[i] = new Line();
            }
        }

    }
}
