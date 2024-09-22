import java.util.List;
import java.lang.System;
public class system {
    private static int count=0;//用来记录订单编号
    private  static boolean checkResult=true;//用于在检查菜品是否可以制作后返回结果
    public  <T>void manageOrder(List<Order>dishes,T custom){//两个形参，一个列表一个泛型
        for (Order dish:dishes){//遍历列表dishes
            if(dish.check()){
                System.out.println("原料不足无法制作");
                checkResult=false;
                break;
            }
        }
        if(checkResult){//能够制作菜品后执行的操作
            count++;
            System.out.println("订单编号："+count);
            for (Order a:dishes){//打印制作方法
                a.cook();
            }


        if( custom instanceof TableCustom) {//如果是table
            TableCustom tableCustom=(TableCustom)custom;//1、把方法中的泛型转变为Tablecustom并生成对应的对象
            System.out.println("送餐到餐桌："+tableCustom.getTableID());
        }
        else if (custom instanceof WechatCustom) {//如果是wechat
           if(((WechatCustom) custom).isTakeout()){
               WechatCustom wechatCustom=(WechatCustom) custom;//同理1、
               System.out.println("外卖地址为"+wechatCustom.getAddress());
           }
           else{
               WechatCustom wechatCustom=(WechatCustom) custom;//同1.
               System.out.println("送餐到餐桌："+wechatCustom.getTableID());
           }
        }
        }
    }
}
