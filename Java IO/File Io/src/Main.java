import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Upasana.txt");


            //this will create new file!!!
            file.createNewFile();

        //to write in a file

            FileWriter fileWriter = new FileWriter("Upasana.txt");
            fileWriter.write("hello everyone I am upasana!!!");

            fileWriter.close();


        //to read in file


            FileReader fileReader = new FileReader("Upasana.txt");
            int value;

            while((value = fileReader.read())!= -1){
                System.out.print((char)value);

            }

        //to delete file

        fileReader.close();
        file.delete();


    }
}