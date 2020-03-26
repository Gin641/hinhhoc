public class circle extends hinhhoc {
    private double radius = 1.0;
    public circle(){
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "radius = "
                + getRadius()
                +", which is a sub class of "
                + super.toString();
    }

    public static void main(String[] args) {
        circle circle = new circle();
        System.out.println(circle);
        circle = new circle(3.5);
        System.out.println(circle);
        circle = new circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
