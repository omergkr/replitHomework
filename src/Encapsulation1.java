import java.util.Scanner;

public class Encapsulation1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String n1 = scan.nextLine();

        int i1 = scan.nextInt();

        //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

      student student1=new student();
      student1.setName(n1);
      student1.setAge(i1);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
    }
}


class student{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}