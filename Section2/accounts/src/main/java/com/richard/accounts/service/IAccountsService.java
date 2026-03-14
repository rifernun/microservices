package com.richard.accounts.service;

import com.richard.accounts.dto.CustomerDto;


public interface IAccountsService {
    void createAccount(CustomerDto customerDto);
}
