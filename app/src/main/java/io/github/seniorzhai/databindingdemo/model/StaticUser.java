package io.github.seniorzhai.databindingdemo.model;

/**
 * Created by zhaitao on 15/8/14.
 */
public class StaticUser {
    public String name;
    public int age;

    public StaticUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAudlt (){
        return this.age >=18;
    }

    public String getName() {
        return this.name;
    }

}
