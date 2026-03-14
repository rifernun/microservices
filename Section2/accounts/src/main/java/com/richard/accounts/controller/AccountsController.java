package com.richard.accounts.controller;

import com.richard.accounts.constants.AccountsConstants;
import com.richard.accounts.dto.CustomerDto;
import com.richard.accounts.dto.ResponseDto;
import com.richard.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.richard.accounts.dto.CustomerDto;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE}) //manter esse padrao
@AllArgsConstructor //gera um construtor com todos os argumentos, ou seja, com todas as dependencias da classe, ou seja, o IAccountsService
public class AccountsController {

    private IAccountsService iAccountsService;

    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber) {
         CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);
         return ResponseEntity
                 .status(HttpStatus.OK)
                 .body(customerDto);

    }
}
