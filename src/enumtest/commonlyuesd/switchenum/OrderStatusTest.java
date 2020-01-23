package enumtest.commonlyuesd.switchenum;

public class OrderStatusTest {
    public static void main(String[] args) {
        changeByOrderStatus(OrderStatusEnum.FINISH);
    }

    static void changeByOrderStatus(OrderStatusEnum orderStatusEnum) {
        switch (orderStatusEnum) {
            case UNPAID:
                System.out.println("老板，你下单了，赶紧付钱吧");
                break;
            case PAID:
                System.out.println("我已经付钱啦");
                break;
            case SENDED:
                System.out.println("已发货");
                break;
            case FINISH:
                System.out.println("订单完成啦");
                break;
        }
    }
}