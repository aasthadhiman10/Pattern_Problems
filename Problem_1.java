// Problem: Print the pattern (Solid Rectange). * * * * * * *
//                                              * * * * * * *
//                                              * * * * * * *
public class Problem_1 {
  public static void main(String[]args) {

    // For rows
    int n = 3;

    // For columns
    int m = 7;

    //Outer loop;
    for(int i=1; i<=n; i++){

        //Inner loop;
        for(int j=1; j<=m; j++){
            System.out.print(" * ");
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}