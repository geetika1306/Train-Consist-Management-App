import java.util.Arrays;

public class TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("UC19 - Binary Search for Bogie ID\n");

        // Create array of bogie IDs (unsorted allowed)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure array is sorted (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display sorted bogie IDs
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Display result
        if (found) {
            System.out.println("\n\nBogie ID " + key + " FOUND.");
        } else {
            System.out.println("\n\nBogie ID " + key + " NOT FOUND.");
        }

        System.out.println("\nUC19 searching completed ...");
    }
}