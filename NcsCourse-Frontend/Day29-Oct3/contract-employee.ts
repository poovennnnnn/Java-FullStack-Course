import Employee1 from "./Employee";

class contractEmployee extends Employee1 {
  private hourlyRate: number;

  constructor(id: number, name: string, hourlyRate: number) {
    super(id, name);
    this.hourlyRate = hourlyRate;
  }

  public showEmp(): void {
    super.showEmp();
    console.log("hourlyRate = " + this.hourlyRate);
  }
}

const obj: contractEmployee = new contractEmployee(101, "string", 900);
obj.showEmp();
