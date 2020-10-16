public class Circle {

        private double radius;

        public Circle(double r)
        {
            radius = r;
        }
        public double area()
        {
            double a = Math.PI * Math.pow(radius, 2);
            return a;
        }
        public double circumference()
        {
            double c = 2 * Math.PI * radius;
            return c;
        }
        public static void main(String[] args)
        {
            Circle c1 = new Circle(5);
            System.out.println("Area: " + c1.area() + " Circumference: " + c1.circumference() + " Radius: " + c1.radius);
            Circle c2 = new Circle(3);
            System.out.println("Area: " + c2.area() + " Circumference: " + c2.circumference() + " Radius: " + c2.radius);
        }

}

