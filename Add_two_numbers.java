import java.util.Scanner;
class Add_two_numbers
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:" );
		int a=s.nextInt();
		System.out.println("Enter b: ");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("Sum of "+a+" and "+b+": "+sum);
	}
}