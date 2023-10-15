public class RomanToInt{
	public static void main(String[] args){
		System.out.println("Roman to Integer Converter");
		ServiceToRomanToInt serve = new ServiceToRomanToInt();
		ServiceToRomanToInt serve1 = new ServiceToRomanToInt();
		System.out.println("Number converted : "+serve.romanToInt("MCMXCIV"));
		System.out.println("This is object :"+serve);
		System.out.println("This is object :"+serve1);
		serve.romanToInt("II");
	}
}

class ServiceToRomanToInt{

	int romanToInt(String numStr){

		int curr=0,num=0;
		for(int i = 0 ; i<numStr.length();i++)
		{
			System.out.println(""+num);
			if(numStr.charAt(i)=='I'){
				curr = 1;
				
				if(curr>num&&num!=0)
				{
					num += curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			else if(numStr.charAt(i)=='V'){
				curr = 5;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			
			else if(numStr.charAt(i)=='X'){
				curr = 10;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			else if(numStr.charAt(i)=='L'){
				curr = 50;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			else if((numStr.charAt(i)=='C')){
				curr = 100;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			else if(numStr.charAt(i)=='D'){
				curr = 500;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			else if(numStr.charAt(i)=='M'){
				curr = 1000;
				if(curr>num&&num!=0)
				{
					num = curr-num;
				}
				else {
					num +=curr;
				}
				
			}
			
		}
		System.out.println("return is not needed to acknowledge");

		return num;
	}
}