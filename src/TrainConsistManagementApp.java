import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("AC Chair", 60));

        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("===========================================");

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogieList) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        Map<String, List<Bogie>> grouped = bogieList
                .stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogies:\n");

        for (String key : grouped.keySet()) {
            System.out.println("Bogie Type: " + key);
            for (Bogie b : grouped.get(key)) {
                System.out.println("  Capacity -> " + b.getCapacity());
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}