import java.io.*;
public class Tester
{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard= new BufferedReader(new InputStreamReader(System.in));
        Point punto= new Point();
        //spostare punto
        System.out.println("Assegnare cordinate iniziali al punto?");
        if(Boolean.parseBoolean(keyboard.readLine()) == true)
        {
            System.out.println("x");
            double x= Double.parseDouble(keyboard.readLine());
            System.out.println("y");
            double y= Double.parseDouble(keyboard.readLine());
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
        if (Boolean.parseBoolean(keyboard.readLine()) == true)
        {
            System.out.println("x");
            double xCerchio= Double.parseDouble(keyboard.readLine());
            System.out.println("y");
            double yChercio= Double.parseDouble(keyboard.readLine());
            Circle.setPoint(cerchiox,y);
            System.out.println("raggio");
            double raggio= Double.parseDouble(keyboard.readLine());
        }
        //nuove coordinate
        System.out.println("Spostare il cerchio");
        double xCerchio= Double.parseDouble(keyboard.readLine());
        double yChercio= Double.parseDouble(keyboard.readLine());
        System.out.print(cerchio);
        //punto nel cerchio
        boolean verifica=Circle.pointInCircle();
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
