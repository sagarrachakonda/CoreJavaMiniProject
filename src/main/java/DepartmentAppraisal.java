import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DepartmentAppraisal {
    private static final Map<String, Double> APPRAISAL_FACTORS = new HashMap<>();

    static {
        APPRAISAL_FACTORS.put("Developer", 0.15);
        APPRAISAL_FACTORS.put("Manager", 0.12);
        APPRAISAL_FACTORS.put("Sales", 0.10);
        APPRAISAL_FACTORS.put("Operations", 0.08);
    }

    public static double getAppraisalFactor(String department) {
        return APPRAISAL_FACTORS.getOrDefault(department, 0.0);
    }
}

class SalaryCalculator {
    public static void calculateIncrementedSalary(Employee employee) {
        double appraisalFactor = DepartmentAppraisal.getAppraisalFactor(employee.getDepartment());
        double incrementedSalary = employee.getSalary() + (employee.getSalary() * appraisalFactor);
        employee.setSalary(incrementedSalary);
    }
}

