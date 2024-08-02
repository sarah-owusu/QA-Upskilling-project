package project3;

import java.math.BigDecimal;

public class Manager extends Employee {

    private String office;
    public Manager(String name, Long id, BigDecimal salary, String office) {
        super(name, id, salary);
        this.office = office;
    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }


    @Override
    BigDecimal calculateSalary() {
        return BigDecimal.valueOf(10.5).multiply(super.getSalary());
    }
}
