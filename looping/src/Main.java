public class Main {
    public static void main(String[] args) {
    int money =1;

//        for(int i=1;i<=10;i++)
//        {
//            money=  money * i;
//         //   System.out.println(" hello world");
//        }
        int i=1;
        while(i<=10)
        {
            money =money*i;
            i++;
        }
        System.out.println("Total money"+money);
    }
}