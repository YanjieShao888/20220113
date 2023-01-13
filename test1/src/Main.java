import com.sun.corba.se.impl.orb.ParserTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//行注释 commend + /
/*  块注释 commend + option + /  */
/**
 * 注释模板 ： /** + enter
 */
public class Main {
    public static void main(String[] args) {
//        对象
        /*Dog dog1 = new Dog("拉布拉多","阿拉",5,"yellow");
        dog1.setname("阿拉");
        dog1.setbreed("拉布拉多");
        dog1.setage(5);
        dog1.setcolor("yellow");
        dog1.eat("牛排");

        Cat cat1 = new Cat("银渐层","小银",7);
        cat1.eat("猫粮");
        System.out.println(cat1.name);
        static_test t1 = new static_test();
        static_test t2 = new static_test();
        System.out.println(t1.age);*/

        // 条件运算
        TiaoJianYunSuan tjys = new TiaoJianYunSuan();
        tjys.putresult1(5);

//        循环
        /*XunHuan xunhuan = new XunHuan();
        System.out.println("while循环");
        xunhuan.xh_while(5);
        System.out.println("do while循环");
        xunhuan.xh_dowhile(5);
        System.out.println("for循环");
        xunhuan.xh_for(6);
        System.out.println("加强for循环");
        int[] array1 = {5,4,3,2,1};
        xunhuan.xh_exfor(array1);
        System.out.println("break关键字");
        xunhuan.xh_break(array1);
        System.out.println("continue关键字");
        xunhuan.xh_continue(array1);*/

//        if else语句
        /*if(布尔表达式)
        {
            //如果布尔表达式为true将执行的语句
        }

        if(布尔表达式){
            //如果布尔表达式的值为true
        }else{
            //如果布尔表达式的值为false
        }

        if(布尔表达式 1){
            //如果布尔表达式 1的值为true执行代码
        }else if(布尔表达式 2){
            //如果布尔表达式 2的值为true执行代码
        }else {
            //如果以上布尔表达式都不为true执行代码
        }

        if else还可以嵌套使用
        */

//        switch case 语句
//        当有case匹配成功，但是该case中没有break时，后续所有case都会执行，直到结束或遇到break ！！！！！！！
        /*switch(expression){
            case value :
                //语句
                break; //可选
            case value :
                //语句
                break; //可选
            //你可以有任意数量的case语句
            default : //可选 没有case语句和值相等的情况下会执行default
                //语句
        }*/

//        String
//        s1,s3,s4指向的地址一致（公共池），s2新开辟一个地址（堆）
        /*String s1 = "s1";
        String s2 = new String("s2");
        String s3 = "s1";
        String s4 = s1;*/

//        String没有append等方法,只有StringBuffer,StringBuilder有append,reverse,delete,insert,replace

//        声明数组的方式
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("1");
        a1.add("2");
        a1.get(0);
        String[] s1 = {"1","2","2"};
        System.out.println(s1[0]);




    }
}