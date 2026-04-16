public class TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("UC18 - Linear Search for Bogie ID\n");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogie IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Linear Search Logic
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop early when found
            }
        }

        // Display result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND in the consist.");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND.");
        }

        System.out.println("\nUC18 searching completed ...");
    }
}