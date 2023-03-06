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
        // forEach syntax
        // shapes 배열에서 index 0 부터 Shape 변수가 참조할 수 있도록 함.
        // shapes 배열에서 하나씩 shape 의 요소들을 순회함
        for (Shape shape : shapes) {
            // shape 이 참조하는 그 대상이 Rectangle 객체로 다운캐스팅이 되는지 묻는 if문

            if(shape instanceof Rectangle) {
                // Rectangle rect = (Rectangle) shape; 다운캐스팅
                // rect.drawRectangle();
                ((Rectangle)shape).drawRectangle();
            } else if (shape instanceof Ellipse) {
                ((Ellipse)shape).drawEllipse();
            } else if (shape instanceof Line) {
                ((Line)shape).drawLine();
            }
        }

    }
}
