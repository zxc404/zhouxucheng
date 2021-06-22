package chapter13.compare_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

//        int[] arr = {-3,33,32,5,667,-23};
//        IntStream stream = Arrays.stream(arr);
//        Stream integerStream = stream.boxed();
//        Integer[] array = (Integer[]) integerStream.toArray(Integer[]::new);
        Integer[] array = {-3,33,32,5,667,-23};
        Arrays.sort(array,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
