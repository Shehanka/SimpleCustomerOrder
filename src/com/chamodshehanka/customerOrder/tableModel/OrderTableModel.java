package com.chamodshehanka.customerOrder.tableModel;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class OrderTableModel {
    private SimpleStringProperty oDate=new SimpleStringProperty("");
    private SimpleStringProperty priority = new SimpleStringProperty("");

    public OrderTableModel() {
    }

    public OrderTableModel(String oDate, String priority) {
        this.oDate.set(oDate);
        this.priority.set(priority);
    }

    public String getoDate() {
        return oDate.get();
    }

    public SimpleStringProperty oDateProperty() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate.set(oDate);
    }

    public String getPriority() {
        return priority.get();
    }

    public SimpleStringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }
}
