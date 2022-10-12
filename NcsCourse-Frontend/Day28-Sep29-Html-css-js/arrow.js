// const add = (i, j) => i + j;

// const fullName = (first, last) => {
//   console.log(first, last);
// };

// console.log(add(1, 2));
// fullName("mathi", "poovendhan");
// let arr2 = Array.of(1, 23, 434);
// // let number = arr2.splice(0, 5);
// let number1 = arr2.slice(0, 2);

// console.log(number1);
// let numberArr = [1, 2, 4, 5, 6, 5, 4];
// let stringArr = ["helo", "pooven", "hello"];
// console.log(numberArr.sort((x, y) => x - y));
// console.log(stringArr.sort((x, y) => x.localeCompare(y)));

// let number = numberArr.map((x) => x + 10);
// console.log(number);

// // numberArr.filter();

// console.log(numberArr.every((x) => x == 10));
// console.log(numberArr.some((x) => x == 15));

let list = [
  {
    empid: 101,
    empname: "scott",
    salary: 7000,
    fulltime: true,
  },
  {
    empid: 102,
    empname: "pooven",
    salary: 4000,
    fulltime: true,
  },
  {
    empid: 103,
    empname: "pooven",
    salary: 7000,
    fulltime: true,
  },
];

list
  .filter((x) => {
    return x.salary > 4000;
  })
  .forEach((x) => console.log(x.empname));
