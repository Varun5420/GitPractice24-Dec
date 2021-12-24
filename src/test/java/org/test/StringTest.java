package org.test;

public class StringTest {
	
	public static void main(String[] args) {
		String str1="yxyvyrun";
		String str2="xyzVarun";
		String str3= new String();
		
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		System.out.println(System.identityHashCode(str3));
//		
//		if(str1==str3) {
//			System.out.println("Matching1");
//		}
//		else if (str1.equals(str3)) {
//			System.out.println("Matching3");
//		}
//		else System.out.println("Not matching");
		
		System.out.println("Code Point At: "+str1.codePointAt(3));
		System.out.println("Code Point Before: "+str1.codePointBefore(3));
		System.out.println("Code Point Count: "+str1.codePointCount(0, 3));
		System.out.println("Compare to Diff: "+str1.compareTo("xyzVarun"));
		System.out.println("Compare to Same: "+str1.compareTo("xyzvarun"));
		System.out.println("Compare to Ignore case "+str1.compareToIgnoreCase("xyzVarun"));
		System.out.println("Hash code "+str1.hashCode());
		System.out.println("Content equals: "+str1.contentEquals(str2));
		System.out.println("Content equals: "+str1.contentEquals(str3));
		System.out.println("Ends with "+str1.endsWith("un"));
		System.out.println("Equals: "+str1.equals(str2));
		System.out.println("Equals Ignorecase: "+str1.equalsIgnoreCase(str2));
		System.out.println("Index ch: "+str1.indexOf('x'));
		System.out.println("Index str: "+str1.indexOf("vy"));
		System.out.println("Index of ch from: "+str1.indexOf('n', 3));
		System.out.println("Index of str from: "+str2.indexOf("Va", 0));
		//*****************Doubt******************************
		System.out.println("Intern: "+str3.intern());
		//****************************************************
		
		System.out.println("Is Empty: "+str3.isEmpty());
		System.out.println(str1.replace('y', 'a'));
		System.out.println(str1.replace("yxy", "xyz"));
		System.out.println(str1.replaceAll(str1, "varun"));
//		str1="varun";
//		System.out.println(str1);
		String[] split = str1.split("y");
		System.out.println(split.length);	
		for (String st:split) {
			System.out.println(st);
			
		}
		
		
	}

}
