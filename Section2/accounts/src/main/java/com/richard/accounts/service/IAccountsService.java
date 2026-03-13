package com.richard.accounts.service;

import com.richard.accounts.dto.CustomerDto;

/**
 *
 * @param customerDto - CustomerDto Object
 */
public interface IAccountsService {
    void createAccount(CustomerDto customerDto);
}
