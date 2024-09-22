public class WechatCustom {

    public String address;//顾客地址
    public boolean takeout;//true代表该顾客是外卖，false代表该顾客是堂食
    public int tableID;
    WechatCustom(String address,boolean takeout,int tableID){
        this.address=address;
        this.takeout=takeout;
        this.tableID=tableID;
    }
    public String getAddress(){
        return address;
    }
    public boolean isTakeout(){
        return takeout;
    }
    public  int getTableID(){
        return tableID;
    }

}
