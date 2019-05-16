
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import task4.dao.IDAOCart;
import task4.dao.IDAOShopStorage;
import task4.dao.impl.DaoCartImpl;
import task4.entity.Beer;
import task4.service.CartService;
import task4.service.OrderService;
import task4.service.ShoppingStorageService;
import task4.service.impl.CartServiceImpl;
import task4.service.impl.ShoppingStorageServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    IDAOShopStorage daoShopStorage;

//    @Mock
//    IDAOCart daoCart;

    @Spy
    IDAOCart daoCart=new DaoCartImpl();

    @Spy
    HashMap<Beer, Integer> shoppingCart = new HashMap<>();

    @Mock
    OrderService orderService;

    @Mock
    ShoppingStorageService shoppingStorageService;

    @Mock
    ArrayList<Beer> shoppingStorage;

    @InjectMocks
    CartService cartService = new CartServiceImpl(daoCart, shoppingStorageService, orderService);

    @Test
    public void addItemToShoppingCartTest() {
        Beer beer = new Beer(1, 300, "1", 30, "Ukraine");
        when(shoppingStorageService.getBeerByName(beer.getName())).thenReturn(beer);
        when(daoCart.addProduct(beer, 12)).thenReturn(true);
        cartService.addProductIntoCart(beer.getName(), 12);
        verify(shoppingStorageService, times(1)).getBeerByName(beer.getName());
        verify(daoCart, times(1)).addProduct(beer, 12);
    }

}
