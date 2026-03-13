package com.richard.accounts.service.impl;

import com.richard.accounts.dto.CustomerDto;
import com.richard.accounts.repository.AccountRepository;
import com.richard.accounts.repository.CustomerRepository;
import com.richard.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
