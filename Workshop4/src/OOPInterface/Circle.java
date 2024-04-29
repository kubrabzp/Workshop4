package OOPInterface;

public class Circle implements Task, Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){

    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void basla(){
        System.out.println("Dairenin içi boyanıyor");
    }

    @Override
    public void dur(){
        System.out.println("Boyama işlemi durdu");
    }

}
