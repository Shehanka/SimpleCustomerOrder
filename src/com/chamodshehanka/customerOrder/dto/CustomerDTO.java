package com.chamodshehanka.customerOrder.dto;

import com.chamodshehanka.customerOrder.entity.Orders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class CustomerDTO {
    private int cid;
    private String name;
    private String contact;
    private List<OrderDTO> orderList=new ArrayList<>();

    public CustomerDTO() {
    }

    public CustomerDTO(int cid, String name, String contact) {
        this.cid = cid;
        this.name = name;
        this.contact = contact;
    }

    public CustomerDTO(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public CustomerDTO(int cid, String name, String contact, List<OrderDTO> orderList) {
        this.cid = cid;
        this.name = name;
        this.contact = contact;
        this.orderList = orderList;
    }

    public CustomerDTO(String name, String contact, List<OrderDTO> orderList) {
        this.name = name;
        this.contact = contact;
        this.orderList = orderList;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public List<OrderDTO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDTO> orderList) {
        this.orderList = orderList;
    }
}
