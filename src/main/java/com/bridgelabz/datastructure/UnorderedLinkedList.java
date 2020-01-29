package com.bridgelabz.datastructure;


public class UnorderedLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		String[] array = Util.readFile("Strings.txt").split(",");
		for (String str : array) 
		{
			list.insert(str);
		}
		list.print();
		System.out.println("Please insert String data for insertion operation :");
		String inputData = Util.scanner.nextLine();
		list.insert(inputData);
		System.out.println("Please insert String data for insertion operation and position :");
		list.insert(Util.scanner.nextLine(), Util.scanner.nextInt());

		System.out.println("Number of the words "+list.length());
		System.out.println(list.printString());

		Util.writeToFile(list.printString(), "NewStrings.txt");

	}

}