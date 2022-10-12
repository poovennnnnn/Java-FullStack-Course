"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee1 = /** @class */ (function () {
    function Employee1(empId, empNmae) {
        this.empId = empId;
        this.empName = empNmae;
    }
    Object.defineProperty(Employee1.prototype, "empid", {
        get: function () {
            return this.empId;
        },
        set: function (empId) {
            this.empId = empId;
        },
        enumerable: false,
        configurable: true
    });
    Employee1.prototype.getEmpId = function () {
        return this.empId;
    };
    Employee1.prototype.showEmp = function () {
        console.log("Empid = ".concat(this.empId, " EmpName = ").concat(this.empName));
    };
    return Employee1;
}());
exports.default = Employee1;
var e1 = new Employee1(101, "scott");
e1.showEmp();
e1.empid = 1011;
console.log(e1.empid);
