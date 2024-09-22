import java.util.Random;
import java.lang.System;
public class Dish implements Order{//父类调用Order接口
    private String name;
    private double price;
    public Dish(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void profile(){
        System.out.println("菜品介绍");
    }

    @Override
    public void cook() {
        System.out.println("制作方法");
    }




    @Override
    public boolean check(){
        Random check=new Random();
        return check.nextBoolean();
    }//生成随机数
}

   class Dish_0 extends Dish{
    public Dish_0(){
        super("番茄炒蛋",10);
    }
       @Override
    public void profile(){
        System.out.println("番茄炒蛋是普通的大众菜肴，很好吃");
    }
       @Override
       public void cook() {
           System.out.println("番茄炒蛋的做法");
       }
   }
class Dish_1 extends Dish{
    public Dish_1(){
        super("鱼香肉丝",13.5);
    }
    @Override
    public void profile(){
        System.out.println("鱼香肉丝也是普通的大众菜肴，也很好吃");
    }
    @Override
    public void cook() {
        System.out.println("鱼香肉丝的制作方法");
    }
}
class Dish_2 extends Dish{
    public Dish_2(){
        super("馒头",1.5);
    }
    @Override
    public void profile(){
        System.out.println("馒头是普通的大众菜肴，但不好吃");
    }
    @Override
    public void cook() {
        System.out.println("馒头的制作方法");
    }

}