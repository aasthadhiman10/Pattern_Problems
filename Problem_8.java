// Problem: Print the pattern (Solid Rectange). 1
//                                              0 1
//                                              1 0 1
//                                              0 1 0 1
//                                              1 0 1 0 1
public class Problem_8 {
  public static void main(String[]args) {

    // For rows
    int n = 5;

    //Outer loop;
    for(int i=1; i<=n; i++){

        //Inner loop;
        for(int j=1; j<=i; j++){
            int sum = i + j;
            if(sum % 2 == 0){
                System.out.print("1" + " ");
            }
            else{
                System.out.print("0" + " ");
            }

        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}