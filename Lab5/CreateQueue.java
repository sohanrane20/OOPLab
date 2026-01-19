package lab5;
import java.util.Scanner;
interface QueueImplementation
{
	void insertElement(int element);
	void deleteElement();
	void displayQueue();
}
class QueueDemo implements QueueImplementation
{
	int[] queue = new int[10];
	int size = 0;
	public void insertElement(int element)
	{
		if (size == queue.length)
		{
			System.out.println("Queue is full");
			return;
		}
		queue[size] = element;
		size++;
	}
	public void deleteElement()
	{
		if (size == 0)
		{
			System.out.println("Queue is empty");
			return;
		}
		for (int i = 0; i <= size - 2; i++)
		{
			queue[i] = queue[i + 1];
		}
		size--;
	}
	public void displayQueue()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.print(queue[i] + "\t");
		}
	}
}
public class CreateQueue 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner input = new Scanner(System.in);
		QueueDemo createQueue = new QueueDemo();
		do
		{
			System.out.println("1: Insert element");
			System.out.println("2: Delete element");
			System.out.println("3: Display queue");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("Enter element: ");
					int element = input.nextInt();
					createQueue.insertElement(element);
					break;
				case 2:
					createQueue.deleteElement();
					break;
				case 3:
					System.out.print("Elements of queue are ");
					createQueue.displayQueue();
					System.out.print("\n");
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 3);
		input.close();
	}
}
