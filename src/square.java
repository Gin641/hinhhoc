public class square extends rectangle {
    public square(){

    }
    public square(double size){
        super(size,size);
    }
    public square(double size, String color, boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return getWid();
    }
    public void setSize(double size){
        setWid(size);
        setHei(size);
    }
    @Override
    public void setWid(double wid){
        setSize(wid);
    }
    @Override
    public void setHei(double hei){
        setSize(hei);
    }
    @Override
    public String toString(){
        return " Size= "
                + getSize()
                + " subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        square square = new square();
        System.out.println(square);
        square = new square(2.3);
        System.out.println(square);
        square = new square(2.3 , "yellow", true);
        System.out.println(square);
    }
}
