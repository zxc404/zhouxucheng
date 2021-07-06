package chapter15.homework01;

import java.util.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,23,"jack"));
        dao.save("002",new User(2,24,"jac"));
        dao.save("003",new User(3,25,"jak"));
        List<User> list = dao.list();
        System.out.println(list);
        dao.update("002",new User(002,56,"mike"));
        System.out.println("====");
        List<User> list1 = dao.list();
        System.out.println(list1);
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        ArrayList<T> ts = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String key :set) {
            ts.add(get(key));
        }
        return ts;
    }

    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}