package com.pulan.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMenuUtil {
    public static String ReadMenuStr(String fullFileName){
    	//String fullFileName = "E:/a.json";
        
        File file = new File(fullFileName);
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block  
                   e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return buffer.toString();
    }
}
