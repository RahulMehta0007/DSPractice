package com.pj;

public class PJTest {

	public static void main(String[] args) {
		String xyz="Home Cover Insuranc Renewal Notice";	
		String legalEntity=xyz.substring(xyz.length()-8);
		System.out.println(legalEntity);
		System.out.println(xyz.substring(xyz.length()-10,xyz.length()-9));
		System.out.println(xyz.substring(xyz.length()-13,xyz.length()-11));
		
String raju="raju";
	if(xyz.indexOf(":")!= -1){
		System.out.println(xyz.substring(0,xyz.indexOf(":")));
	}
	else
		System.out.println(xyz);
	
		
		
	}

}
