package Planner;

import java.io.*;
import java.util.ArrayList;

public class FileExport {

    public void writeData(Data data, String path) {
        try {
            if (!path.endsWith(".csv")) {
                System.out.println("Invalid format");
                return;
            }
            File file = new File(path);
            if (file.exists()) {
                PrintWriter printWriter = new PrintWriter(new FileWriter(new File(path), true));
                printWriter.print("\n" + data);
                printWriter.close();
            } else {
                PrintWriter printWriter = new PrintWriter(new FileWriter(new File(path), true));
                printWriter.print("id,title,date,date_time,deadline,last_name,first_name,priority");
                printWriter.print("\n" + data);
                printWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
