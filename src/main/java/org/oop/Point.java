package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double CalculateDistance(Point SecondPoint)
    {
        double xDistance = SecondPoint.getX() - this.x;
        double yDistance = SecondPoint.getY() - this.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double CalculateDirection(Point SecondPoint)
    {
        double xDistance = SecondPoint.getX() - this.x;
        double yDistance = SecondPoint.getY() - this.y;
        return Math.atan2(yDistance, xDistance);
    }

}
