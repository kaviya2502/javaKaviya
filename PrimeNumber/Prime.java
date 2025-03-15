import java.util.*;
public class Prime{
    public static void main(String args[]){
        int num=10;
        int i=1;
        int count=0;
        while(i<num){
           if(num%i==0)
            {
                count=count+1;
            }
            i=i+1;
        }
        if(count>2){
            System.out.println("not a prime");
        }
        else{
            System.out.println("prime");
        }

        }
        }
        