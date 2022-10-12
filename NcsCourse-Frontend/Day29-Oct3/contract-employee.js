"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Employee_1 = require("./Employee");
var contractEmployee = /** @class */ (function (_super) {
    __extends(contractEmployee, _super);
    function contractEmployee(id, name, hourlyRate) {
        var _this = _super.call(this, id, name) || this;
        _this.hourlyRate = hourlyRate;
        return _this;
    }
    contractEmployee.prototype.showEmp = function () {
        _super.prototype.showEmp.call(this);
        console.log("hourlyRate = " + this.hourlyRate);
    };
    return contractEmployee;
}(Employee_1["default"]));
var obj = new contractEmployee(101, "string", 900);
obj.showEmp();
