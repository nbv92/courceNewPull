public class Main {

    public static void main(String[] args) {
//Заполнение массива
        Employee[] employees = new Employee[10];

        employees [0] = new Employee("Тихомирова Олеся Артёмовна",1,50010);
        employees [1] = new Employee("Касаткина Мария Елисеевна",2,50020);
        employees [2] = new Employee("Лаптева Мария Михайловна",1,50010);
        employees [3] = new Employee("Волков Иван Платонович",1,50010);
        employees [4] = new Employee("Морозов Даниил Матвеевич",1,50100);
        employees [5] = new Employee("Осипова Варвара Никитична",2,50020);
        employees [6] = new Employee("Степанова Оливия Ярославовна",2,50200);
        employees [7] = new Employee("Кожевникова Анна Тимуровна",4,50040);
        employees [8] = new Employee("Фомина Татьяна Андреевна",1,51000);
        employees [9] = new Employee("Тимофеев Даниил Тимофеевич",3,50030);
//метод выводящий все данные
        printEmployees(employees);
//Суммма затра, вывод
        int salaruSum = sumPay(employees);
        System.out.println("Сумма выплат сотрудникам " + salaruSum);
//Минимальная зарплата
        minPay(employees);
//максимальная зарплата
        maxPay(employees);
//средняя зарплата вывод
        int madPay = middlePay(employees);
        System.out.println("Средняя сумма выплат " + salaruSum);
 //вывод ФИО
        listEmployees(employees);

    }
    //Метод вывода всей информации
    private static void printEmployees (Employee[] employees) {

        System.out.println("List employees: ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
//Метод общих затрат
    private static int sumPay(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum+=employee.getPay();
        }
        return sum;
    }
//Минимальная зарплата
    private static Employee minPay (Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPay() < employees[index].getPay()) {
                index = i;
            }
        }
        return employees[index];
    }
//Максимальная зарплата
    private static Employee maxPay (Employee[] employees) {
        int index = 0;
        for (int i = 0; i > employees.length; i++) {
            if (employees[i].getPay() > employees[index].getPay()) {
                index = i;
            }
        }
        return employees[index];
    }
//Метод средняя зарплата
    private static int middlePay (Employee[] employees) {
        int midPay = sumPay(employees)/10;
        return midPay;
    }
//метод Вывод ФИО
    private static void listEmployees (Employee[] employees) {

        System.out.println("Employees: ");

        for (Employee employee : employees) {
            System.out.println(employee.getNameFull());
        }
    }

}