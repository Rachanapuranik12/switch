class P5{
	public static void main(String[] args){

		int x=3;
		int a=1,b=2;

		switch(x){

			case a:
				System.out.println("one");
				break;

			case b:
				System.out.println("two");
				break;

			case a+b:
				System.out.println("three");
				break;

			case a+a+b:
				System.out.println("four");
				break;

			case a+b+b:
				System.out.println("five");
				break;

			default:
				System.out.println("Invalid");
		}


	}
}

// Onlu constant expression allowed for switch, not variable expression like we have mentioned in above code
// so we get error.
