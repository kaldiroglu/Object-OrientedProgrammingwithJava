package org.javaturk.oopj.ch11.multipleInheritance.v2;

public class Test {

	public static void main(String[] args) {
		Pianist pianist = new MyPianist();
		pianist.play();
		
		Artist artist = new MyArtist();
		artist.play();
	}
}
