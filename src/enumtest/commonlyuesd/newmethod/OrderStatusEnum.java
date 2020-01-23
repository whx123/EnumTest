package enumtest.commonlyuesd.newmethod;

public enum OrderStatusEnum {
    UNPAID(0, "未付款"), PAID(1, "已付款"), SENDED(2, "已发货"), FINISH(3, "已完成"),;

    //成员变量
    private int index;
    private String desc;

    //get方法
    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }

    //构造器方法
    OrderStatusEnum(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    //普通方法
    public static OrderStatusEnum of(int index){
        for (OrderStatusEnum temp : values()) {
            if (temp.getIndex() == index) {
                return temp;
            }
        }
        return null;
    }
}
