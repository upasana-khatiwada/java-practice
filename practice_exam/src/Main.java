//public class Main {
//    public static void main(String[] args) {
////        //for overloading
////
////        Calculator calc = new Calculator();
////        int s= calc.sum(5,10);
////        double a= calc.sum(20.5,5.5);
////
////        System.out.println(s);
////        System.out.println(a);
//
//
//        //for overriding
//        Vehicle v = new Vehicle();
//        v.move();
//
//        Car c = new Car();
//        c.move();
//
//        Vehicle s = new Car();
//        s.move();
//    }
//}

//thread synchronization
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.decrement();
            }
        });

        t1.start();
        t2.start();

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Count: " + counter.getCount());
    }
}


