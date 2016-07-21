   
        //Encript JWT
        function createJWT(){   
          
        if ((($(txtUser).val() == "")||($(txtUser).val().trim() == "")) 
                    || (($(txtPassword).val() == "")||($(txtPassword).val().trim() == ""))){
        
        document.getElementById("txtResult").innerHTML = "Usuario e senha devem ser preenchidos";         
        }
        else{                
        var txtHeader = createJsonHeader();         
        var txtPayload = createJsonPayload();  
      
        var txtSecret = document.getElementById("txtPassword");       
        
        var base64Header = getBase64Encode(txtHeader);
        var base64Payload = getBase64Encode(txtPayload);         
        
        var signature = CryptoJS.HmacSHA256(base64Header + "." + base64Payload, txtSecret.value); 
        var base64Sign = CryptoJS.enc.Base64.stringify(signature);       
        var jwt = (base64Header + "." + base64Payload + "." + base64Sign);          
      
        
        $.ajax({
          type: 'post',
          data: jwt,
          url:'../Auth',
           success: function(retorno){               
                document.getElementById("txtResult").innerHTML = retorno; 
                alert("Sucesso: " + retorno);
            }              
            ,error: function(retorno){                             
               document.getElementById("txtResult").innerHTML = retorno;
                alert("Erro: " + retorno);
          } 
        });
        }
    }
    
     
