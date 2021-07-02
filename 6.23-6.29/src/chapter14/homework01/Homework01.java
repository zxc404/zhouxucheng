package chapter14.homework01;

import java.util.ArrayList;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework01 {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教徒赴横河\"圣浴\"引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        int size = arrayList.size();
        for (int i=size-1;i>=0;i--){
            System.out.println(arrayList.get(i));
            News news = (News)arrayList.get(i);
            System.out.println(processHeadline(news.getHeadline()));

        }
    }

    public static String processHeadline(String headline){
        if (headline==null){
            return "";
        }
        if (headline.length()>15){
            return headline.substring(0,15)+"···";
        }
        return headline;
    }
}
