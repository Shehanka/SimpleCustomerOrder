package com.chamodshehanka.customerOrder.controller;

import com.chamodshehanka.customerOrder.dto.CustomerDTO;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public interface CashierController {

    public boolean placeNewOrder(CustomerDTO customerDTO)throws Exception;
}
