public class XunHuan {

    // while循环
    //先判断后执行
    public void xh_while(int value_a){
        int a = value_a;
        while (a < 10){
            a++;
            System.out.println(a);
        }
        System.out.println("the final value of a is : " + a);
    }

    //do while循环
    //先执行后判断
    public void xh_dowhile(int value_b){
        int b = value_b;
        do{
            b++;
            System.out.println(b);
        }while(b<10);
        System.out.println("the final value of b is : " + b);
    }

    //for循环
    public void xh_for(int value_c){
        int c = value_c;
        for (int i = 0; i < c;i+=1){
            System.out.println(i);
        }
    }

    //加强for循环
    public void xh_exfor(int[] args){
        int[] a1 = args;
        int n = 0;
        for(int i : a1){
            System.out.println(n + ":" + i);
            n++;
        }
    }

    //break关键字  结束当前最里层循环 并非跳出循环
    public void xh_break(int[] args){
        int[] a1 = args;
        int n = 0;
        for(int i : a1){
            if (n == 2){
                break;
            }
            System.out.println(n + ":" + i);
            n++;
        }
    }

    //continue关键字 跳出此轮循环进入到下一循环
    public void xh_continue(int[] args){
        int[] a1 = args;
        for(int i : a1){
            if (i == 2){
                continue;
            }
            System.out.println("i : " + i);
        }
    }


}
