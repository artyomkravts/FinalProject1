import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    private static Bun bun;

    @Test
    public void testBunGetName() {
        bun = new Bun("New bun!", 24.6f);
        Assert.assertEquals("New bun!", bun.getName());
    }

    @Test
    public void testBunGetPrice() {
        bun = new Bun("New bun!", 24.6f);
        Assert.assertEquals(24.6f, bun.getPrice(), 0);
    }


}
