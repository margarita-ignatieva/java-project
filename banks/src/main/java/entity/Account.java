package entity;

import java.util.Objects;

public class Account {
    private Long accountid;
    private Long account;
    private Long userid;

    public Account() {
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return Objects.equals(accountid, account1.accountid) &&
                Objects.equals(account, account1.account) &&
                Objects.equals(userid, account1.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountid, account, userid);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", account=" + account +
                ", userid=" + userid +
                '}';
    }
}
