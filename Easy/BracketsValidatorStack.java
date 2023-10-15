import java.util.Stack;
import java.util.regex.Pattern;
class Service
{
	public boolean isValid(String s) 
	{
		Pattern pattern = Pattern.compile("[(){}\\[\\]]+");		

		if(!pattern.matcher(s).matches())
				{
					System.out.println("not mathced" +pattern.matcher(s).matches());
					return false;
				}

		else{
			System.out.print("In else");
			Stack<Character> mySt = new Stack<Character>();
			for(int i =0; i<s.length();i++)
				{
					if(mySt.isEmpty())
					{
						mySt.push(s.charAt(i));
						continue;
					}
					//()({}){)()}
					if(s.charAt(i)==')' && mySt.peek()=='(')
					{
						System.out.println("Stack popped :"+mySt.pop());
						
					}
					else if(s.charAt(i)==']' && mySt.peek()=='[')
					{
						System.out.println("Stack popped :"+mySt.pop());
						
					}
					else if(s.charAt(i)=='}' && mySt.peek()=='{')
					{
						System.out.println("Stack popped :"+mySt.pop());
						
					}
					else {
						System.out.println("Stack top : "+mySt.peek());
						mySt.push(s.charAt(i));
						System.out.println("Stack top : "+mySt.peek());

					}
					
				}
				if(mySt.isEmpty())
				{
					System.out.println("Valid");
				}
	
		}
		
	return false;
	}

}

public class BracketsValidatorStack
{
	public static void main(String[] args){
		System.out.println("Let's Do this "+args[0]);
		Service s = new Service();
		s.isValid(args[0]);
	}
}