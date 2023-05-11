public class Main {
    public static void main(String[] args)
    {

     //  int[] x= {10,20,30};
        int[] []y ={{10,20,30},
                {20,90,100},
                {50,30,40},
                {60,70,80},
                {59,48,34}};
//        System.out.println(x[1]);
//        System.out.println(y[0],[1]);
//        for(int i=0;i<3;i++)
//        {
//            System.out.println(x[i]);
//        }
        System.out.println("length:"+y.length);
        for(int i=0;i<y.length;i++)
        {
            for(int j=0;j<y[i].length;j++)
            {
                System.out.print(y[i][j]+" ");

            }
            System.out.println("\n");
        }
    }
}