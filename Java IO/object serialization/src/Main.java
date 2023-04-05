import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
            //to create file
        FileOutputStream fileOutputStream = new FileOutputStream("Upasana.txt");
        //to write in a file
        //we write in output stream and read input stream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("Upasana.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p1 = (Person) objectInputStream.readObject();
        p1.getName();
        p1.getAge();


    }
}