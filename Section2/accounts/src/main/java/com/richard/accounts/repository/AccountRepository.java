package com.richard.accounts.repository;

import com.richard.accounts.entity.Accounts;
import com.richard.accounts.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long aLong);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
