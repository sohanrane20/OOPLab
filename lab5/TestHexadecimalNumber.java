package lab5;
import java.util.Scanner;
class HexadecimalNumber
{
	private String number;
	HexadecimalNumber(String number)
	{
		this.number = number;
	}
	boolean isHexadecimalNumber()
	{
		int i;
		for (i = 0; i < number.length(); i++)
		{
			if (!(number.charAt(i) >= 'A' && number.charAt(i) <= 'F' || number.charAt(i) >= '0' && number.charAt(i) <= '9'))
			{
				break;
			}
		}
		return i == number.length();
	}
}
public class TestHexadecimalNumber 
{
	public static void main(String[] args)
	{
		String number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		number = input.next();
		HexadecimalNumber testHexadecimalNumber = new HexadecimalNumber(number.toUpperCase());
		if (testHexadecimalNumber.isHexadecimalNumber())
		{
			System.out.println("Hexadecimal number");
		}
		else
		{
			System.out.println("Not a hexadecimal number");
		}
		input.close();
	}
}
