
public class patterns {

    static void pattern1( int n){

        for(int row = 1; row <=n; row++)
            {
                for(int col = 1; col <= n-row+1; col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    static void pattern2( int n){

        
        for (int row = 0; row < n ; row++) {
            for(int col = 0; col < row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }

    static void pattern3( int n){

         for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

        }
        System.out.println();

        }
    }

    static void pattern4( int n){


        for(int row = 1; row <= n; row++){

           
            for(int col = 1; col <= n - row;col++){
                System.out.print("  ");
            }

 
            for(int col = 1;col <= 2*row -1;col++){
                System.out.print("* ");
            }
            System.out.println();
            
            
        }
        
    }

    
    static void pattern5( int n){


        for(int row = n; row >=1 ; row--){
            for(int col = 1; col <= 2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
            for(int col = 1; col <= n - row +1;col++){
                System.out.print("  ");
            }  
        }
        
    }

    static void pattern6(int n){

        for( int row = 1 ;row <= n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){

        for( int row = 1 ;row <= n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern8( int n){
        for(int row = n ;row >=1;row--){
            for(int col = 1;col<=row;col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){

        for( int row = 1 ;row <= n; row++){
            for(int col = 1; col<= row; col++){
                System.out.print(col + " ");
            }
            //System.out.println();
            for ( int spaces =1;spaces <= 2*(n-row);spaces++){
                 System.out.print("  ");
            }
             
            for(int col = row;col >=1;col--){
                System.out.print( " " +col);
            }
            System.out.println();
        } 
    }

    static void pattern10(int n){

            for(int row = 1; row <= 2 * n; row++)
            {
                int c =  row > n ? 2 * n - row : row;
                int spaces = n-c;
                for(int s = 0;s < spaces;s++)
                {
                    System.out.print(" ");
                }
                for(int col = 0; col < c; col++)
                {
                    System.out.print( "* "  );
                }
                System.out.println();
            }
        }

        static void pattern11(int n){

            for(int row = 1; row <= 2 * n; row++)
            {
                int c =  row > n ? 2 * n - row : row; 
                for(int col = 0; col < c; col++)
                {
                    System.out.print( "* ");
                }
                System.out.println();
            }
        }

        static void pattern12(int n){

            for(int row = 1;row <= n;row++){

                char ch = 'A';
                for(int col = 1;col <= row;col++){

                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }

        static void pattern13( int n){

            for(int row = n;row >=1;row--){
                char ch ='A';
                for(int col = 1;col <= row;col++){

                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }

        static void pattern14( int n){

            //char ch = 'A';
            for(int row = 1;row <= n;row++){
                
                char ch = (char)('A' + row - 1);
                for(int col = 1;col <= row;col++){

                    System.out.print(ch + " ");
                    
                }
                //ch++;
                System.out.println();
            }
        }

        static void pattern15(  int n){

            for(int row = 1;row <= n;row++){

                char ch = 'A';
                for(int spaces = 0;spaces < n - row;spaces++){
                    System.out.print("  ");
                }
                for(int col = 1;col <= 2*row - 1;col++){
                    if(col > row){
                        ch = (char)(ch  - 2 );
                        System.out.print(ch + " ");
                        ch++;
                        
                    }
                    else{
                        
                        System.out.print(ch + " ");
                        ch++;
                    }

                    
                    
                }
                
                System.out.println();
                


            }
        }


}
