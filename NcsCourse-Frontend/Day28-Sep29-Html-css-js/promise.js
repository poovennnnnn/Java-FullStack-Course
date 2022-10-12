let myPromise = new Promise(function (myResolve, myReject) {
  fetch("https://jsonplaceholder.typicode.com/todos/1")
    .then((response) => response.json())
    .then((json) => console.log(json));

  var flag = true;
  if (flag) {
    myResolve("resolved");
  } else {
    myReject("error in promise");
  }
});

myPromise
  .then(function (value) {
    console.log(`promise resolved ${value}`);
  })
  .catch((err) => console.log(`rejected ${err}`))
  .finally(() => console.log("finished"));
