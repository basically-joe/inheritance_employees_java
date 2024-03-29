package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NI, int salary, String deptName, Double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return this.getSalary()/50;
    }
}
