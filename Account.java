package com.account.encapsulation;

public class Account {
	private String name;
	private long accno;
	private double bal;

	public Account(String name, long accno) {
		super();
		this.name =name;
		this.accno=accno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public long getAccno(){
		return accno;	
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal=bal;
	}
}
