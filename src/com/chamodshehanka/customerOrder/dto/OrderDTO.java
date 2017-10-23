package com.chamodshehanka.customerOrder.dto;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/

public class OrderDTO {
    private int oid;
    private String oDate;
    private String priority;

    public OrderDTO() {
    }

    public OrderDTO(int oid, String oDate, String priority) {
        this.oid = oid;
        this.oDate = oDate;
        this.priority = priority;
    }

    public OrderDTO(String oDate, String priority) {
        this.oDate = oDate;
        this.priority = priority;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
