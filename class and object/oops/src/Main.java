public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Shape object = new Shape();
        Shape object1= new Shape(10,20);

     //   System.out.println("Width of shape"+object.width);
     //  System.out.println("height of shape"+object.height);
        int x= object.area();
        System.out.println(x);

        int y =object1.width *object1.height;
        System.out.println(y);





    }
}