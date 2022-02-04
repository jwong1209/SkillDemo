import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testAdd(){
        assertEquals(5, SkillDemo.add(4,3));//failing test
    }
}
