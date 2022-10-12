var empAge = 10;
var empAge1 = "10";
console.log(empAge, empAge1);
var department = "account";
console.log(department);
function getFullName(obj) {
    if (typeof obj === "string") {
        return obj.toUpperCase();
    }
    else if (Array.isArray(obj)) {
        obj.forEach(function (item) { return console.log(item.toUpperCase()); });
    }
    return 10;
}
console.log(getFullName(["sdfdsffs", "sdfdsf", "sdfdsf"]));
