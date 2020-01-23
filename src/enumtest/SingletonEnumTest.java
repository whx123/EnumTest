package enumtest;

public class SingletonEnumTest {
    enum SingletonEnum {
        INSTANCE,;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.setName("jay@huaxiao");
        System.out.println(SingletonEnum.INSTANCE.getName());
    }
}
