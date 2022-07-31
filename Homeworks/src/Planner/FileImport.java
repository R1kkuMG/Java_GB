package Planner;

import java.io.*;
import java.util.ArrayList;

public class FileImport {

    public ArrayList<Data> readFile(String path) {
        ArrayList<Data> data = new ArrayList<>();
        try {
            if (!path.endsWith(".csv")) {
                System.out.println("Invalid format");
                return data;
            }
            File file = new File(path);
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String string = br.readLine();
                string = br.readLine();
                while (string != null) {
                    data.add(createData(string));
                    string = br.readLine();
                }
            } else {
                System.out.println("File is not found");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    private Data createData(String string) {
        String[] strArray = string.split(",");
        Data data = new Data(Integer.parseInt(strArray[0]), strArray[1], strArray[2], strArray[3], strArray[4],
                strArray[5], strArray[6], Priority.valueOf(strArray[7]));
        return data;
    }
}

