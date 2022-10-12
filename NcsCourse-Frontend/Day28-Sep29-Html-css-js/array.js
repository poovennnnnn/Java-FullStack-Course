let arr = [1, 2, 3, 4];
let arr1 = (1, 23, 4);
let arr2 = Array.of(1, 23, 434);

let empDetails = [101, "Scott", "manager", true, 8000];

let employee = {
  name: "pooven",
  id: 101,
  hello: function (x) {
    console.log("hello world " + x);
  },
};

employee.hello("pooven");

function add(x, ...y) {
  y.forEach((element, index, array) => {
    x += element;
    console.log(index);
    console.log(array);
  });
  console.log("result is =" + x);
}

add(1, 23, 234, 45, 45, 34);

arr2.push(23, 234, 34);
arr2.pop();
console.log(arr2);
