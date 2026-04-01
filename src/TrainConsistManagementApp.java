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
        bogieList.add(new Bogie("General", 90));

        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===========================================");

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogieList) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        List<Bogie> filteredList = bogieList
                .stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredList) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        System.out.println("\nUC8 filtering completed...");
    }
}