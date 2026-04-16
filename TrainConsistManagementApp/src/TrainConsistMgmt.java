public class TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("UC20 - Exception Handling During Search\n");

        // Empty bogie array (test fail-fast)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        try {
            // ---- FAIL-FAST VALIDATION ----
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in the train!");
            }

            // ---- SEARCH LOGIC (Linear Search) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed ...");
    }
}