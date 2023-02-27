public class Main {
    public static void main(String[] args) {
//this will be created on the string pool
        String name = "Upasana";
        name = name + "Khatiwada";
        System.out.println(name);

        //this will create the new instance of the string
        String name2 = new String("hello world");



        StringBuffer name3 = new StringBuffer("Upasana");
        name3.append("Khatiwada");

        System.out.println(name3);


    }
}