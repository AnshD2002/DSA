class employee{
    int basic; int DA; int HRA; int CA; int MA; int SA;
    int PT; int TDS; int EPF;
    int G_Salary; int Net_Salary; int Total_Deduction;
    String name; int id; String department;
    void enterdetails(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void Details(){
        System.out.print("Employee name : "+name+"\n");
        System.out.print("Employee ID : "+id+"\n");
        System.out.print("Employee Dept. : "+department+"\n");
    }

    void entersalary(int basic,int DA,int HRA,int CA,int MA, int SA){
        this.basic = basic;
        this.DA = DA;
        this.HRA = HRA;
        this.CA = CA;
        this.MA = MA;
        this.SA = SA;
    }

    void grosssalary(){
        G_Salary =(basic+DA+HRA+CA+MA+SA);
        System.out.print("Gross Salary : "+G_Salary+"\n");
    }

    void enterdeduction(int PT, int TDS, int EPF){
        this.PT = PT;
        this.TDS = TDS;
        this.EPF = EPF;
    }
    void deduction(){
        Total_Deduction = (PT+TDS+EPF);
        System.out.print("Total Deduction : "+Total_Deduction+"\n");
    }
    void netsalary(int G_Salary,int Total_Deduction){
        Net_Salary = (G_Salary - Total_Deduction);
        System.out.print("Net Salary : "+Net_Salary+"\n");
    }

}

class Main{
    public static void main(String[] args) {

        employee obj = new employee();

        obj.enterdetails("Ansh Dabral",101, "SDE");
        obj.Details();
        obj.entersalary(40000,4000,20000,1600,4500,28000);
        obj.grosssalary();
        obj.enterdeduction(200,10000,4800);
        obj.deduction();
        obj.netsalary(obj.G_Salary,obj.Total_Deduction);
    }
}
