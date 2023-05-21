package compositePatters;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    private List<Employee> list = new ArrayList<>();

    @Override
    public void showDetails() {
        for (Employee employee : list) {
            employee.showDetails();
        }
    }

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }

}
