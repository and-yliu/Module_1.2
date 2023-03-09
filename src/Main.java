import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(4,5,6));
        shapes.add(new Circle(3));

        for(TwoDShape v: shapes){
            System.out.println(v.getArea());
            System.out.println(v.toString());
        }

    }
}