let products = [
  { prodId: 101, prodname: "airpods", price: 4000 },
  { prodId: 102, prodname: "airpods", price: 4000 },
  { prodId: 103, prodname: "airpods", price: 4000 },
  { prodId: 104, prodname: "airpods", price: 4000 },
];

let addProducttoTable = (newProducts) => {
  let tableBody = document.getElementById("prod-table");
  let trow = document.createElement("tr");
  trow.innerHTML = `<td>${newProducts.prodId}</td>
  <td>${newProducts.prodname}</td>
  <td>${newProducts.price}</td>
  <td><a href="#" class="delete" >Delete</a>
   `;
  tableBody.appendChild(trow);
};

for (let x in products) {
  addProducttoTable(products[x]);
}
