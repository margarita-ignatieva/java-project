package dao;

import entity.Account;

import java.util.List;

public interface accountDAO {

    void add(Account account);

    List<Account> getAll();

    Account getByUserandAccountId(Long accountid, Long userid);

    void update(Account account);

    void remove(Account account);

}
