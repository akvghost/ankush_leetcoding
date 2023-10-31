public class CountVowelsInString{
	
	public int vowelStrings(String[] words, int left, int right) {
		String leftChar="",rightChar="";
		String vowels = "aeiouAEIOU";
		int vowelsStringCount=0;
		for(int i = left;i<=right;i++){
			leftChar += words[i].charAt(0);
			rightChar += words[i].charAt(words[i].length()-1);
			System.out.println("First char :"+leftChar+" last char :"+rightChar);
			if(vowels.contains(leftChar)){
				System.out.println("contains "+i);
				if(vowels.contains(rightChar)){
					System.out.println("last contains"+i);
					vowelsStringCount++;
				}
			}
			leftChar=rightChar = "";

		}
		return vowelsStringCount ;
        
    }

	public static void main(String[] args) {
		CountVowelsInString serve = new CountVowelsInString();
		String [] words = {"Are","amy","u"};
		System.out.println(serve.vowelStrings(words,0,2));
	}
}