import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.Arrays;

public class TrainConsistMgmtTest {

    @Test
    public void testBinarySearch_BogieFound() {
        String[] input = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(binarySearch(input, "BG309"));
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] input = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(binarySearch(input, "BG999"));
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertTrue(binarySearch(input, "BG101"));
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertTrue(binarySearch(input, "BG309"));
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] input = {"BG101"};
        assertTrue(binarySearch(input, "BG101"));
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] input = {};
        assertFalse(binarySearch(input, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] input = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        assertTrue(binarySearch(input, "BG205"));
    }

    // Helper method for Binary Search
    private boolean binarySearch(String[] arr, String key) {

        if (arr.length == 0) return false;

        // Ensure sorted
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}