package com.tcf.helper;

public class Practise {

	public static void main(String[] args) {

		String day = "today is friday";

//sample ouput="yadot si yadirf";

		String reverse = "";

		String[] split = day.split(" ");

		for (String re : split) {
			
			String reverword = "";

			for (int i = re.length() - 1; i >= 0; i--) {

				reverword =  reverword + re.charAt(i);
				

			}reverse = reverse + reverword + " ";
		}

		System.out.println(reverse);

		

		System.out.println(reverse);

	}
}
