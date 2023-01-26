public class Main {
    public static void main(String[] args)
    {
        Person Paul = new Person("Paul","Connolly","123456","Mr.", 2002);
        System.out.println(Paul);
        System.out.println(Paul.getFullName());
        System.out.println(Paul.getFormalName());
        System.out.println(Paul.getAge());
        System.out.println(Paul.getAge(2008));
        }
}