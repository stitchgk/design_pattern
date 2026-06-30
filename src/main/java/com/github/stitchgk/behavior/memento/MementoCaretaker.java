package com.github.stitchgk.behavior.memento;

import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class MementoCaretaker {

    private ArrayList<ChessmanMemento> chessmanMemento = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return chessmanMemento.get(i);
    }

    public void setMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento.add(chessmanMemento);
    }

}
