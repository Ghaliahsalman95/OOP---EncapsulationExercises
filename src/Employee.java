public class Employee {
    private String id="";
    private String name="";
    private double salary=0;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public double getAnnualSalary() {
        return getSalary() / 12;
        //AnnualSalary=hourlySalary*hourPerWeek*NumberOfWeekPerYear
        //hourlySalary=Salary/30days/10Hour in one day;
        //HourSalaryPerWeek=Salary/4weeks
//        int hourlySalary=(getSalary()/30)/10;
//        int hourSalaryPerWeek=getSalary()/4;
//
    }
        public double raisedSalary(double percent){

        percent/=100;
        percent*=getSalary();
        percent+=getSalary();
            this.setSalary(percent);
//        double op1=percent/100;
//        double opration=(double) (op1*this.getSalary());
//        opration+=(double) getSalary();
//        double netSalary=(int)opration;
//        this.setSalary(netSalary);
            //this.setSalary(getSalary()+(getSalary()/percent)*100);
       // int test=this.getSalary();
      // return (this.getSalary()+((this.getSalary()/percent))/100);
return this.getSalary();
    }

    @Override
    public String toString() {
        return "Employee[" +
                "ID= " + id + '\t' +
                "Name= " + name + '\t' +
                "Salary= " + salary +
                ']';
    }
}
