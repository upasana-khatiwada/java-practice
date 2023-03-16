public class Main {
    public static void main(String[] args) {

        Animal obj = new Animal();
        System.out.println(obj.height);
        obj.getHeight();


        Dog dog = new Dog();
        dog.getHeight();
        System.out.println(dog.height);

        Breed pug=new Breed();
        pug.getWeight();
    }
}