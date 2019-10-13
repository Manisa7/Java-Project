package myPackage;

import java.util.HashMap;

public class stringduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Manisa", "Mahapatra", "Ankit", "singh", "Manisa","Singh"};
		HashMap<String,Integer> obj=new HashMap<>();
		for(String str1:str) {
			
			if(obj.containsKey(str1)) {
				obj.put(str1, obj.get(str1)+1);
			}
			else {
				obj.put(str1, 1);
			}
			
			
		}
		System.out.println("String count is: " + obj);

	}

}
