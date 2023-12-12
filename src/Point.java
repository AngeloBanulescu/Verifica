public class Point {
    private double x;
    private double y;
    public Point()
    {
        x=0;
        y=0;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public void setY(double y)
    {
        this.y=y;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    public void spostaX(double x)
    {
        this.x+=x;
    }

    public void spostaY(double y)
    {
        this.y+=y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
