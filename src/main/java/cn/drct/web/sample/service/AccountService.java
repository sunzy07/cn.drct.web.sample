package cn.drct.web.sample.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.drct.web.sample.domain.Account;
import cn.drct.web.sample.domain.AccountRepository;
import cn.drct.web.service.AbsService;



@Service
@Transactional
public class AccountService extends AbsService<Account, Long, AccountRepository> {
	
	
}
