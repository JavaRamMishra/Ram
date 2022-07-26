package lab210722;

/*
 * 2.Retrieve a value associated with a given key from the HashMap .
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class RetrieveValues
{

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		java.util.Scanner sc= new java.util.Scanner(System.in);

		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Shyam");
		map.put(3, "Lakhan");
		map.put(4, "Raja");
		
		
		System.out.println("Enter the key value : ");
		int a = sc.nextInt();
		
		
		System.out.println(map.get(a)); 
		
	}

}