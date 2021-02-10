package mypack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String s="101111000101110111110000";
		TreeSet<Integer> mySet=new TreeSet<Integer>();
		String[] str=s.split("0");
		for(int i=0;i<str.length;i++) {
			if(str[i].contains("1")) {
				mySet.add(str[i].length());
			}
		}
		
		System.out.println("The maximum is "+mySet.last());
	}

}
