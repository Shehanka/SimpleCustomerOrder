package com.chamodshehanka.customerOrder.service.impl;

import com.chamodshehanka.customerOrder.dao.CustomerDAO;
import com.chamodshehanka.customerOrder.dao.impl.CustomerDAOImpl;
import com.chamodshehanka.customerOrder.entity.Customer;
import com.chamodshehanka.customerOrder.entity.Orders;
import com.chamodshehanka.customerOrder.service.CustomerService;
import com.chamodshehanka.customerOrder.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class CustomerServiceImpl implements CustomerService{
    SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    CustomerDAO customerDAO=new CustomerDAOImpl();

    @Override
    public boolean placeNewOrder(Customer customer, List<Orders> orderList) throws Exception {
        Session session=sessionFactory.openSession();
        Transaction transaction=null;

        try {
            transaction=session.beginTransaction();
            customerDAO.setSession(session);
            boolean isAdded = customerDAO.add(customer);

            if (isAdded){
                transaction.commit();
                return true;
            }else {
                transaction.rollback();
                return false;
            }
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }
    }
}
