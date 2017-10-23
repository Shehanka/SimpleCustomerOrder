package com.chamodshehanka.customerOrder.service;

import com.chamodshehanka.customerOrder.entity.Customer;
import com.chamodshehanka.customerOrder.entity.Orders;

import java.util.List;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public interface CustomerService {
    public boolean placeNewOrder(Customer customer, List<Orders> orderList)throws Exception;
}
