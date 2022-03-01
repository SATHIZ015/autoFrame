package org.sathiz.utils;

import java.io.*;

public class UtilsAmazon {

    public String readFiles(String fileName) throws IOException {
        fileName="home";
        StringBuilder stringBuilder=new StringBuilder();

        File file=new File("src/test/resource/elements/"+fileName+".json");
        file.toPath();
        FileInputStream fin=new FileInputStream(file);

        InputStreamReader reader=new InputStreamReader(fin);
        BufferedReader lineReader=new BufferedReader(reader);
        while (lineReader.readLine()!=null){
            stringBuilder.append(lineReader);
        }

        return stringBuilder.toString();
    }
}
