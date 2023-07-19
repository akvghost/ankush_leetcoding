class FindPrefix 
{
	public String longestCommonPrefix(String[] strs) {
		int x=0;
		String longestPrefix = new String("");
		int smallestStrLen=201;
		boolean eqpref=false;
		if(strs.length==1)
			return strs[0];
		for(String i : strs)
		{
			if(i.length()<smallestStrLen)
			{
				smallestStrLen=i.length();
			}
		}
		for(int i =0;i<smallestStrLen;i++)
		{
			for(int j=1;j<strs.length ;j++)
			{
				if(strs[0].charAt(i)==strs[j].charAt(i))
					eqpref=true;
				else 
				{eqpref=false;
			break;
				}
			}
			if(eqpref)
			{
				longestPrefix+=strs[0].charAt(x);
				x++;
			}
			else 
				break;
		}

        
        return longestPrefix;
    }
}

public class LongestCommonPrefix
{
	public static void main(String[] args) {
		System.out.println("Let's Do this");
		String []strs ={"flower","flow","floight","u"};
		FindPrefix fp = new FindPrefix();
		System.out.println("v"+fp.longestCommonPrefix(strs)+"v");
	}
}