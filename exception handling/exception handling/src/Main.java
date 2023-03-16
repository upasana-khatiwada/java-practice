public class Main {
    public static void main(String[] args) {
        try {
            int divider =0;
            int value = 100;

            int result = value/divider;
            System.out.println("the answer is "+result);
        }
        catch (Exception e){
            System.out.println("Error in this program is : "+e);
        }
        finally {
            int divider =10;
            int value = 100;

            int result = value/divider;
            System.out.println("the answer is "+result);
        }


        //This function is to show that the work below the program is working well
        anotherWork();

    }
    static void anotherWork(){
        System.out.println("Another word");
    }
}