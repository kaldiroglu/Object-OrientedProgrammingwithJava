package org.javaturk.oopj.ch04;

/**
 * https://docs.oracle.com/javase/tutorial/java/IandI/final.html
 */
public class ChessAlgorithm {
    enum ChessPlayer { WHITE, BLACK } // Inner enum
//    ...
    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
//    ...
}
