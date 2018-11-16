package me.jimmy.springmvc;

import me.jimmy.springmvc.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountService accounts;

    @GetMapping("/create")
    public Account create() {
        Account account = new Account();
        account.setEmail("jaeyeon93@naver.com");
        account.setPassword("12345");
        return accounts.save(account);
    }
}
