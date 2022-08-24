package com.zwzhong.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Stu {
    private String[] names;
    public List<Book> list;
    public Map<String,String> map;

    public Stu() {
    }

    public Stu(String[] names, List<Book> list, Map<String, String> map) {
        this.names = names;
        this.list = list;
        this.map = map;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "names=" + Arrays.toString(names) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
