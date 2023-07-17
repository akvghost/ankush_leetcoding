import java.util.Stack;
import java.lang.Math;

/*
PROBLEM 7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range , then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
CONSTRAINTS
-2^31 <= x <= 2^31 - 1*/

class ReverseInteger
{
	public int reverse(int x) {
	int temp=x,len=0,revNum=0;
	boolean isPositive=false,isOutOfBound=false;
     isPositive = x>0?true:false;
     while(temp/10!=0)
     {

     	temp/=10;
     	len ++;
     }
          System.out.println(len);

     while(x/10!=0)
     {
     	//if()
     	revNum+=x%10*Math.pow(10,len);
     	//if()
     	x/=10;
     	len--;
     }
     revNum+=x;
     System.out.println(revNum);
     
     if (isPositive && revNum<0 ) {
     	     return 0;   
     }
     else if(!isPositive && revNum>0)
     	return 0; 
     else
     return revNum;

    }
}

public class MainForReverseInteger
{
	public static void main(String[] args) {
		long l =(long)Math.pow(2,31);
		System.out.println(l);
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(-1534236469)); 
	}
}