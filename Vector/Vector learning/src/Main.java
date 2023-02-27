import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int[]age ={10,20,30};
       // Vector age2 = new Vector();
        Vector age2 = new Vector(3);
        System.out.println(age.length);
        age2.add(10);
        age2.add(20);
        age2.add(30);



        System.out.println("vector age capacity: "+ age2.capacity());
    }
}