package MyThrow;

import MyException.MyException;

public class MyThrow {

    public void setMyScanner(String myScanner) throws MyException {
        if (myScanner.equals("XYZ")){
            throw new MyException("程序抛出异常：" + "  This is a XYZ");
        } else if (myScanner.equals("ABC")) {
            System.out.println("您的输入为" + myScanner + "  无异常");
        }
    }
}
