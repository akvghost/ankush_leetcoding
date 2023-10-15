import java.util.regex.Pattern;
public class BracketsValidator
{
	public static void main(String []args){
		Service s = new Service();//})]]
		System.out.println("Entered String is "+s.isValid("{{)((){)}(]][])[]}"));
		System.out.println("Entered String is "+s.isValid("[({})]"));

	}
}
class Service
{
	Pattern pattern = Pattern.compile("[{}()]+");
	 public boolean isValid(String s) {

        if(pattern.matcher(s).matches() || s.contains("[") || s.contains("]"))
        {
        	boolean isValid=true;
        	int [] bracketCheck = new int[]{0,0,0};
        	//now validate the brackets.
        	char[] arr = s.toCharArray();
        	for (int i =0;i<arr.length;i++) {
        		
	        		if(arr[i]=='(')
	        		{
	        			for(int j = i+1;j<arr.length && i!=arr.length-1;j++)
	        				if(arr[j]==')'){
	        					arr[i] = ' ';
	        					arr[j] = ' ';
	        					//System.out.print("\nat "+i+ " is " + arr[i]+"-"+"at "+j+ " is " +arr[j]);
	        					break;
	        				}
	        		}
	        		else if(arr[i]=='[')
	        		{
	        			for(int j = i+1;j<arr.length && i!=arr.length-1;j++)
	        				if(arr[j]==']'){
	        					arr[i] = ' ';
	        					arr[j] = ' ';
	        					//System.out.print("\nat "+i+ " is " + arr[i]+"-"+"at "+j+ " is " +arr[j]);
	        					break;
	        				}
	        		}
	        		else if(arr[i]=='{')
	        		{
	        			for(int j = i+1;j<arr.length && i!=arr.length-1;j++)
	        				if(arr[j]=='}'){
	        					arr[i] = ' ';
	        					arr[j] = ' ';
	        					//System.out.print("\nat "+i+ " is " + arr[i]+"-"+"at "+j+ " is " +arr[j]);
	        					break;
	        				}
	        		}
        		}	
        	        		
        		for(char i : arr)
        		{
        			if(i!=' '){
        				isValid = false;
        				//System.out.print("."+i+" is valid is "+isValid);
        				break;
        			}
        		}
        	
        	return isValid;
    	}
        else 
        	return false;
    }
}