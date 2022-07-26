public class CheckPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number");
		int check= sc.nextInt();
		boolean see = true;
		if(check<=1) {
			see = false;
		}
		for(int i=2;i<check;i++) {
			if(check%i==0) {
				see = false;
			}
		}
		if(see==true) {
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");

	}

}

