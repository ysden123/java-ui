function onOriginalResponseChange() {
    document.getElementById("convert").disabled =
        document.getElementById("originalResponse").value == "" ? true : false;
    document.getElementById("convertedFile").value == "";
    document.getElementById("showResult").disabled = true;
}

function convertResponse() {
    const originalResponse = document.getElementById("originalResponse").value;

    // Here must be call to server
    document.getElementById("convertedFile").value = "some path to result file";
    document.getElementById("showResult").disabled = false;
}

function showResult(){
    console.log("Call show result is here");
}