public class Circle {
    private Point point;
    private double raggio;
    public Circle(Point coordinates, double raggio)
    {
        this.point=coordinates;
        this.raggio=raggio;
    }
    public Circle()
    {
        raggio=1;
        point=new Point();
    }

    public void setPoint(double xCerchio, double yCerchio)
    {

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
    public boolean pointInCircle(Point point2)
    {
        double distanza=Math.sqrt(Math.pow(point2.getX() - this.point.getX(), 2) + Math.pow(point2.getY()
                - this.point.getY(), 2));
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
