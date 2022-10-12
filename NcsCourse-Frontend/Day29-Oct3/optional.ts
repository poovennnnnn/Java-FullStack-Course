function add(x: number, y: number, z?: number): number {
  return x + y + (z || 0);
}

console.log(add(12, 2332, 2344));
console.log(add(12, 2332));

function printName(first: string, last?: string): string {
  return `Hi ${first} ${last || "bro"}`;
}

console.log(printName("pooven", "mathi"));
console.log(printName("pooven"));

function printNameDefault(first: string, last: string = "bro"): string {
  return `Hi ${first} ${last}`;
}

console.log(printNameDefault("pooven"));

//Rest Parameter

function restParam(x: number, y: number, ...z: number[]): number {
  let sum = x + y;
  z.forEach((x) => (sum += x));

  return sum;
}

console.log(restParam(1, 2, 34, 34));
console.log(
  restParam(1, 2, 34, 34, 234, 1234, 2345, 23423, 42422423, 2, 4234, 24, 2)
);

let x: any = 20;
console.log((x as string).length);
let str: string = x as string;

let str1: any = "10";

let num: number = str1 as number;
