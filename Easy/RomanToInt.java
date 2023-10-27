// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
//WE CAN IMPROVE IT BY USING HASHMAP
public class RomanToInt{
	public static void main(String[] args){
		// System.out.println("Roman to Integer Converter");
		// ServiceToRomanToInt serve = new ServiceToRomanToInt();
		ServiceToRomanToInt serve1 = new ServiceToRomanToInt();
		// System.out.println("Number converted : "+serve.romanToInt("MCMXCIV"));//VX is wrong
		// System.out.println("This is object :"+serve);
		// System.out.println("This is object :"+serve1);
		// serve.romanToInt("XVII");
		serve1.romanToIntSwitch("MCMXCIV");
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

	int romanToIntSwitch(String numStr){ //this is right answer ♥


		int roman=0,curRoman=0;
		System.out.println(numStr);
		// while(i<numStr.length())
		for (int i=0; i<numStr.length();i++ ) {
			curRoman = currentRoman(numStr.charAt(i));
			if(i<numStr.length()-1 && curRoman < currentRoman(numStr.charAt(i+1)))
			{
				System.out.println(curRoman +" and next is "+ currentRoman(numStr.charAt(i+1)));
				roman += currentRoman(numStr.charAt(i+1))-curRoman;
				i+=1;
				continue;
			}
			roman +=curRoman;
			// i++
		}
		System.out.println(roman);
		return 0;
	}

	int currentRoman(char ch){
		int curNum=0;	
		switch(ch)
		{
		case 'I' :curNum=1;

		break;
		case 'V' :curNum=5;

		break;
		case 'X' :curNum=10;

		break;
		case 'L' :
			curNum=50;
		break;
		case 'C' :
			curNum=100;
		break;
		case 'D' :
			curNum=500;
		break;
		case 'M' :
			curNum=1000;
		break;
	default: return 0;
		}
		return curNum;
	}
}