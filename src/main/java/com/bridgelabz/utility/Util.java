package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.basic.Response;

public class Util {
	static Scanner scanner = new Scanner(System.in);

	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static String inputString() {
		try {
			return scanner.next();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int isdigit() {
		try {
			return scanner.nextInt();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static boolean isGreaterthanZero(int no) {
		if (no > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean digitlength(int year) {
		if ((year > 999) && (year < 9999)) {
			return true;
		}

		return false;
	}

	// Basic Core Programs Week1
	public static String replaceString(String str) {
		String s = "Hello <<UserName>>, How are you?";
		String result = s.replace("<<UserName>>", str);
		return result;
	}
	/**
	 * @implNote created setters and getters
	 * for Flip coin program
	 */
	private static double h;
	private static double t;
	public static void FlipCoin(double number) {
		int head = 0, tail = 0;
		double[] ar = new double[2];
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				double flipCoin = Math.random() * 1;
				if (flipCoin < 0.5) {
					tail++;
				} else {
					head++; 
				}
			}
			 h = head * 100 / number;
			 t = tail * 100 / number;
		}
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public static boolean isLeapYear(int year) {
		try {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static int powerOfTwo(int no) {
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "-" + (i * j) * (i * j) + " ");
			}
			System.out.println(" ");
		}
		return no;
	}

	public static double harmonicNumber(double no) {
		double harmonic = 1;
		if (no != 0) {
			for (int i = 2; i <= no; i++) {
				harmonic += (double) 1 / i;
			}
		}
		return harmonic;
	}

	public static void primeFactors(int no) {
		for (int i = 2; i * i <= no; i++) {
			while (no % i == 0) {
				System.out.print(" " + i);
				no = no / i;
			}
		}
		if (no > 2) {
			System.out.print(" " + no);
		}
	}

	// Functional programming
	public static int[][] TwoDarray(int rows, int coloums) {
		int[][] arr = new int[rows][coloums];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloums; j++) {
				arr[i][j] = inputInteger();
			}
		}
		return arr;
	}

	public static void SumOfThreeIntegersZero(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + "   " + arr[j] + "   " + arr[k] + " = 0 ");
					}
				}
			}
		}
	}

	public static double distance(int x, int y) {
		double distance = Math.sqrt((x * x) + (y * y));
		return distance;
	}

	public static void Quadratic(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			double root1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
			double root2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + root1 + " and " + root2);
		} else if (delta == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}

	}

	public static void WindChild(double t, double v) {
		if ((t > 50 || (v > 120 || v < 3))) {
			System.out.println(
					"Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger\r\n"
							+ "than 120 or less than 3 (you may assume that the values you get are in that range).");
		} else {
			double weather = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println(" temprature is " + weather);
			System.out.println("the National Weather Service defines the effective temperature Wild is chill");
		}
	}

	// Logical programming
	public static void gambler(int stake, int goal, int trails) {
		int bets = 0;
		int wins = 0;
		for (int i = 0; i < trails; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
				if (cash == goal) {
					wins++;
				}
			}
		}
		double W = 100.0 * wins / trails;
		System.out.println(wins + " Wins Out of " + trails);
		System.out.println("Percentage of games WON " + W);
		System.out.println("percentage of games Lose " + (100.0 - W));
	}

	// Generate coupon numbers
	public static Set<String> couponNumbers(int n) {
		Set<String> set = new HashSet<String>();
		String coupons;
		Random rd = new Random();
		char[] carr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < 10000; i++) {
			char c1 = (carr[(int) (Math.random() * (carr.length))]);
			int c2 = (int) (Math.random() * 9);
			coupons = c1 + ((int) (Math.random() * 10) + 1000 + (int) (Math.random() * 10) + 1000 + "" + c2);

			if (!set.contains(coupons))
				;
			{
				set.add(coupons);
			}
			if (set.size() == n) {
				break;
			}
		}
		return set;
	}

	// Stop watch Elapsed time between start and end time.
	public static long stopWatch() {
		long s = 0;
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + " start time : " + start);
			Thread.sleep(4000);
			long end = System.currentTimeMillis();
			System.out.println(new Date() + " end time : " + end);
			long difference = end - start;
			// 1000 miliseconds = 1 seconds
			s = (difference / 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;
	}

	// Algorithm programs
	// Anagram detection using two strings

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

	public static String[] bubbleSortforStrings(String[] arr) {
		String temp;
		String[] narr = arr;
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr.length - 1; j++) {
				if (narr[j].compareTo(narr[j + 1]) > 0) {
					temp = narr[j];
					narr[j] = narr[j + 1];
					narr[j + 1] = temp;
				}
			}
		}
		return narr;
	}

	public static int[] insertionSortforIntegers(int[] arr) {
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			j = i;
			temp = arr[i];
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		return arr;
	}

	public static String[] insertionSortforStrings(String[] arr) {
		String temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			j = i;
			temp = arr[i];
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		return arr;
	}

	public static ArrayList<Integer> bubblesortforIntusingGeneric(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

	public static ArrayList<String> bubblesortforStingsusingGeneric(String[] arr) {
		String temp;
		String[] narr = arr;
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr.length - 1; j++) {
				if (narr[j].compareTo(narr[j + 1]) > 0) {
					temp = narr[j];
					narr[j] = narr[j + 1];
					narr[j + 1] = temp;
				}
			}
		}
		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < narr.length; i++) {
			s.add(narr[i]);
			System.out.print(narr[i] + " ");
		}
		return s;
	}

	public static ArrayList<String> insertionSortforStingsusingGeneric(String[] arr) {
		String temp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			j = i;
			temp = arr[i];
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		return s;
	}

	public static ArrayList<String> genericBubbleSortforStrings(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		return s;
	}

	// merge sort
	static int[] arr;
	static int[] temparr;
	static int length;

	public static void sort(int[] arrtoSort) {
		arr = arrtoSort;
		length = arr.length;
		temparr = new int[length];
		mergesort(0, length - 1);
	}

	public static void mergesort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(low, mid);
			mergesort(mid + 1, high);
			merge(low, mid, high);
		}

	}

	public static void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temparr[i] = arr[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temparr[i] < temparr[j]) {
				arr[k] = temparr[i];
				i++;
			} else {
				arr[k] = temparr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			arr[k] = temparr[i];
			i++;
			k++;
		}
	}
	// merge sort ended

	public static int binarySearchforWordList(String[] arr, String item) {
		String[] a = bubbleSortforStrings(arr);
		int li = 0;
		int hi = arr.length - 1;
		int mid = li + hi / 2;
		while (li <= hi) {
			if (a[mid].equals(item)) {
				return mid;
			} else {
				if (a[mid].compareTo(item) < 0) {
					li = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
			mid = (li + hi) / 2;
		}
		return mid;
	}

	public static int binarySearch(int arr[], int first, int last, int key) {
		int[] ar = bubbleSortforIntegers(arr);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (ar[mid] < key) {
				first = mid + 1;
			} else if (ar[mid] == key) {
				return mid;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
		return mid;
	}

	public static boolean anagram(String str1, String str2) {
		char[] sarr1 = str1.toLowerCase().toCharArray();
		char[] sarr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(sarr1);
		Arrays.sort(sarr2);

		String s1 = new String(sarr1);
		String s2 = new String(sarr2);

		// System.out.println(s1);
		// System.out.println(s2);
		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
	}

	/** Returns true if strings are anagram else returns false **/
	public static boolean anagram2(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	static int count = 0;
	static int count1 = 0;

	public static ArrayList<String> anagram1(String str1, String str2) {

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr1 = new ArrayList<String>();

		char[] sarr1 = str1.toLowerCase().toCharArray();
		char[] sarr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(sarr1);
		Arrays.sort(sarr2);

		String s1 = new String(sarr1);
		String s2 = new String(sarr2);

		// System.out.println(s1);
		// System.out.println(s2);
		if (s1.equals(s2)) {
			// System.out.println(s1+" "+s2);
			arr.add(s1);
			System.out.print(s1 + " ");
			// count++;
		}
		return arr;
	}

	public static int[] prime() {
		int[] arr = new int[170];
		int g = 0;
		for (int i = 1; i < 1000; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				arr[g] = i;
				g++;
			}
		}
		return arr;
	}

	public static String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}

	public static int[] isPrimeNumsArePalindrome() {
		int[] intarr = new int[1000];
		for (int i = 2; i < 1000; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				for (int k = 0; k < intarr.length; k++) {
					intarr[k] = i;
				}
			}
		}

		return intarr;
	}

	public static String[] primePalindromes() {
		int count = 0;
		int[] arr = isPrimeNumsArePalindrome();
		String[] palindrimenumbers = new String[109];
		for (int i = 0; i < arr.length; i++) {
			String str = Integer.toString(i);
			String reverse = "";
			for (int b = str.length() - 1; b >= 0; b--) {
				reverse = reverse + str.charAt(b);
			}
			if (str.equals(reverse)) {
				palindrimenumbers[count] = str;
				count++;
			}

		}
		return palindrimenumbers;
	}

	public static ArrayList<String> customizeMessage() throws IOException {
		String m1 = "", m2 = "", m3 = "", m4 = "";
		String s = "";
		String line = "";
		ArrayList<String> as = new ArrayList<String>();
		String message = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/bridgelabz/Desktop/messgae.txt"));
			while ((line = br.readLine()) != null) {
				s = line;
				m1 = s.replaceFirst("<<name>>", "Niranjan");
				m2 = m1.replaceFirst("<<full name>>", "Niranjan Tangodar");
				m3 = m2.replaceFirst("91-xxxxxxxxxx", "91-8880846463");
				m4 = m3.replaceFirst("01/01/2016", "05/01/2020");
				message = m4;
				as.add(m4);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return as;
	}

	public static void printPermutn(String str, String ans) {
		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) // abc
		{
			// ith character of str
			char ch = str.charAt(i); // a

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	// Programs for JUnit Testing
	// day of week function
	public static String dayOfWeek(int d1, int m1, int y1) {
		int x;
		y1 = y1 - (14 - m1) / 12;
		x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		m1 = m1 + 12 * ((14 - m1) / 12) - 2;
		d1 = (d1 + x + 31 * m1 / 12) % 7;

		String[] arr = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String day = arr[d1];
		return day;

	}

	// monthly payment function
	public static double monthlyPayment(double P, double Y, double R) {
		double r = R / (12 * 100);
		double n = 12 * Y;
		double payment = (P * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
		// (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);

		return payment;
	}

	// temperature conversion function
	// to celcius
	public static double temperaturConversion(int tempFahr) {
		double Celc = ((tempFahr - 32) * 5) / 9;
		return Celc;
	}

	// to Fahrenheit
	public static double temperaturConversion1(int tempCel) {
		double Fare = (tempCel * 9 / 5) + 32;
		return Fare;
	}

	// square root of non-negative number
	public static double sqrtofnonnegnumber(double c) {
		double epsilon = 1.0e-15; // relative error tolerance
		double t = c; // estimate of the square root of c

		// repeatedly apply Newton update step until desired precision is achieved
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		return t;
	}

	// toBinary function
	public static int[] toBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		return binary;
	}

	// isPower of two
	public static boolean isPowerTwo(int n) {
		int a = (n & (n - 1));
		if (a == 0) {
			return true;
		}
		return false;
	}

}
