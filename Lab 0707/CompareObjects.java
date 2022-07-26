package lab0707;

public class CompareObjects {

	public static void main(String[] args) {
		
		BeanClass_student s1 =new BeanClass_student("Ram",22,"L",15);
		BeanClass_student s2 =new BeanClass_student("Sanket",34,"K",14);
		BeanClass_student s3 =new BeanClass_student("Rajas",19,"L",24);
		BeanClass_student s4 =new BeanClass_student("Pranil",19,"K",46);
		

		
		if(s1.equals(s4)) {
			System.out.println("Same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
		}
		else {
			System.out.println("not same");
		}

		
//		if(s1.equals(s4) && s1.hashCode()==s4.hashCode()) {
//			System.out.println(" Same and hashcode also same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
//		}
//		else {
//			System.out.println("not same");
//		}
		
				
	}

	
		
	

}