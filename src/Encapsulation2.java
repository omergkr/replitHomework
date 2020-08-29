import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Encapsulation2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        Scanner scan1 = new Scanner(System.in);
        int salary = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String dop = scan2.nextLine();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

     Employees employees1=new Employees();

        employees1.setName(name);
        employees1.setSalary(salary);
        employees1.setDob(dop);

   if (Employees.ageCalculator(employees1.getDob())>18)
       System.out.println("Welcome to our company "+employees1.getName()+" your salary is "+employees1.getSalary());

 else if (Employees.ageCalculator(employees1.getDob())<18)

       System.out.println("come back when you are 18 years old.");
 else
       System.out.println(" we can have inter with you after that you can have a "+employees1.getSalary()+ " salary");



    }

}


class Employees{

    private String name;

    private int salary;

    private String dob ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    static int ageCalculator(String dob){
        LocalDate today=LocalDate.now();

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("MM/dd/yyyy");

        today.format(format1);
        LocalDate birthDay=LocalDate.parse(dob,format1);

        Period fark= Period.between(birthDay,today);

        return fark.getYears();

    }


}