/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buimi
 */
public class BufferedReadWrite {

    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Quang", 9, "CNTT"));
        list.add(new Student("An", 8, "TKDH"));
        list.add(new Student("Binh", 6, "KTCK"));
        list.add(new Student("Luan", 1, "TCNH"));
        List<Student> listin = new ArrayList<>();
        String FileName = "D:\\SvCharacter.dat";
        writeToFileText(list, FileName);
        readFormToFile(listin, FileName);
        for (Student sv : listin) {
            System.out.println(sv);
        }
    }

    public static void writeToFileText(List<Student> list, String FileName) {
        try {
            FileWriter fw = new FileWriter(FileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i).toString();
                bw.write(temp + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void readFormToFile(List<Student> listSV, String FileName) throws IOException {
        try {
            FileReader frr = new FileReader(FileName);
            BufferedReader br = new BufferedReader(frr);
            String text;
            while((text = br.readLine())!=null){
                String []detailSV = text.split("-");
                String name = detailSV[0];
                double diem = Double.parseDouble(detailSV[1]);
                String major = detailSV[2];
                Student sv =  new Student(name, diem, major);
                listSV.add(sv);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
