package com.richard.accounts.repository;

import com.richard.accounts.entity.Accounts;
import com.richard.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
}
