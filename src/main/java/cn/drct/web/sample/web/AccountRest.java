package cn.drct.web.sample.web;

import io.swagger.annotations.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.drct.web.rest.AbsRest;
import cn.drct.web.sample.domain.Account;
import cn.drct.web.sample.domain.AccountRepository;
import cn.drct.web.sample.service.AccountService;




@Controller
@RequestMapping(value = "/api/account")
public class AccountRest extends AbsRest<Account, Long,AccountRepository,AccountService> {

}
