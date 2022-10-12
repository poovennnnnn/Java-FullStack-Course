function GoodMorningFunction(firstName, lastname) {
    console.log("good morning ".concat(firstName, " ").concat(lastname));
}
function tesfunction(fn) {
    fn("hello", "urman");
}
tesfunction(GoodMorningFunction);
function circle(name) {
    console.log("hii" + name);
}
function testFunction(fn) {
    fn("pooven");
}
tesfunction(circle);
var numArray = [12, 123, 123123, 123];
var num1Array = [12, 123, 123123, 123];
var strArray = ["sdfsdf", "Sdfsdf", "sdfdsffds"];
var str1Array = ["sdfsdf", "Sdfsdf", "sdfdsffds"];
function getData(a, b) {
    if (a.length > b.length) {
        return a;
    }
    else {
        return b;
    }
}
console.log(getData(num1Array, numArray));
console.log(getData(str1Array, strArray));
