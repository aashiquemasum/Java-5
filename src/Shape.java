public class Shape {
    int length;
    int width;

    public Shape(int l, int w){
        System.out.println("I am parent constructor Shape");
        length=l;
        width=w;
    }
    public void area(){
        System.out.println("I am calculating area");
    }
    public void print(){
        System.out.println("Length is " +length);
        System.out.println("Width is " +width);
    }
}
