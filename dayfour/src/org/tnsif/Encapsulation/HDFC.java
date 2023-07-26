/* program to demonstrate  on encapsuation */
package org.tnsif.Encapsulation;

public class HDFC {
	private long AccoutNo;
	private int cvvNo;
	private String accountType;
	private int pinNO;
	/* this is getters and setters*/
	public long getAccoutNo() {
		return AccoutNo;
	}
	public void setAccoutNo(long AccoutNo) {
		AccoutNo = AccoutNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNO() {
		return pinNO;
	}
	public void setPinNO(int pinNO) {
		this.pinNO = pinNO;
	}
	

}
