public class hinhhoc {
    private String color = "green";
    private boolean filled = true;
    public hinhhoc(){
    }
    public hinhhoc(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        hinhhoc hinhhoc = new hinhhoc();
        System.out.println(hinhhoc);
        hinhhoc = new hinhhoc("red",false);
        System.out.println(hinhhoc);
    }
}
