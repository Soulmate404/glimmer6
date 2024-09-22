import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.System;
public class Main{
    public static void main(String[] args) {
        Order a= new Dish_0();
        Order b=new Dish_1();
        Order c=new Dish_2();
        List<Order> list=new ArrayList<>();//创建列表
        Collections.addAll(list,a,b,c);
        system system=new system();//捏一个system对象，便于下面调用实例方法
        //创建三个顾客进行实验
        WechatCustom wechatCustom1=new WechatCustom("成都",true,12);
        TableCustom tableCustom=new TableCustom(5);
        WechatCustom wechatCustom2=new WechatCustom("电子科技大学",false,13);
        system.manageOrder(list,wechatCustom1);
        system.manageOrder(list,tableCustom);
        system.manageOrder(list,wechatCustom2);
    }
    //那个随机数函数概率有点神奇，要试好几次才能遇着一次可以制作的，
    //还有一个神秘bug，当三次都制作失败时有时会只打印两次无法制作，没发现问题在哪
}