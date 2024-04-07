package com.example.loginbackend.service;

import com.example.loginbackend.entity.Account;
import com.example.loginbackend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
