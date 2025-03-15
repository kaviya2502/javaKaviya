import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        int a[]=new int[n];
        int i=0;
        int sum=0;
        while(i<n)
        {
            System.out.println("Enter the value");
            a[i]=input.nextInt();
            i=i+1;
        }
        i=0;
        while(i<n){
        sum=sum+a[i];
        i=i+1;
    }
    System.out.println("The sum is:"+sum);
    }
}
