import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ProductTest {

    Product shoes;

    @Before
    public void before(){
        milk = new Product("Shoes", 5000);
    }

    @Test
    public void testGetName(){
        assertEquals( "Shoes", shoes.getName() );
    }

    @Test
    public void testGetPrice(){
        Integer expected = 5000;
        assertEquals( expected, shoes.getPrice() );
    }
