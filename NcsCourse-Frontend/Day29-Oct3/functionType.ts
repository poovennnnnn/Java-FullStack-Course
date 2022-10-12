type GoodMorningFunction = (firstname: string, lastname: string) => void;

function GoodMorningFunction(firstName: string, lastname: string): void {
  console.log(`good morning ${firstName} ${lastname}`);
}

function tesfunction(fn: GoodMorningFunction) {
  fn("hello", "urman");
}

tesfunction(GoodMorningFunction);

type Circle = (name: string) => void;

function circle(name: string): void {
  console.log("hii" + name);
}

function testFunction(fn: Circle): void {
  fn("pooven");
}

tesfunction(circle);

let numArray: number[] = [12, 123, 123123, 123];
let num1Array: number[] = [12, 123, 123123, 123];
let strArray: string[] = ["sdfsdf", "Sdfsdf", "sdfdsffds"];
let str1Array: string[] = ["sdfsdf", "Sdfsdf", "sdfdsffds"];

function getData<Type extends { length: number }>(a: Type, b: Type): Type {
  if (a.length > b.length) {
    return a;
  } else {
    return b;
  }
}

console.log(getData(num1Array, numArray));
console.log(getData(str1Array, strArray));
