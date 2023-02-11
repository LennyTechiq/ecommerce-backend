package com.techiq.ecommercebackend.ecommercebackend.modal.dao;

import com.techiq.ecommercebackend.ecommercebackend.modal.LocalUser;
import com.techiq.ecommercebackend.ecommercebackend.modal.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
    void deleteByUser(LocalUser user);
}
