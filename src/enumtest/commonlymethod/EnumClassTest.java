package enumtest.commonlymethod;

public class EnumClassTest {
    public static void main(String[] args) {
        //values 返回enum实例的数组
        for (Shrubbery temp : Shrubbery.values()) {
            // name 返回实例enum声明的名字
            System.out.println(temp.name() + " ordinal is " + temp.ordinal() + " ,equal result is " +
                    Shrubbery.CRAWLING.equals(temp) + ",compare result is " + Shrubbery.CRAWLING.compareTo(temp));
        }
        //由名称获取枚举类中定义的常量值
        System.out.println(Shrubbery.valueOf("CRAWLING"));
    }
}
