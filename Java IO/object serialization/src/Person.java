import java.io.Serializable;

public class Person implements Serializable {
    int age = 25;
    String name = "Upasana Khatiwada";
    double height = 5.4;
   void getName(){

        //  return name;
        System.out.println(name);
    }
    void getAge(){
       // return age;
        System.out.println(age);
    }

}
