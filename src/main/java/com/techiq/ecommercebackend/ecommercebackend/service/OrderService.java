package com.techiq.ecommercebackend.ecommercebackend.service;

import com.techiq.ecommercebackend.ecommercebackend.modal.LocalUser;
import com.techiq.ecommercebackend.ecommercebackend.modal.MyOrder;
import com.techiq.ecommercebackend.ecommercebackend.modal.dao.MyOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private MyOrderDAO myOrderDAO;

    public OrderService(MyOrderDAO myOrderDAO) {
        this.myOrderDAO = myOrderDAO;
    }

    public List<MyOrder> getOrders(LocalUser user) {
        return myOrderDAO.findByUser(user);
    }
}
