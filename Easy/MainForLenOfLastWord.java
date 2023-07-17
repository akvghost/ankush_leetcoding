/*PROBLEM 58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/
public class MainForLenOfLastWord
{
	public static void main(String[] args) {
		System.out.println("Lets do thiiiiiiiiiiis");
		LenOfLastWord obj = new LenOfLastWord();
		String s = "luffy is still joyboy";
		int x = obj.lengthOfLastWord(s);
		System.out.print("x is "+x);
		System.out.print("x is "+obj.lenOfLastWord("ggg	 echoll"));
	}
}

class LenOfLastWord
{
	public int lengthOfLastWord(String s) {
        StringBuffer t = new StringBuffer(s.trim());
        t = t.reverse();
        return t.indexOf(" ");
    }
    public int lenOfLastWord(String s)
    {
    	s = s.trim();
    	int l = s.length();
    	int x=0;
    	boolean sp;
    	for(int i = l-1;i>=0;i--)
    	{
    		if (s.charAt(i)==' ') {
    			  sp=true;  
    			  
    			  break;
    		}
    		x++;
    	}
    	if(x>0)
    		return x;
    	else 
    		return l;
    }
}