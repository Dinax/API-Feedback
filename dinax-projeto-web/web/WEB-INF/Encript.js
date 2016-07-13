

function getBase64Encode(rawStr){
    var wordArray = CryptoJS.enc.Utf8.parse(rawSTr);
    var result = CryptoJS.enc.Base64.stringify(wordArray);   
}

function doEncode(){
    var txtUser = document.getElementById("txtUser");
    var txtPassword = document.getElementById("txtPassword");
    var resultEncode = document.getElementById("txtResult");
    
}
