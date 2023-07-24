package Employee;

public class Fabrika {
    public static void main(String[] args) {

        Employee e1 = new Employee("İsmail Dağhan", 2000, 45, 1985);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();

        System.out.println(e1.toString());
    }
}
