public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Product shoes;
    Product jeans;
    Product shirt;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket();
        shoes = new Product("Shoes", 5000);
    }

    @Test
    public void canAddProduct(){
        shoppingBasket = new ShoppingBasket();
        shoppingBasket.addProduct(shoes);
        Integer expected = 1;
        assertEquals(expected, shoppingBasket.getBasketSize());
    }

    @Test
    public void canRemoveItem(){
        shoppingBasket = new ShoppingBasket();
        shoppingBasket.deleteProduct(shoes);
        Integer expected = 0;
        assertEquals(expected, shoppingBasket.getBasketSize());
    }

    @Test
    public void canEmptyBasket(){
        shoppingBasket = new ShoppingBasket();
        shoppingBasket.emptyBasket();
        Integer expected = 0;
        assertEquals(expected, shoppingBasket.getBasketSize());
    }
}