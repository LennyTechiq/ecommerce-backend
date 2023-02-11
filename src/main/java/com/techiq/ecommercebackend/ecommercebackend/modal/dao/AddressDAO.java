package com.techiq.ecommercebackend.ecommercebackend.modal.dao;

import com.techiq.ecommercebackend.ecommercebackend.modal.Address;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AddressDAO extends ListCrudRepository<Address, Long> {

    List<Address> findByUser_Id(Long id);

}
