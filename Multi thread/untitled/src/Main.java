public class Main {
    public static void main(String[] args) {

        Process1 p1 =   new Process1();
        Process2 p2 = new Process2();
       p1.start();
       p2.start();


    }
}

class Process1 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<1000;i++){
            //p1.call();
            System.out.println("process 1 calling ..........");
        }

    }
}

class Process2 extends Thread{
//    void call(){
//        System.out.println("process 2 calling ..........");
//    }

    @Override
    public void run() {
        for (int i =0;i<1000;i++){
            System.out.println("process 2 calling ..........");
        }


    }
}