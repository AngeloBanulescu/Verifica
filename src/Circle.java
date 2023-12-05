public class Circle {
    private static Point point;
    private static double raggio;
    public Circle(Point coordinates, double raggio)
    {
        point=coordinates;
        this.raggio=raggio;
    }
    public Circle()
    {
        raggio=1;
        point=new Point();
    }

    public double getRaggio() {
        return raggio;
    }

    public void spostaXCerchio(double x)
    {
        point.spostaX(x);
    }
    public void spostaYCerchio(double y)
    {
        point.spostaY(y);
    }
    public static boolean pointInCircle()
    {
        double distanza=Math.sqrt(Math.pow(point.getX() - Circle.point.getX(), 2) + Math.pow(point.getY()
                - Circle.point.getY(), 2));
        if(distanza<raggio)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return point.getX() + "," + point.getY() + " raggio" + raggio;
    }

}
