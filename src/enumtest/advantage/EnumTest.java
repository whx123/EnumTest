package enumtest.advantage;

public class EnumTest {
    public static void main(String[] args) {

    }

    //魔数
    private boolean checkOrderFinish(int orderStatus) {
        if (3 == orderStatus) {
            //do something
            return true;
        }
        return false;
    }

    //静态变量
    private boolean checkOrderFinishForStatic(int orderStatus) {
        if (OrderStatus.FINISH == orderStatus) {
            //do something
            return true;
        }
        return false;
    }

    //枚举
    private boolean checkEnumOrderFinish(int orderStatus){
        //订单已完成
        if(OrderStatusEnum.FINISH.getIndex()==orderStatus){
            //do something
            return true;
        }
        return false;
    }


}
