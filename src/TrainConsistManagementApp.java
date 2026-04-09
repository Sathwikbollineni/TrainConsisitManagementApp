public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        String searchKey = "BG309";
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Bogie " + searchKey + " found in train consist.");
        } else {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }
}