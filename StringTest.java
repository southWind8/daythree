package Day03;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**
 * @ClassName StringTest
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/22
 **/

public class StringTest {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("请给字符串A赋值:");
        String  a =s1.nextLine();
        Scanner s2 =new Scanner(System.in) ;
        System.out.println("请给字符串B赋值:");
        String b=s2.nextLine();
        System.out.println("字符串a的内容为:"+a);
        System.out.println("字符串b的内容为:"+b);
        //将两个字符串比较是否相同
        System.out.println("两个字符串内容是否相同？"+a.equals(b));
        //比较两个字符串是否是同一个对象
        System.out.println(a==b);
        //比较两个字符串是否相同
        System.out.println(a.equals(b));
        //比较两个字符串(忽略大小写)
        System.out.println(a.equalsIgnoreCase(b));
        //将两个字符串相加合成一个新的字符串
        String c=a+b;
        System.out.println("字符串a与b合并后的内容为:"+c);
        Scanner s3=new Scanner(System.in);
        String d=s3.nextLine();
        //查找某一个子字符串是否包含在此字符串之中，包含输出true，否则输出flase
        boolean con=c.contains(d);
        System.out.println("子字符串是否被包含在此字符串中:"+con);
        //调用count，输出包含次数
        System.out.println("包含次数为:"+repetitions(c,d));
        Scanner s4 =new Scanner (System.in);
        System.out.println("请选择是否替换字符串：确定（1）/拒绝（2）");
        int e=s4.nextInt();
        switch(e){
            case 1:
                Scanner s5=new Scanner(System.in);
                System.out.println("请输入想要替换的原字符：");
                String f =s5.nextLine();
                Scanner s6=new Scanner (System.in);
                System.out.println("请输入想要替换的原字符:");
                String g =s6.nextLine();
                String z=c.replace(f,g);
                System.out.println("替换前："+c);
                System.out.println("替换后:"+z);
                break;
                //查询类型2，不替换
            case 2:
                System.out.println("最终字符串内容为:\n"+c);
                break;
            default:
                System.out.println("该字符串有误");
                break;
        }
    }
    public static int repetitions(String c,String d){
        //创建一个repetitions统计出现次数
        //创建一个计数器，统计次数
        int count=0;
        //创建计数器，设置开始的地址
        int fromIndex=0;
        //循环到没有输出-1就停止循环
        while ((fromIndex=c.indexOf(d,fromIndex))!=-1){
            fromIndex=fromIndex+d.length();
            count++;
        }
        return count;
    }
}
