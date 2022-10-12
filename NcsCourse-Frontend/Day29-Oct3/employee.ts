export default class Employee1 {
  //   private empId: number;
  //   private empName: string;

  constructor(public empId: number, public empName: string) {
    this.empId = empId;
    this.empName = empName;
  }

  public get empid() {
    return this.empId;
  }

  public set empid(empId: number) {
    this.empId = empId;
  }

  public getEmpId(): number {
    return this.empId;
  }

  public showEmp(): void {
    console.log(`Empid = ${this.empId} EmpName = ${this.empName}`);
  }
}

const e1: Employee1 = new Employee1(101, "scott");
e1.showEmp();
e1.empid = 1011;
console.log(e1.empid);
