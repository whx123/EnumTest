package enumtest.equals;

public class EnumTest {
    public static void main(String[] args) {

        Shrubbery s1 = Shrubbery.CRAWLING;
        Shrubbery s2 = Shrubbery.GROUND;
        Shrubbery s3 = Shrubbery.CRAWLING;

        System.out.println("s1==s2,result: " + (s1 == s2));
        System.out.println("s1==s3,result: " + (s1 == s3));
        System.out.println("Shrubbery.CRAWLING.equals(s1)，result: "+Shrubbery.CRAWLING.equals(s1));
        System.out.println("Shrubbery.CRAWLING.equals(s2),result: "+Shrubbery.CRAWLING.equals(s2));

    }
}