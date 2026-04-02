
public class BinaryToDecimal {

    static int binarytodecimal(int  binary){
        int decimal = 0;
        int position  = 0;
        while(binary > 0){
            int digit = binary % 10;
            decimal += digit *(int)Math.pow(2,position);
            binary /=10;
            position++;
        }
        return decimal;
    }
    
   
}
