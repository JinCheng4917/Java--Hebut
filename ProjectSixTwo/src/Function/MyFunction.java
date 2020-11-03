package Function;

import java.io.*;

public class MyFunction {

    /**
     * 程序开始前清空文档数据
     *
     * @param file 要判断的文件
     * @throws IOException
     */
    public void flushFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            if (file.length() > 0) {
                System.out.println("文件" + file.getName() + "内容不为空，正在清空");
                FileWriter fileWriter = new FileWriter(file);
                char[] a = new char[0];
                fileWriter.write(a);
                fileWriter.close();
                if (file.length() == 0) {
                    System.out.println(file.getName() + "成功清空");
                }
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("程序运行失败，失败原因：" + e);
        }

    }


    /**
     * 进行文件复制操作
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     */
    public void copyFile(File sourceFile, File targetFile) {
        try {
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); //因为每次是读取一行内容，所以显示一行后就得换行
                bufferedWriter.flush(); //刷新内容
            }
            fileWriter.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("文件复制过程发生错误");
        }

    }

    /**
     * 进行文件读取操作
     * @param file 要读取的文件
     */
    public void readFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            System.out.println(file.getName());
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("文件读取失败，失败原因： " + e);
        }
    }
}
