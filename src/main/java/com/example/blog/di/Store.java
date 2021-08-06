package com.example.blog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.beans.JavaBean;

@Service
public class Store {
    private Item item;

//    public void setItem(Item item) {
//        this.item = item;
//    }
//
//    public Item getItem() {
//        return item;
//    }


    @Override
    public String toString() {
        return "Store{" +
                "item=" + item +
                '}';
    }
}
