package lab1;
import java.util.Scanner;
class IndivisualDigits
{
	int number;
	IndivisualDigits(int number)
	{
		this.number = number;
	}
	void separateDigits(int count)
	{
		int temp = number, i;
		int[] digits = new int[count];
		i = 0;
		while (temp > 0)
		{
			digits[i] = temp % 10;
			temp /= 10;
			i++;
		}
		for (i = count - 1; i >= 0; i--)
		{
			System.out.print(digits[i] + "   ");
		}
	}
}
public class SeparateIndivisualDigits 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number, count;
		do
		{
			System.out.print("Enter number: ");
			number = input.nextInt();
			int temp = number;
			count = 0;
			while (temp > 0)
			{
				count++;
				temp /= 10;
			}
			if (count != 5)
				System.out.println("Number must contain only 5 digits");
		} while (count != 5);
		IndivisualDigits digits = new IndivisualDigits(number);
		System.out.print("The indivisual digits of " + number + " are ");
		digits.separateDigits(count);
	}
}
