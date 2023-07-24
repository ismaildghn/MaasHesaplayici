package Employee;
public class Employee {

    String name;
    double salary;
    int workHours;
    int hireyear;

    Employee(String name, double salary, int workHours, int hireyear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireyear = hireyear;
    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }else {
            return this.salary * 0.03;
        }
    }
    int bonus(){
         if (this.workHours < 40){
             return 0;
         }else {
             int extraHours = this.workHours - 40;
             return extraHours * 30;
         }
    }
    double raiseSalary(){
        if (2021 - this.hireyear < 10){
            return this.salary * 0.05;
        }
        if (2021 - this.hireyear > 9 && 2021 - this.hireyear < 20){
            return this.salary * 0.1;
        }
        if (2021 - this.hireyear > 19){
            return this.salary * 0.15;
        }
        return this.salary;
    }
    public String toString(){
        return "\n Adı : " + this.name +"\n Maaşı : " + this.salary + "\n Çalışma Saati : " + this.workHours +
                "\n Başlangıç Yılı : " + this.hireyear + "\n Vergi : " + this.tax() + "\n Bonus : " + this.bonus() +
                "\n Maaş Artışı : " + this.raiseSalary() + "\n Vergi ve Bonuslar ile Birlikte Maaş : " + (this.salary - this.tax() + this.bonus()) +
                "\n Toplam Maaş : " + (this.salary + this.raiseSalary());
    }

}
