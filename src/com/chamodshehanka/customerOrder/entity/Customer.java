package com.chamodshehanka.customerOrder.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/

@Entity
public class Customer extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;
    private String contact;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Orders> orderList=new ArrayList<>();

    public Customer() {
    }

    public Customer(int sid,String name, String contact, List<Orders> orderList) {
        this.sid=sid;
        this.name = name;
        this.contact = contact;
        this.orderList = orderList;
    }

    public Customer(String name, String contact, List<Orders> orderList) {
        this.name = name;
        this.contact = contact;
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", orderList=" + orderList +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }
}
