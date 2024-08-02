package project3;

import java.math.BigDecimal;

public class Developer extends Employee {
    public Developer(String name, Long id, BigDecimal salary, String developerLanguage) {
        super(name, id, salary);
        this.developerLanguage = developerLanguage;
    }

    private String developerLanguage;


    public String getDeveloperLanguage() {
        return developerLanguage;
    }

    public void setDeveloperLanguage(String developerLanguage) {
        this.developerLanguage = developerLanguage;
    }

    @Override
    BigDecimal calculateSalary() {
        return BigDecimal.valueOf(5.5).multiply(super.getSalary());
    }
}
