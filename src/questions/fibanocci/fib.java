

public class fib {
    static void fibonacci( int n){

        int a = 0,b =1;
        System.out.println();
        System.out.print("The fibonacci series : " );
        for(int i = 0;i< n;i++){
            System.out.print(a+ " ");
            int next = a + b;
            a = b;
            b = next;

        }
    }
}
