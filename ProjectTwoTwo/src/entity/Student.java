package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    private String number;
    //学分
    private double credit;
    //绩点
    private double gradePoint;
    //入学时间
    private String entranceTime;
    //操作明细
    private ArrayList<String> action = new ArrayList<String>();

    //学生数组
    private ArrayList<Student> students = new ArrayList<Student>();

    private double studentBalance;

    private Account account;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public void setEntranceTime(String entranceTime) {
        this.entranceTime = entranceTime;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getNumber() {
        return number;
    }

    public double getCredit() {
        return credit;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public String getEntranceTime() {
        return entranceTime;
    }

    public Account getAccount() {
        return account;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setAccount() {
        if (this.getAccount() == null){
            Account account = new Account();
            account.setBalance(0.00);
            action.add("执行开户操作" + "成功");
            account.setAction(action);
            this.setAccount(account);
            System.out.print("用户执行开户操作成功，账户余额为：");
            System.out.println(account.getBalance());
        }else {
            action.add("执行开户操作失败，原因：该用户已拥有账户");
            account.setAction(action);
            this.setAccount(account);
            System.out.println("您已拥有账户，无法重复开户");
        }

    }

    public void deposit() {
        if (this.getAccount() == null) {
            System.out.println("该用户未执行开户操作，请进行开户操作后进行存款操作");
        } else {
            System.out.print("请输入存款的额度:");
            double depositScanner = new Scanner(System.in).nextDouble();
            studentBalance = this.getAccount().userDeposit(depositScanner);
            action.add("用户执行了存款操作，存款金额为" + depositScanner + " 成功");
            this.getAccount().setAction(action);
            System.out.println("存款成功，您的账户余额为：" + studentBalance);
        }
    }

    public void withdrawMoney() {
        if (this.getAccount() == null) {
            System.out.println("该用户未执行开户操作，请进行开户操作后进行取款操作");
        } else {
            System.out.println("用户当前的账户余额为：" + this.getAccount().getBalance());
            System.out.print("请输入取款的额度:");
            double withdrawMoneyScanner = new Scanner(System.in).nextDouble();
            if (withdrawMoneyScanner > this.getAccount().getBalance()) {
                System.out.println("用户的余额不足，请重新执行该操作");
                action.add("用户执行了取款操作，操作未成功，原因为：用户的余额不足，用户余额" + this.getAccount().getBalance() + "，取款额度：" + withdrawMoneyScanner);
                this.getAccount().setAction(action);
                this.withdrawMoney();
            } else {
                studentBalance = this.getAccount().userWithdrawMoney(withdrawMoneyScanner);
                action.add("用户执行了取款操作，取款金额为" + withdrawMoneyScanner + " 成功");
                System.out.println("取款成功，用户的账户余额为：" + studentBalance);
            }
        }
    }

    public void getAction() {
        if (this.getAccount() == null) {
            System.out.println("该用户未执行开户操作，请进行开户操作后进行查询明细操作");
        } else {
           this.getAccount().getAction().forEach( userAction -> {
               System.out.println(userAction);
           });
        }
    }

    public void AccountCancellation() {
        if (this.getAccount() == null) {
            System.out.println("该用户未执行开户操作，请先进行开户操作");
        } else {
            this.action = new ArrayList<String>();
            this.getAccount().setAction(action);
            this.setAccount(null);
            System.out.println("销户成功");
        }
    }

    public void SystemStudent(int i){
        System.out.print(i);
        System.out.print(" ");
        System.out.print(students.get(i).getName());
        System.out.print(" ");
        System.out.print(students.get(i).getNumber());
        System.out.print(" ");
        System.out.print(students.get(i).getGradePoint());
        System.out.print(" ");
        System.out.print(students.get(i).getCredit());
        System.out.print(" ");
        System.out.print(students.get(i).getEntranceTime());
        System.out.print(" ");
        System.out.println(students.get(i).getId());
    }

    public void setStudents(Student student) {
       students.add(student);
    }
}
