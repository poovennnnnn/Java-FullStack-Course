async function fetchData() {
  const response = await fetch("https://jsonplaceholder.typicode.com/todos/1");
  let data = await response.json();

  return data;
}
var title = "";
fetchData().then((x) => console.log(x.title));
console.log(data1);

console.log(document.domain);
