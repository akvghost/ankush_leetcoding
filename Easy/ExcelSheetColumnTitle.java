import java.util.*;//for scanner class
public class ExcelSheetColumnTitle
{
	public static void main(String[] args)
	{
		System.out.println("Let's do this");
		int colNum,rem;
		int [] arr = new int[26];
		String colTitle = new String();

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the column no =>");
		colNum = sc.nextInt();
		//convert int to char by explicit typecasting (char)97

		while(colNum/26!=0)
		{
			rem=colNum%26;
			colNum/=26;
			System.out.println("colnum is "+colNum+" rem is "+rem);

		}

		colNum=(65+colNum%26)-1;
		System.out.println(colNum);

		colTitle+=(char)(colNum);	
		System.out.println(colTitle);

	}
}