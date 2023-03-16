public class Person {

    String name ;
    int age ;
            public void introduce()
            {
                System.out.println("hi my name is "+name);
                System.out.println("and I am "+age+"years old");
            }

            Person(String n,int a){
                name=n;
                age=a;
            }

}
