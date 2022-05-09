function onOriginalResponseChange() {
    document.getElementById("convert").disabled =
        document.getElementById("originalResponse").value == "" ? true : false;
    document.getElementById("convertedFile").value == "";
    document.getElementById("showResult").disabled = true;
}

function convertResponse() {
    let originalResponse = document.getElementById("originalResponse").value;

    // Here must be call to server
    const xhr = new XMLHttpRequest();
    xhr.open("POST", "/ttt");
    xhr.setRequestHeader("Accept", "application/json");
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onload = () =>{
        document.getElementById("convertedFile").value = xhr.responseText;
        document.getElementById("showResult").disabled = false;
    }
// or onerror, onabort
    xhr.onerror = (error) =>{
        alert("On error")
    }
   let formData = `{
      "someData": "some data text"
   }`
    xhr.send(formData);
}

function showResult(){
    console.log("Call show result is here");
}