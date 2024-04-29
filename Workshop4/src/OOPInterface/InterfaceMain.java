package OOPInterface;

public class InterfaceMain {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        double circleArea = circle.area();
        double circlePerimeter = circle.perimeter();
        System.out.println("Dairenin alanı: " + circleArea);
        System.out.println("Dairenin çevresi: " + circlePerimeter);
        circle.basla();
        circle.dur();

    }
}
