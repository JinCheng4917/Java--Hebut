import java.io.*;

class SecretExample
{
    public static void main(String a[])
    {
        File fileOne = new File("hello.txt");
        File fileTwo = new File("hello.secret");
        char b[]=new char[100];
        try{
            FileReader in = new FileReader(fileOne); //创建指向 fileOne 的字符输入流
            FileWriter out = new FileWriter(fileTwo); //创建指向 fileTwo 的字符输出流
            int n = -1;
            while ( ( n=in.read(b)) != -1 )
            {
                for (int i=0; i<n;i++)
                { b[i]=(char)(b[i]^'a'); }
                out.write(b[n]);//out 将数组 b 的前 n 单元写到文件
            }
            out.close();//out 关闭
            in = new FileReader(fileTwo); //创建指向 fileTwo 的字符输入流
            System.out.println("加密后的文件内容：");
            n=in.read(b);
            while ( n != -1 )
            {
                String str=new String(b,0, n);
                System.out.println("dfjakfjd"+str);
                n=in.read(b);
            }
            in=new FileReader(fileTwo);
            System.out.println("解密后的文件内容：");
            while ( (n=in.read(b)) != -1 )
            {
                for (int i=0; i<n;i++)
                { b[i]=(char)(b[i]^'a'); }
                String str=new String(b,0,n);
                System.out.println(str);
            }
            in.close();// in 关闭
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}