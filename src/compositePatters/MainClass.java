package compositePatters;

public class MainClass {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Lokesh Sharma", 100, "Pro Developer");
        Developer dev2 = new Developer("Vinay Sharma", 101, "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager("Kushagra Garg", 201, "SEO Manager");
        Manager man2 = new Manager("Vikram Sharma ", 202, "Kushagra's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showDetails();
    }
}
