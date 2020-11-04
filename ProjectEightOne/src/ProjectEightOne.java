import java.sql.*;
import java.util.Scanner;

public class ProjectEightOne {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
            String user = "root";
            Connection connection = DriverManager.getConnection(url, user,null);
            Statement statement = connection.createStatement();
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("驱动程序：" + databaseMetaData.getDriverName() + databaseMetaData.getDriverVersion());
            System.out.println("JDBC  URL: " + databaseMetaData.getURL());
            System.out.println("数据库：  " + databaseMetaData.getDatabaseProductName());
            System.out.println("版本： " + databaseMetaData.getDatabaseProductVersion());
            System.out.println("用户名： " + databaseMetaData.getUserName());
            breaks: while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入序号执行对应方法：1--新建、插入、修改、删除   2--查询   3--退出");
                switch (scanner.nextInt()){
                    case 1: {
                        System.out.println("请输入您的代码");
                        Scanner sqlScanner = new Scanner(System.in);
                        String sql = sqlScanner.nextLine();
                        int resultSet = statement.executeUpdate(sql);
                        System.out.println(resultSet);
                        break ;
                    }
                    case 2: {
                        System.out.println("请输入您的代码");
                        Scanner sqlScanner = new Scanner(System.in);
                        String sql = sqlScanner.nextLine();
                        ResultSet resultSet = statement.executeQuery(sql);
                        ResultSetMetaData  resultSetMetaData = resultSet.getMetaData();
                        int columnsNumber = resultSetMetaData.getColumnCount();
                        // 展开结果集数据库
                        while(resultSet.next()){
                            for (int i = 1; i <= columnsNumber; i++) {
                                if (i > 1) System.out.print(" ");
                                String columnValue = resultSet.getString(i);
                                System.out.print( resultSetMetaData.getColumnName(i) + " : " + columnValue + "  ");
                            }
                            System.out.println("");
                        }
                       resultSet.close();
                        break ;
                    }
                    case 3:
                        break breaks;
                }
            }
            connection.close();
            statement.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
