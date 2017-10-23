package com.chamodshehanka.customerOrder.controller.impl;

import com.chamodshehanka.customerOrder.controller.CashierController;
import com.chamodshehanka.customerOrder.dto.CustomerDTO;
import com.chamodshehanka.customerOrder.dto.OrderDTO;
import com.chamodshehanka.customerOrder.entity.Customer;
import com.chamodshehanka.customerOrder.entity.Orders;
import com.chamodshehanka.customerOrder.service.CustomerService;
import com.chamodshehanka.customerOrder.service.impl.CustomerServiceImpl;

import java.util.List;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class CashierControllerImpl implements CashierController{
    CustomerService customerService=new CustomerServiceImpl();

    @Override
    public boolean placeNewOrder(CustomerDTO customerDTO) throws Exception {
        Customer customer=new Customer(
                customerDTO.getName(),
                customerDTO.getContact(),
                null
        );

        List<Orders> orderList=customer.getOrderList();

        return customerService.placeNewOrder(customer,orderList);
    }
}
