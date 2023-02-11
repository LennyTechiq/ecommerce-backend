package com.techiq.ecommercebackend.ecommercebackend.modal.dao;

import com.techiq.ecommercebackend.ecommercebackend.modal.LocalUser;
import com.techiq.ecommercebackend.ecommercebackend.modal.MyOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MyOrderDAO extends ListCrudRepository<MyOrder, Long> {

    List<MyOrder> findByUser(LocalUser user);
}
