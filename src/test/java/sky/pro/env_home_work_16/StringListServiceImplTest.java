package sky.pro.env_home_work_16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListServiceImplTest {
    private final StringListServiceImpl out = new StringListServiceImpl();
    String[] lists = {"Tom", "Alice", "Kate", "Sam"};

    @Test
    public void StringListTestAdd() {
     assertEquals("Sami", out.add("Sami"));
    }
    @Test
    public void StringListTestAddIndex() {
        assertEquals("Sami", out.addIndex(1,"Sami"));
    }
    @Test
    public void StringListTestSet() {
        assertEquals("Sami", out.set(1,"Sami"));
    }
    @Test
    public void StringListTestRemove() {
        assertEquals("Sam", out.remove("Sam"));
    }
    @Test
    public void StringListTestRemoveIndex() {
        assertEquals("Tom", out.removeIndex(0));
    }
    @Test
    public void StringListTestContains() {
        assertEquals(true, out.contains("Tom"));
    }
    @Test
    public void StringListTestIndexOf() {
        assertEquals(0, out.indexOf("Tom"));
    }
    @Test
    public void StringListTestLastIndexOf() {
        assertEquals(0, out.lastIndexOf("Tom"));
    }
    @Test
    public void StringListTestGet() {
        assertEquals("Tom", out.get(0));
    }
    @Test
    public void StringListTestEquals() {
        String[] lists_ = new String[4];
        lists_[0] = "Tom";
        lists_[1] = "Alice";
        lists_[2] = "Kate";
        lists_[3] = "Sam";
        assertEquals(true, out.equals(lists_));
    }
    @Test
    public void StringListTestSize() {
        assertEquals(4, out.size());
    }
    @Test
    public void StringListTestIsEmpty() {
        assertEquals(false, out.isEmpty());
    }
}
