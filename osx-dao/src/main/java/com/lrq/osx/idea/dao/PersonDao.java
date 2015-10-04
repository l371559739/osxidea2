package com.lrq.osx.idea.dao;

import com.lrq.osx.idea.entity.Person;

/**
 * Created by lrq on 15/10/4.
 */
public class PersonDao {
    public Person getPerson(String personId){
        return new Person();
    }

    public Person addPerson(Person p){
        return p;
    }

    public boolean delPerson(Person p){
        return false;
    }



}
