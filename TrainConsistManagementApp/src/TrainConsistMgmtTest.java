import static org.junit.Assert.*;
import org.junit.Test;

public class TrainConsistMgmtTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] input = {};
        search(input, "BG101");
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] input = {"BG101", "BG205"};
        search(input, "BG101"); // should NOT throw exception
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertTrue(search(input, "BG205"));
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] input = {"BG101", "BG205", "BG309"};
        assertFalse(search(input, "BG999"));
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] input = {"BG101"};
        assertTrue(search(input, "BG101"));
    }

    // Helper method with validation
    private boolean search(String[] arr, String key) {

        // ---- FAIL-FAST VALIDATION ----
        if (arr.length == 0) {
            throw new IllegalStateException("Bogie list is empty");
        }

        // ---- SEARCH LOGIC ----
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}