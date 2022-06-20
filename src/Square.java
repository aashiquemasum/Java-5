public class Square extends Shape {
    String nicName;
    public Square(int l, int w, String n) {
        super(l, w);
        System.out.println("I am constructor of square");
        nicName=n;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("NickName is "+nicName);
    }
    @Override
    public void area(){
        super.area();
        int area=length*width;
        System.out.println("Area is "+ area);
    }
    public static void main(String [] args){
        Square sq=new Square(5,5,"cute");
        sq.print();
        sq.area();
    }
}


