package com.chamodshehanka.customerOrder.dao;

import com.chamodshehanka.customerOrder.entity.SuperEntity;
import org.hibernate.Session;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public interface SuperDAO<T extends SuperEntity> {
    boolean add(T t)throws Exception;

    void setSession(Session session)throws Exception;

}
