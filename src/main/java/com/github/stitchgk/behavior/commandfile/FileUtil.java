package com.github.stitchgk.behavior.commandfile;

import java.io.*;
import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class FileUtil {

    public static void writeCommands(ArrayList<Command> commands) {
        try {
            FileOutputStream file = new FileOutputStream("config.log");
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
            objout.writeObject(commands);
            objout.close();
        } catch (FileNotFoundException e) {
            System.out.println("命令保存失败!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("命令保存失败!");
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Command> readCommands() {
        try {
            FileInputStream file = new FileInputStream("config.log");
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(file));
            ArrayList<Command> commands = (ArrayList<Command>) objin.readObject();
            objin.close();
            return commands;
        } catch (FileNotFoundException e) {
            System.out.println("命令读取失败!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("命令读取失败!");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("命令读取失败!");
            throw new RuntimeException(e);
        }
    }

}
