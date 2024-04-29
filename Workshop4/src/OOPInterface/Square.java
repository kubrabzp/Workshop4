package OOPInterface;

public class Square implements Shape,Task{

    double edge;

    public Square(double edge){
        this.edge=edge;
    }

    @Override
    public double area() {
        return edge * edge;
    }

    @Override
    public double perimeter() {
        return 4 * edge;
    }

    @Override
    public void basla(){
        System.out.println("Dairenin içi boyanıyor");
    }

    public void dur(){
        System.out.println("Boyama işlemi durdu");
    }
}
