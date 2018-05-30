package com.gggroup.testapp.users;

/**
 * Created by gabber on 30.05.18.
 */

public class User {

    private long id;
    private int age;
    private String name;

    public User(long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  User)){
            return false;
        }
        User user = (User) obj;
        return user.getId()==this.getId();
    }

    @Override
    public int hashCode() {
        return Long.valueOf(id).hashCode();
    }
}
