// function add(...x) {
//   let k = 0;
//   x.forEach((y) => (k += y));
//   return k;
// }
// console.log(add(3, 23, 2323, 23, 23));

// let emp1 = {
//   empid: 101,
//   empname: "Scott",
// };

// let project1 = {
//   projId: 201,
//   projname: "Insurance",
// };

// let empAndProject1 = { emp1, project1 };

// let empAndProject2 = { ...emp1, ...project1 };

// console.log(empAndProject1);
// console.log(empAndProject2);

// let arr = [1, 23, 33, 23, 2];
// let [data1, data2] = arr;
// console.log(data1, data2);

// const { projname, projId } = project1;

// console.log(projId, projname);

let emp1 = {
  empid: 101,
  empname: "Scott",
  project: {
    projid: 201,
    projname: "insurance",
  },
};

let {
  empid,
  empname,
  project: { projid, projname },
} = emp1;

for (let x in emp1) {
  console.log(emp1[x]);
}
