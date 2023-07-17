import java.util.*;
//unsolved
public class MainForLongestSubString
{
	public static void main(String[] args) {
		System.out.println("Let's Do this ");
		String s = "abcabcbb";
		String s1 = "pwwkew";
		LongestSubString obj = new LongestSubString();
		obj.lengthOfLongestSubstring(s1);

}
}


class LongestSubString
{
	public int lengthOfLongestSubstring(String s) {
       ArrayList<Character> subSec = new ArrayList<Character>();
       for(int i =0;i<s.length();i++) {
       	if(subSec.contains(s.charAt(i)))
       		{
       			
       		}
       	subSec.add(s.charAt(i));
       	System.out.println(" "+s.charAt(i));
       }
       for (char ch : subSec) {
       	System.out.print("ch is "+subSec);
       	
       }
       return subSec.size(); 
    }
}