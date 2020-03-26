public class rectangle extends hinhhoc {
    private double hei = 1.0;
    private double wid = 1.0;
    public rectangle(){

    }
    public rectangle(double hei, double wid){
        this.hei = hei;
        this.wid = wid;
    }
    public  rectangle(double hei,double wid, String color, boolean filled){
        super(color,filled);
        this.wid=wid;
        this.hei=hei;
    }
    public double getWid(){
        return wid;
    }
    public void setWid(double wid){
        this.wid = wid;
    }
    public double getHei(){
        return hei;
    }
    public void setHei(double hei){
        this.hei=hei;
    }
    public double getArea(){
        return wid * hei;
    }
    public double getPeri(){
        return 2 * (wid + hei);
    }
    @Override
    public String toString(){
        return "wid= "
                + getWid()
                +" hei= "
                + getHei()
                +" which is a subclass of "
                +super.toString();
    }

    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        System.out.println(rectangle);
        rectangle = new rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new rectangle(2.3,5.8, "orange", true);
        System.out.println(rectangle);
    }
}
