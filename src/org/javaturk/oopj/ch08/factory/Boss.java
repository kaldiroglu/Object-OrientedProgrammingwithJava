package org.javaturk.oopj.ch08.factory;

public class Boss {
	private int insallah;
	int j;
	protected int partyTime;
	public int getPartyTime() {
		return partyTime;
	}

	public void setPartyTime(int partyTime) {
		this.partyTime = partyTime;
	}
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}
}
