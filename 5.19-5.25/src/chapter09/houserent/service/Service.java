package chapter09.houserent.service;

import chapter09.houserent.domain.House;

public class Service {

    private House[] houses;

    public Service(int size){

        houses = new House[size];

    }
    public House[] list(){
        return houses;
    }
}
