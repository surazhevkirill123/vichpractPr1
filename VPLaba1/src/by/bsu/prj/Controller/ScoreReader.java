package by.bsu.prj.Controller;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ScoreReader {
    public static void main(String[] args)
    {
        System.out.println(ScoreReader.str());
    }


    public static String str() { FileReader myFile = null;
        String Line="";
        BufferedReader buff = null;
        try {
            myFile=new FileReader(RelFilePath.getResourcePath("scores.txt"));
            buff = new BufferedReader(myFile);
            while (true) {
// считывается строка из файла scores.txt
                String line = buff.readLine();
// проверка достижения конца файла
                if (line == null) break;
                else
                    Line+=line;

            } // конец цикла while
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                buff.close();
                myFile.close();
            }catch(IOException e1){
                e1.printStackTrace();
            }
        }

        return Line;
    } // конец метода main
}
