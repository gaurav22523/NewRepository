import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the number of elements");
       int n=obj.nextInt();
       int i,j;
       int arr[][]=new int[n][n];
       for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            System.out.println("Enter the elements "+i+j);
            arr[i][j]=obj.nextInt();
        }
       }
       

        
    }
}
