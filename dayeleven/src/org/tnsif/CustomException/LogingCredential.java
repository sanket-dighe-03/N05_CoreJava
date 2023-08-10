package org.tnsif.CustomException;

public class LogingCredential extends Exception{
	//private data member program to demonstate on user define exception
private String str;



public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}
//this is parametrized constructor

public LogingCredential(String str) {
	super();
	this.str = str;
}

@Override
public String toString() {
	return "LogingCredentitial [str=" + str + "]";
}


}
