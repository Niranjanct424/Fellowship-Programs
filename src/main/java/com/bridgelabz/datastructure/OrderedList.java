package com.bridgelabz.datastructure;


public class OrderedList {
	private static LinkedList<Integer> list = new LinkedList<Integer>();

	/**
	 * it does the operation as per user instructions.
	 * 
	 * @param number as input by the user for operation
	 * @param list   Linked list for storing data.
	 */
	public static void addRemoveOperation(int number, LinkedList<Integer> list) {
		if (list.search(number)) {
			list.deleteData(number);
			System.out.println(number + " found! & " + " succesfully deleted...");
		} else {
			list.insert(number);
			System.out.println(number + " not found! & " + " succesfully added...");
		}
	}

	/**
	 * converts String array to integer array.
	 * 
	 * @param stringArray as input parameter
	 * @return integerArray
	 */
	public static int[] convertingStringToInteger(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++)
		{
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		return intArray = Util.bubbleSortforIntegers(intArray);
	}

	/**
	 * it takes integer Array as input and convert to linked list.
	 * 
	 * @param intArray as input to be converted to linked List.
	 * @return linkedList
	 */
	private static LinkedList<Integer> convertingArrayToList(int[] intArray) 
	{
		for (Integer data : intArray) {
			list.insert(data);
		}
		return list;
	}

	public static void main(String[] args) {

		// collected data stored in String array
		String[] stringArray = Util.readFile("Integers.txt").split(",");

		int[] intArray = convertingStringToInteger(stringArray);

		convertingArrayToList(intArray);

		System.out.println("List length : " + list.length() + "\nCurrent List\n-------------");
		list.print();

		System.out.println("Please Enter Integer data for operation :");
		int operationalData = Util.scanner.nextInt();
		addRemoveOperation(operationalData, list);

		list.print();

	}

}