package com.chamodshehanka.customerOrder.dao.impl;

import com.chamodshehanka.customerOrder.dao.OrderDAO;
import com.chamodshehanka.customerOrder.entity.Orders;
import org.hibernate.Session;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class OrderDAOImpl implements OrderDAO{
    private Session session;

    @Override
    public boolean add(Orders orders) throws Exception {
        return session.save(orders) !=null;
    }

    @Override
    public void setSession(Session session) throws Exception {

    }
}
