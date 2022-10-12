function add(x, y, z) {
    return x + y + (z || 0);
}
console.log(add(12, 2332, 2344));
console.log(add(12, 2332));
function printName(first, last) {
    return "Hi ".concat(first, " ").concat(last || "bro");
}
console.log(printName("pooven", "mathi"));
console.log(printName("pooven"));
function printNameDefault(first, last) {
    if (last === void 0) { last = "bro"; }
    return "Hi ".concat(first, " ").concat(last);
}
console.log(printNameDefault("pooven"));
//Rest Parameter
function restParam(x, y) {
    var z = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        z[_i - 2] = arguments[_i];
    }
    var sum = x + y;
    z.forEach(function (x) { return (sum += x); });
    return sum;
}
console.log(restParam(1, 2, 34, 34));
console.log(restParam(1, 2, 34, 34, 234, 1234, 2345, 23423, 42422423, 2, 4234, 24, 2));
