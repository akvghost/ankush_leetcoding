/* PROBLEM 28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

CONSTRAINTS 
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.*/
public class MainForFindSubStr
{
	public static void main(String[] args) {
		System.out.println("HEllo Sub Str world");
		String haystack = "sadbutsad";
		String needle = "but";
		//System.out.println("index is "+haystack.indexOf(needle)+"\nStart  is "+haystack.startsWith(needle)+ " End is "+haystack.endsWith(needle) +" Contains "+haystack.contains("tooth") );

		FindSubStr fs = new FindSubStr();
		System.out.println(""+fs.strStr(haystack,needle));
	}
}
class FindSubStr
{ 
	public int strStr(String haystack, String needle) 
	{
		
		if (!haystack.contains(needle)) {
		return -1;			
		}
		else 
			return haystack.indexOf(needle);


		
    }
	
}

