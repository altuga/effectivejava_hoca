package org.effectivejava.examples.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Okuyucu {

    public static void main(String[] args) throws Exception{

        FileInputStream fi = new FileInputStream(new File("nesneler.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // TODO : Read objects


        oi.close();
        fi.close();
    }
}
