package com.bridgelabz.datastructure;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * It contains basic reusable methods like => isLeapYear, => isAnagram, =>
 * isPallindrome, => isPrime, => powerOfTwo, => writeToFile, => read file, =>
 * writeFile, => printDate, => getFormattedDate, => reverseString, =>
 * countDigits, => factorial, => idGenerator
 * 
 * @author Niranjan C T
 */
public class Util {

	public static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	
	/**
	 * Leap year Check 
	 * @param year
	 * @return boolean
	 */
	public static boolean isLeapYear(int year) {
		if (year >= 1000 && year < 10000) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * After taking string as input => converts to lower case and removes space =>
	 * convert to character array and store it . if length of the character array
	 * matches => sort all the letters in the array => match each characters. if
	 * matches it returns boolean value.
	 * 
	 * @param firstString  as parameter from user.
	 * @param secondString as parameter from user.
	 * @return boolean value if it satisfies the conditions
	 */
	public static boolean isAnagram(String firstString, String secondString) {
		char[] ch1 = firstString.toLowerCase().trim().replaceAll(" ", "").toCharArray();
		char[] ch2 = secondString.toLowerCase().trim().replaceAll(" ", "").toCharArray();

		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				return true;
			}
		}
		return false;
	}
	
	public static int inputInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static String inputString()
	{
		try
		{
			return scanner.next();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static double inputDouble()
	{
		try
		{
			return scanner.nextDouble();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	

	/**
	 * Input String is transfered to temporary string => char array. Swapped char
	 * array is compared with not swapped char array if both equals => returns
	 * boolean value
	 */
	public static boolean isPallindrome(String inputString) {
		if (inputString.length() == 0) {
			return false;
		} else {
			String tempString = inputString;
			char[] ch1 = inputString.toCharArray();
			char[] ch2 = tempString.toCharArray();
			int lastChar = ch1.length - 1;
			/**
			 * first character is swapped with last character . loop continues till mid
			 * character. if odd then mid char is not swapped.
			 */
			for (int i = 0; i < ch1.length / 2; i++) {
				char temp = ch1[i];
				ch1[i] = ch1[lastChar - i];
				ch1[lastChar - i] = temp;
			}
			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * checks the conditions and returns whether the input value is prime or not.
	 * {@code only works for if number is greater than 1}
	 */
	public static boolean isPrime(int number) {
		if (number <= 0) {
			return false;
		} else {
			if (number == 1) {
				return false;
			} else {
				/**
				 * continues till the middle of the number. checks whether number is divisible
				 * by divisor if divisible returns boolean value.
				 */
				for (int divisor = 2; divisor <= number / 2; divisor++) {
					if (number % divisor == 0) {
						return false;
					}
				}
			}
			return true;
		}
	}

	/**
	 * takes input parameter date in String and returns date in Date format.
	 */
	public static Date printDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
			return null;
		}

	}

	/**
	 * takes date as input and returns formated date.
	 * 
	 * @param date in String format.
	 * @return formated date in date format.
	 */
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);

	}

	/**
	 * takes file location as parameter and read the file in string format.
	 * 
	 */
	public static String readFile(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;
		String data = "";
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				data += sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} finally {
			sc.close();
		}
		return data;
	}

	/**
	 * Takes input data and file location as i/p and writes in the file if file not
	 * present it creates and write in it. if present it simply writes in it.
	 */
	public static void writeToFile(String data, String fileName) {
		File file = new File(fileName);
		FileWriter writer = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			// Writes the content to the file
			writer = new FileWriter(file);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Takes a new String as input and after revering returns the String value.
	 *
	 */
	public static String reverseString(String str) {
		String reverse = "";
		if (!str.isEmpty()) {
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
		}
		return reverse;
	}

	/**
	 * to count the digits in a number
	 */
	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			++count;
		}
		return count;
	}

	/**
	 * first two numbers are converted to String then to character array. if their
	 * length matches then arrays are sorted then they are compared by if all
	 * matches then anagram condition true.
	 */
	public static boolean isAnagram(int firstNumber, int secondNumber) {
		char[] ch1 = Integer.toString(firstNumber).toCharArray();
		char[] ch2 = Integer.toString(secondNumber).toCharArray();
		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Takes number as input parameter to find factorial. if number if greater than
	 * one then it find factorial of the input number and returns integer value.
	 */
	public static int factorial(int number) {
		int factorial = 1;
		if (number == 0)
			return 0;
		else {
			while (number > 1) {
				factorial = factorial * number;
				number--;
			}
			return factorial;
		}
	}

	/**
	 * This function generate random id.
	 */
	public static String idGnerator() {
		String inputId = "#Du";
		inputId += random.nextInt(10000);
		return inputId;
	}
	
	/**
	 * Algorithm programs Anagram detection using two strings
	 */

	public static int[] bubbleSortforIntegers(int[] arr) {
		int temp;
		int[] narr = arr;
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr.length - 1; j++) {
				if (narr[j] > narr[j + 1]) {
					temp = narr[j];
					narr[j] = narr[j + 1];
					narr[j + 1] = temp;
				}
			}
		}
		return narr;
	}

}
