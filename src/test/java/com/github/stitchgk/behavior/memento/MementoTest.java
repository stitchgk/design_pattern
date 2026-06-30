package com.github.stitchgk.behavior.memento;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class MementoTest {
    private static int index = -1;
    private static MementoCaretaker caretaker = new MementoCaretaker();

    @Test
    public void test() {
        Chessman chessman = new Chessman("车", 1, 1);
        play(chessman);
        chessman.setY(4);
        play(chessman);
        chessman.setX(5);
        play(chessman);
        undo(chessman,index);
        undo(chessman, index);
        redo(chessman, index);
        redo(chessman, index);
    }

    public static void play(Chessman chess) {
        caretaker.setMemento(chess.save());
        index ++;
        System.out.println("当前位置：" + chess.getX() + "，" + chess.getY());
    }

    public static void undo(Chessman chess, int i) {
        System.out.println("悔棋");
        index --;
        chess.restore(caretaker.getMemento(i - 1));
        System.out.println("当前位置：" + chess.getX() + "，" + chess.getY());
    }

    public static void redo(Chessman chess, int i) {
        System.out.println("撤销悔棋");
        index ++;
        chess.restore(caretaker.getMemento(i + 1));
        System.out.println("当前位置：" + chess.getX() + "，" + chess.getY());
    }

}
