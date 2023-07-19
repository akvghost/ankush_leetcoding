/*9. Palindrome Number
Given an integer x, return true if x is a 
palindrome
, and false otherwise.*/

import java.util.Stack;
import java.lang.Math;
class CheckPallindrome
{
	public boolean isPalindrome(int x) {
     Stack<Character> stack = new Stack<>();
     String s = new String();
     String t = new String();
     s= Integer.toString(x);
     x=s.length()-1;
     for(int i = 0 ;i<s.length();i++)
     {
     	//System.out.println(s.charAt(i));
     	//stack.push(s.charAt(i));
     	if(s.charAt(i)==s.charAt(x))
     	{
     		System.out.println(s.charAt(i)+" x:"+(x));
     		x--;
     	}
     	else{
     		return false;
     	}
     }
     // while(!stack.isEmpty())
     // {
     // 	t+=stack.pop();
     // }
     // if(s.equals(t))
     // {
     // 	return true;
     // } 
      return true;
    }
    public boolean findPallindrome(int x)
    {//12321
    	int temp  = x;
    	int revNum=0;
    	long  pow=1;
    	int len = 0;//Integer.toString(x).length()-1;
    	while(temp>0)
    	{
    		temp/=10;
    		len++;
    		pow*=10;
    	}
    	System.out.println(pow);
    	temp=x;
    	if(x>=0){
    	while(temp>0)
    	{
    		revNum += temp%10 * (pow/10);
    		temp/=10;
    		//System.out.println(revNum);
    		len--;
    		pow/=10;
    	}
    	
    	if(revNum == x)
    		return true;
    	else
    	return false;
		}
		return false;
    }
}
public class PallindromeNumber_9
{
	public static void main(String[] args) {
		int x = -0;
	System.out.println("Lets Do this"+x);
	CheckPallindrome cp = new CheckPallindrome();
	System.out.println("return val is "+cp.isPalindrome(x));
		System.out.println("return val is "+cp.findPallindrome(1000000001));

	}
}