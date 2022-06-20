public class Rectangle extends Shape{
    String colour;
    public Rectangle(int l, int w, String c) {
        super(l, w);
        colour=c;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Colour is "+colour);
    }
    @Override
    public void area() {
        super.area();
        int answer=length*width;
        System.out.println("Final answer is "+ answer);
    }
    public static void main(String [] args){
        Rectangle rec=new Rectangle(3,4,"black");
        rec.print();
        rec.area();
    }
}
