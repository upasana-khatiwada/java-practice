public class Shape {
     int width ;
    int height;
    public int area(){
        int area=width*height;
        return area;
        //System.out.println(area);
       // System.out.println("Calling from shape");

    }
    Shape(){
        width=10;
        height=50;
    }
Shape(int w,int h){
    width=w;
    height=h;

}

}
