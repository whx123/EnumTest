package enumtest.advantage;

public enum OrderStatusEnum {
    UNPAID(0, "未付款"), PAID(1, "已付款"), SEND(2, "已发货"), FINISH(3, "已完成"),;

    private int index;

    private String desc;

    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }

    OrderStatusEnum(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }
}
