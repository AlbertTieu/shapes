public class thirteenSidePolygon implements Shape {
    private int sideLength;
    private String color;
    public thirteenSidePolygon(String color, int sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }
    
    public double getArea() {
        return ((sideLength*13)*(sideLength/2*Math.tan(Math.toRadians(180/13))))/2;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getPerimeter() {
        return sideLength*13;
    }
}