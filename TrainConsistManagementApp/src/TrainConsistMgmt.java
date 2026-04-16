import java.util.Arrays;

public class TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("UC17 - Sorting Bogie Names using Arrays.sort()\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed ...");
    }
}