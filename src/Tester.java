import java.io.*;
public class Tester
{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard= new BufferedReader(new InputStreamReader(System.in));
        Point punto= new Point();
        //spostare punto
        System.out.println("Assegnare cordinate iniziali al punto?");
        if(Boolean.parseBoolean(keyboard.readLine()))
        {
            System.out.println("x");
            double x= Double.parseDouble(keyboard.readLine());
            punto.setX(x);
            System.out.println("y");
            double y= Double.parseDouble(keyboard.readLine());
            punto.setY(y);
        }
        //nuove coordinate
        System.out.println("Spostare il punto");
        double x= Double.parseDouble(keyboard.readLine());
        double y= Double.parseDouble(keyboard.readLine());
        punto.spostaX(x);
        punto.spostaY(y);
        System.out.println(punto);
        //spostare cerchio
        Circle cerchio= new Circle();
        System.out.println("Assegnare cordinate iniziali cerchio?");
        if (Boolean.parseBoolean(keyboard.readLine()))
        {
            System.out.println("x");
            double xCerchio= Double.parseDouble(keyboard.readLine());
            System.out.println("y");
            double yCerchio= Double.parseDouble(keyboard.readLine());
            cerchio.setPoint(xCerchio,yCerchio);
            System.out.println("raggio");
            double raggio= Double.parseDouble(keyboard.readLine());
            System.out.print(cerchio);
        }
        //nuove coordinate
        System.out.println("Spostare il cerchio");
        double xCerchio= Double.parseDouble(keyboard.readLine());
        double yChercio= Double.parseDouble(keyboard.readLine());
        System.out.print(cerchio);

        //punto nel cerchio
        Point point2= new Point();
        System.out.println("x");
        double newx= Double.parseDouble(keyboard.readLine());
        System.out.println("y");
        double newy= Double.parseDouble(keyboard.readLine());
        point2.setX(newx);
        point2.setY(newy);

        boolean verifica=cerchio.pointInCircle(point2);
        if (verifica==true)
        {
            System.out.println("punto appartiene al cerchio");
        }
        else
        {
            System.out.println("punto non appartiene al cerchio");
        }

    }
}
