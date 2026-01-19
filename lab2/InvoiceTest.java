package lab2;
import java.util.Scanner;
class Invoice
{
	private String partNumber, partDescription;
	private int quantity;
	private double price;
	Invoice(String partNumber, String partDescription, int quantity, double price)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
		if (price < 0)
			this.price = 0.0;
		else
			this.price = price;
	}
	String getPartNumber()
	{
		return partNumber;
	}
	String getPartDescription()
	{
		return partDescription;
	}
	int getQuantity()
	{
		return quantity;
	}
	double getPrice()
	{
		return price;
	}
	void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	void setPartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}
	void setQuantity(int quantity)
	{
		if (quantity < 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}
	void setPrice(double price)
	{
		if (price < 0)
			this.price = 0.0;
		else
			this.price = price;
	}
	double getInvoiceAmount()
	{
		return price * quantity;
	}
}
public class InvoiceTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String partNumber, partDescription;
		int quantity, choice;
		double price;
		System.out.print("Enter part number: ");
		partNumber = input.nextLine();
		System.out.print("Enter part description: ");
		partDescription = input.nextLine();
		System.out.print("Enter quantity of item: ");
		quantity = input.nextInt();
		System.out.print("Enter price per item: ");
		price = input.nextDouble();
		Invoice invoice = new Invoice(partNumber, partDescription, quantity, price);
		do
		{
			System.out.println("\n1: Get part number");
			System.out.println("2: Get part description");
			System.out.println("3: Get quantity of item");
			System.out.println("4: Get price per item");
			System.out.println("5: Set part number");
			System.out.println("6: Set part description");
			System.out.println("7: Set quantity of item");
			System.out.println("8: Set price per item");
			System.out.println("9: Get invoice amount");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.println("\nPart number is " + invoice.getPartNumber());
					break;
				case 2:
					System.out.println("\nPart description is " + invoice.getPartDescription());
					break;
				case 3:
					System.out.println("\nQuantity of item is " + invoice.getQuantity());
					break;
				case 4:
					System.out.println("\nPrice per item is " + invoice.getPrice());
					break;
				case 5:
					System.out.print("\nEnter new part number: ");
					input.nextLine();
					invoice.setPartNumber(input.nextLine());
					break;
				case 6:
					System.out.print("\nEnter new part description: ");
					input.nextLine();
					invoice.setPartDescription(input.nextLine());
					break;
				case 7:
					System.out.print("\nEnter new quantity of item: ");
					invoice.setQuantity(input.nextInt());
					break;
				case 8:
					System.out.print("\nEnter new price per item: ");
					invoice.setPrice(input.nextDouble());
					break;
				case 9:
					System.out.println("\nInvoice amount is " + invoice.getInvoiceAmount());
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 9);
		input.close();
	}
}
