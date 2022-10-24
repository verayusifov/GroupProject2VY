package GroupProject2;


public class Task1 {

    interface Shape {
        double calculateArea ();
        double calculatePerimiter();
    }
    class Square  implements Shape {

        private double length;
        private double breadth;

        public Square (double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        public double calculateArea() {

            return length * breadth;
        }

        @Override
        public double calculatePerimiter() {

            return 2 * (length + breadth);
        }

    }
    class Circle implements Shape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;

        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimiter() {
            return 2 * Math.PI * radius;
        }
    }}