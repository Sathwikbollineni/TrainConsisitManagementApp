import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        String searchKey = "BG309";
        boolean found = false;

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Bogie " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("Bogie " + searchKey + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}