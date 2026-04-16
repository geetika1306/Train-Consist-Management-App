import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TrainConsistMgmtTest {

    @Test
    public void testSearch_BogieFound() {
        String[] input = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(linearSearch(input, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] input = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(linearSearch(input, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertTrue(linearSearch(input, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertTrue(linearSearch(input, "BG309"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] input = {"BG101"};
        assertTrue(linearSearch(input, "BG101"));
    }

    // Helper method for linear search
    private boolean linearSearch(String[] arr, String key) {
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }
}