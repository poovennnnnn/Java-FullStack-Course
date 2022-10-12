type age = string | number;

let empAge: age = 10;
let empAge1: age = "10";

console.log(empAge, empAge1);

type department = "sales" | "account" | "production";

let department: department = "account";

console.log(department);

function getFullName(obj: string | string[]): string | number {
  if (typeof obj === "string") {
    return obj.toUpperCase();
  } else if (Array.isArray(obj)) {
    obj.forEach((item) => console.log(item.toUpperCase()));
  }

  return 10;
}

console.log(getFullName(["sdfdsffs", "sdfdsf", "sdfdsf"]));
