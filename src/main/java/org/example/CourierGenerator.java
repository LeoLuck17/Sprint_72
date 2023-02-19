package org.example;

import java.util.Random;

public class CourierGeneratorData extends GenerateRandomData {

    public Courier getRandomCourier(){
        String login = generateRandomData(10);
        String password = generateRandomData(7);
        String firstName = generateRandomData(8);
        return new Courier(login, password, firstName);
    }
}
