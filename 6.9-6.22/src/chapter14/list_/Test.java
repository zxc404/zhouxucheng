package chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Book("红楼梦",123.3,"曹雪芹"));
        list.add(new Book("三国",78.3,"罗贯中"));
        list.add(new Book("水浒传",63.3,"吴承恩"));
        list.add(new Book("西游记",53,"施耐庵"));
        for (Object o :list) {
            System.out.println(o.toString());
        }
        listsort(list);
        for (Object o :list) {
            System.out.println(o.toString());
        }

    }

    @SuppressWarnings({"all"})
    public static void listsort(List list){
        int listsize = list.size();
        for (int i = 0; i <listsize ; i++) {
            for (int j = 0; j <listsize-1 ; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称=" + name  +
                "\t\t价格=" + price +
                "\t\t作者=" + author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
