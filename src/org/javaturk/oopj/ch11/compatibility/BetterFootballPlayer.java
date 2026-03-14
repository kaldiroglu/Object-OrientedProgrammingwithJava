package org.javaturk.oopj.ch11.compatibility;

public class BetterFootballPlayer implements FootballPlayer {

	@Override
	public void play() {
		System.out.println("BetterFootballPlayer is playing football!");		
	}            
	
//	@Override
//	public void behaveEthically() {
//		System.out.println("BetterFootballPlayer behaves ethcially!");		
//	}
	
}
