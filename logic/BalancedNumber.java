package logic;
import java.util.*;
public class BalancedNumber {
     int k =0,ls=0,rs=0;
    void evenCheck(int n,int c)
    {
        c=c/2;
        while(n!=0)
        {
            if(k<c)
            {
                int d=n%10;
                k++;
                ls=ls+d;
                n=n/10;
            }
            if(k>=c)
            {
                int d=n%10;
                k++;
                rs=rs+d;
                n=n/10;
            }
        }
        System.out.println(rs);
        System.out.println(ls);
        if(rs==ls)
        {
            System.out.println("Balanced Number");
        }
        else
        {
             System.out.println("not Balanced Number");
        }
    }
    void oddCheck(int n,int c)
    {
         c=c/2;
        while(n!=0)
        {
            if(k<c)
            {
                int d=n%10;
                k++;
                ls=ls+d;
                n=n/10;
            }
            if(k>c)
            {
                int d=n%10;
                k++;
                rs=rs+d;
                n=n/10;
            }
            if(k==c)
            {
                k++;
                n=n/10;
            }
        }
        System.out.println(rs);
        System.out.println(ls);
        if(rs==ls)
        {
            System.out.println("Balanced Number");
        }
        else
        {
             System.out.println("not Balanced Number");
        }
    }
    public static void main(String[] args) {
        BalancedNumber obj = new BalancedNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number=");   
        int n = sc.nextInt();
        int c = 0;
        int temp = n;
        while(temp!=0)
        {
            c++;
            temp=temp/10;
        }
        if(c%2==0)
        {
            obj.evenCheck(n,c);
        }
        else
        {
            obj.oddCheck(n,c);
        }
        sc.close();
    }
}
