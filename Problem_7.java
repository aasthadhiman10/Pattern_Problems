// Problem: Print the pattern (Half Pyramid). 1 2 3 4 5
//                                            1 2 3 4
//                                            1 2 3
//                                            1 2
//                                            1

public class Problem_7 {
  public static void main(String[]args) {

    // For rows
    int n = 5;

    //Outer loop;
    for(int i=n; i>=1; i--) {

        // Inner loop;
        for(int j=1; j<=i; j++) {
            System.out.print( j + " " );
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}