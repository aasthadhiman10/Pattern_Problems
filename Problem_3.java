// Problem: Print the pattern (Half Pyramid). *
//                                            * *
//                                            * * *
//                                            * * * *
public class Problem_3 {
  public static void main(String[]args) {
    // For rows
    int n = 4;

   //Outer loop;
   for(int i=1; i<=n; i++){

        // Inner loop;
       for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println(  );        
    }
    }
}