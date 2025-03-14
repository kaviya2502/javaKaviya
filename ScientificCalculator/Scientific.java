import java.util.*;
public class Scientific{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
        System.out.println("Enter choice");
        int choice=input.nextInt();
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        if(choice==1)
        {
            System.out.println(a+b);
        }
        else if(choice==2)
        {
            System.out.println(a-b);
        }
        else if(choice==3)
        {
            System.out.println(a*b);
        }
        else{
            System.out.println(a/b);

        }
        }
        }

