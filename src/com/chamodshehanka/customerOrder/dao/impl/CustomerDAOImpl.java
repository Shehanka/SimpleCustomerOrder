package com.chamodshehanka.customerOrder.dao.impl;

import com.chamodshehanka.customerOrder.dao.CustomerDAO;
import com.chamodshehanka.customerOrder.entity.Customer;
import org.hibernate.Session;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class CustomerDAOImpl implements CustomerDAO {

    private Session session;

    @Override
    public boolean add(Customer customer) throws Exception {
        return session.save(customer)!=null;
    }

    @Override
    public void setSession(Session session) throws Exception {
        this.session=session;
    }
}
