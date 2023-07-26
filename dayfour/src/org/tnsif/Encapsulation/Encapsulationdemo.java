package org.tnsif.Encapsulation;

public class Encapsulationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC();
		h.setAccoutNo(12345676723L);
		h.setAccountType("current");
		h.setCvvNo(333);
		h.setPinNO(1221);
		System.out.println(h.getAccoutNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNO());

	}

}
