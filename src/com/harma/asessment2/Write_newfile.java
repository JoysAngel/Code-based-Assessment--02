package com.harma.asessment2;

import java.io.FileWriter;
import java.io.IOException;

public class Write_newfile {
    public static void main(String[] args) {
        try {
            FileWriter write= new FileWriter("Data.txt");
            write.write("HAPPY NEW YEAR");
            write.close();
            System.out.println("File Creation Successfully done !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
