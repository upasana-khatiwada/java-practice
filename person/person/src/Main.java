public class Main {
    public static void main(String[] args) {

       // Person object = new Person();
        Person object1 = new Person("Upasana",20);

        object1.introduce();
        System.out.println("hi my name is "+object1.name);
        System.out.print("and I am "+object1.age+"years old");

    }
}