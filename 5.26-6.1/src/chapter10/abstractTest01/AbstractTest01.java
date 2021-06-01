package chapter10.abstractTest01;

import javafx.concurrent.Worker;

public class AbstractTest01 {

    public static void main(String[] args) {

        Manager jack = new Manager("jack", 123, 11122.1, 800);
        jack.work();
        CommonWorker peter = new CommonWorker("peter", 999, 3000);
        peter.work();
    }
}
