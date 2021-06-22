package chapter13.compare_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        Book book1 = new Book("《红楼梦》", 100);
        Book book2 = new Book("《新金瓶梅》", 90);
        Book book3 = new Book("《青年文摘20年》", 5);
        Book book4 = new Book("《java从入门到放弃》", 300);
        Book[] books = {book1,book2,book3,book4};
        /**
         * 功能：按照价格从大到小排列
         */
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                double a = book1.getPrice() - book2.getPrice();
                if(a>0){
                    return -1;
                }else if(a<0){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(books));

        /**
         * 功能：按照名字长度从短到长排列
         */
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                double a = book1.getName().length() - book2.getName().length();
                if(a>0){
                    return 1;
                }else if(a<0){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
