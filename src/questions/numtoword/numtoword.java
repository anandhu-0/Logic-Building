import java.util.*;

public class numtoword {
    
     static void  digit_to_word(int number){
        int index = 0;
       
        String [] arr = { "zero","one","two","three","four","five","six","seven","eight","nine" };
        String str = String.valueOf(number);
        String[] digits = str.split("");
        String[] res = new String[str.length()];
        for(String digit : digits){

            if(digit.equals( "-")){
                System.out.print("negative ");
            }
            else{
                int solo = Integer.parseInt(digit);
                res[index] = arr[solo];
                index++;
            }
        }

         for (int i = 0;i < index;i++) {

           System.out.print( res[i] + " " );
              
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a digit: ");
        int number = sc.nextInt();
        
        numtoword.digit_to_word(number);

    }
    
}
