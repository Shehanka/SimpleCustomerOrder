package com.chamodshehanka.customerOrder.entity;

import javax.persistence.*;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/

@Entity
public class Orders extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;
    private String oDate;
    private String prioroty;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Orders() {
    }

    public Orders(int oid, String oDate, String prioroty, Customer customer) {
        this.oid=oid;
        this.oDate = oDate;
        this.prioroty = prioroty;
        this.customer = customer;
    }

    public Orders(String oDate, String prioroty, Customer customer) {
        this.oDate = oDate;
        this.prioroty = prioroty;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", oDate='" + oDate + '\'' +
                ", prioroty='" + prioroty + '\'' +
                ", customer=" + customer +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public String getPrioroty() {
        return prioroty;
    }

    public void setPrioroty(String prioroty) {
        this.prioroty = prioroty;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
