package com.liang;
final class StringDemo {
	char[] str;
	StringDemo(String str) {
		this.str = str.toCharArray();
	}
	public String toString() { // Override
		String s = new String(str);
		return s;
	}
	int length() {
		return str.length;
	}
	int indexOf(char[] arr) {
		int i, j;
		for (i = 0; i < str.length; i++) {
			for (j = 0; j < arr.length && i + j < str.length; j++) {
				if (str[i + j] != arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				return i;
			}
		}
		return -1;
	}
	char charAt(int index) {
		return str[index];
	}
	char[] concat(char[] arr) {
		char[] s = new char[str.length + arr.length];
		for (int i = 0; i < str.length; i++) {
			s[i] = str[i];
		}
		for (int i = str.length, j = 0; j < arr.length; i++, j++) {
			s[i] = arr[j];
		}
		str = s;
		return str;
	}
	boolean equals(char[] arr) {
		return compareTo(arr) == 0;
	}
	char[] substring(int index) {
		char[] arr = new char[str.length - index];
		for (int i = index; i < str.length; i++) {
			arr[i - index] = str[i];
		}
		return arr;
	}
	char[] substring(int beg, int end) {
		char[] arr = new char[end - beg];
		for (int i = beg; i < end; i++) {
			arr[i - beg] = str[i];
		}
		return arr;
	}
	int compareTo(char[] arr) {
		int i, j;
		for (i = 0, j = 0; i < str.length && j < arr.length; i++, j++) {
			if (str[i] != arr[j]) {
				return str[i] - arr[j];
			}
		}
		if (i != str.length) {
			return str[i];
		} else if (j != arr.length) {
			return -arr[j];
		}
		return 0;
	}
	int compareToIgnoreCase(char[] arr) {
		int i, j;
		for (i = 0, j = 0; i < str.length && j < arr.length; i++, j++) {
			
			if (Character.toUpperCase(str[i]) > Character.toUpperCase(arr[j])) {
				return 1;
			} else if (Character.toUpperCase(str[i]) > Character.toUpperCase(arr[j])) {
				return -1;
			}
		}
		if (i != str.length) {
			return 1;
		} else if (j != arr.length) {
			return -1;
		}
		return 0;
	}
	boolean contains(char[] arr) {
		for (int i = 0; i < str.length; i++) {
			int j;
			for (j = 0; j < arr.length && i + j < str.length; j++) {
				if (str[i + j] != arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				return true;
			}
		}
		return false;
	}
	char[] toLowerCase() {
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 65 && str[i] <= 90) {
				str[i] += 32;
			}
		}
		return str;
	}
	char[] toUpperCase() {
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 97 && str[i] <= 122) {
				str[i] -= 32;
			}
		}
		return str;
	}
	boolean startsWith(char[] arr) {
		int i;
		for (i = 0; i < arr.length && i < str.length; i++) {
			if (str[i] != arr[i]) {
				return false;
			}
		}
		if (i == arr.length) {
			return true;
		}
		return false;
	}
	boolean endsWith(char[] arr) {
		int i, j;
		for (i = str.length - 1, j = arr.length - 1; i >= 0 && j >= 0; i--, j--) {
			if (str[i] != arr[j]) {
				return false;
			}
		}
		if (j < 0) {
			return true;
		}
		return false;
	}
	char[] trim() {
		int i, j;
		i = 0;
		j = str.length - 1;
		while (i <= j) {
			if (str[i] == ' ' || str[i] == '\t') {
				i++;
			}
			else if (str[j] == ' ' || str[j] == '\t') {
				j--;
			} else {
				break;
			}
		}
		char[] arr = new char[j - i + 1];
		for (int m = i, n = 0; m <= j && n < arr.length; m++, n++) {
			arr[n] = str[m];
		}
		str = arr;
		return str;
	}
	void getChars(int beg, int end, char[] target, int ref) {
		for (int i = ref, j = beg; i < target.length && j < end; i++, j++) {
			target[i] = str[j];
		}
	}
	byte[] getBytes() {
		byte[] arr = new byte[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = (byte)str[i];
		}
		return arr;
	}
}
public class StringManager {
	public static void main(String[] args) {
		
	}
}
