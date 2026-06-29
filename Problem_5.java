// Problem: Print the pattern (Inverted Half Pyramid Rotated 180 degree).       *
//                                                                            * *
//                                                                          * * *
//                                                                        * * * *
public class Problem_5 {
  public static void main(String[]args) {
    
    // For rows
    int n = 4;

    //Outer loop;
    for(int i=1; i<=n; i++){

        // Inner loop 1;
        for(int j=1; j<=n-i; j++) {
            System.out.print("   ");
        }

        // Inner loop 2;
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();        
    }
    }
}