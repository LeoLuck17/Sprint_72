import io.restassured.response.ValidatableResponse;
import org.example.GenerateRandomData;
import org.example.Order;
import org.example.OrderClient;
import org.example.OrderList;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.junit.Assert.assertEquals;

public class GetOrderListTest {
//    OrderList orderList;
//    OrderClient orderClient;
//    @Test
//    public void getListOrder(){
//        ValidatableResponse response = orderClient.getOrder(orderList);
//        int statusCode = response.extract().statusCode();
//        assertEquals(200, statusCode);
//    }
//    @Before
//    public void setUp(){
//        orderClient = new OrderClient();
//    }
//
//    @Test
//    public void createOrder(){
//        String[] color = new String[]{"BLACK"};
//        Order order = new Order("Naruto", "Uchiha", "Konoha, 142 apt.", 4, "+7 800 355 35 35", 5, "2020-06-06", "Saske, come back to Konoha", color);
//        System.out.println(order);
//        ValidatableResponse response = orderClient.createOrder(order);
//        int statusCode = response.extract().statusCode();
//        int track = response.extract().path("track");
//        System.out.println(track);
//        System.out.println(statusCode);
//        assertEquals(SC_CREATED, statusCode);
//    }
    @Test
    public void chechInt(){
        String deliveryDate = "2020"+"-"+ ThreadLocalRandom.current().nextInt(10,12) + "-" + ThreadLocalRandom.current().nextInt(1,30);
        System.out.println(deliveryDate);
    }
    @Test
    public void fgdfg(){
        String[] station = GenerateRandomData.randomNearestStation(3);
        System.out.println(Arrays.toString(station));
    }
}
