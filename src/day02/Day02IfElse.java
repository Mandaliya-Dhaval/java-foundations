import java.util.Scanner;
public class  Day02IfElse {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		//1 Even or Odd
		System.out.println("==============================================");
		System.out.println("=======1. Even or Odd =======");
		System.out.println("Enter the number to check even or odd number:");
		int evod = sc.nextInt();
		if (evod % 2 ==0){
			System.out.println("1) " + evod + " is the even number");
		}
		else{
			System.out.println("1) " + evod + " is the odd number");
		}
		
		//2 Positive/Negative/Zero
		System.out.println();
		System.out.println("=======2. Positive/Negative/Zero =======");
		System.out.println("Enter Number to check Positive/Negative/Zero:");
		int pnz = sc.nextInt();
		if (pnz > 0){
			System.out.println("2) " + pnz + " is an Positive Number");
		}
		else if (pnz < 0){
			System.out.println("2) " + pnz + " is an Negative Number");
		}
		else{
			System.out.println("2) " + pnz + " is Zero");
		}
		
		//3 Max of 3 Numbers
		System.out.println();
		System.out.println("=======3. Max of 3 Numbers =======");
		System.out.println("Enter 3 Numbers separated by spaces:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		 
		if (a>=b && a>=c){
			max=a;
		}
		else if (b>=a && b>=c){
			max=b;
		}
		else{
			max=c;
		}
		System.out.println(max + " is the Max number among " + a + " " + b + " " + c );
		
		//4 Leap Year
		System.out.println();
		System.out.println("=======4. Leap year Calculate =======");
		System.out.println("Enter the Year to Check Leap year or Not:");
		int leap = sc.nextInt();
		if ((leap %4 ==0) || ((leap % 400 ==0) && (leap %100 !=0))){
			System.out.println("3) "+ leap + " Is an Leap Year");
		}
		else{
			System.out.println("3) "+ leap + " Is not an Leap year");
		}
		
		//5 Grade Calculator
		System.out.println();
		System.out.println("=======5. Grade Calculate =======");
		System.out.println("Enter the % to Check Grade:");
		double grade = sc.nextDouble();
		if (grade >= 80){
		System.out.println("A Grade");}
		else if (grade <80 && grade >=60){
		System.out.println("B Grade");}
		else if (grade <60 && grade >=45){
		System.out.println("C Grade");}
		else if (grade <45 && grade >=35){
		System.out.println("D Grade");}
		else{
		System.out.println("F Grade");}
		
		//6 Login Check
		System.out.println();
		sc.nextLine();
		System.out.println("=======6. Login Check (user=admin, pass = secret123) =======");
		System.out.print("Enter Username:");
		String username = sc.nextLine();
		System.out.print("Enter Password:");
		String password = sc.nextLine();
		if (username.equals("admin") && (password.equals("secret123")))
		{
			System.out.println("User Logged in");
		}
		else{
			System.out.println("Wrong Username & password");
		}
	}
}