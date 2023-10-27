import java.util.*;
public class PascalTriangle
{
	public static void main(String[] args) {
		PascalTriangleService pl = new PascalTriangleService();
	pl.generateM(5);
	}
	 
}

class PascalTriangleService{
	 public void generateM(int numRows) {
        ArrayList<ArrayList<Integer>> finalL = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subL = new ArrayList<Integer>();
        subL.add(1);
       // finalL.add(4);
        finalL.add(subL);
        System.out.println(finalL);
        for(int i =1;i<=5;i++){
        	
        }
    }
}