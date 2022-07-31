package Planner;

public class Main {
    public static void main(String[] args) {
        FileImport fileImport = new FileImport();
        System.out.println(fileImport.readFile("C:\\Users\\Андрей\\Desktop\\JavaGB\\Homeworks\\src\\Planner\\planner.xml"));


        FileExport fileExport = new FileExport();

        Data data = new Data (2, "Take order", "30.07.2022", "18:00", "04.08.2022",
                "Ivanov", "Ivan", Priority.LOW);
        fileExport.writeData(data,
                "C:\\Users\\Андрей\\Desktop\\JavaGB\\Homeworks\\src\\Planner\\planner.xml");
    }
}
