package entity;

import java.util.ArrayList;

public class Account {
    //余额
    private double balance;
    //额度
    private double value;
    //操作明细
    private ArrayList<String> action;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setAction(ArrayList<String> action) {
        this.action = action;
    }

    public double getBalance() {
        return balance;
    }

    public double getValue() {
        return value;
    }

    public ArrayList<String> getAction() {
        return action;
    }

    /**
     * 用户存款
     * @param value 存款金额
     * @return
     */
    public double userDeposit(double value) {
        this.balance = this.balance + value;
        return this.balance;
    }

    /**
     * 用户取款
     * @param value 取款金额
     * @return
     */
    public double userWithdrawMoney(double value) {
        this.balance = this.balance - value;
        return this.balance;
    }

}
