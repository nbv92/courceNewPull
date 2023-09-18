public class Employee {
    // Объявление переменных
    private String nameFull;
    private int sector;
    private int pay;
    private static int counter = 0;
    private int id;
    //геттеры
    public String getNameFull() {
        return this.nameFull;
    }

    public int getSector() {
        return this.sector;
    }

    public int getPay() {
        return this.pay;
    }

    public int getId() {
        return this.id;
    }
    //сеттеры
    public void setSector(int sector) {
        this.sector = sector;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
    //конструктор
    public Employee(String nameFull, int sector, int pay) {
        this.nameFull = nameFull;
        this.pay = pay;
        this.sector = sector;
        this.id = ++counter;
    }
    //метод
    public String toString() {
        return "Employee{nameFull = " + this.nameFull + "\n, department = " + this.sector + ", salary = " + this.pay + ", id = " + this.id + "}";
    }
}