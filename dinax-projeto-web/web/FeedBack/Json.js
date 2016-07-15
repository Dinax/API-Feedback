  //Cria o Header do Json.        
        function createJsonHeader(){
             
            var header = 
                {        
                      "alg": "HS256",
                      "typ": "JWT"
                };
            var headerText = JSON.stringify(header, null, 2);
            return headerText;
               
        }
        
         //Cria o Payload do Json.        
        function createJsonPayload(){
            
            //Recebe o nome da pagina correspondente
            var name = window.location.pathname;
            name = name.slice(28);  
            
            //Recebe o nome somente do service que esta solicitando
            var service = name.split(".");
            service = service[0];        
            
            //Recebe o valor da sessão
            var session = document.get;
            
            //Cria o json correspondente
            var payload = 
                {        
                    "iss": "Service/" + service,
                    "name": name,
                    "token": session,
                    "login": document.getElementById("txtUser").value                   
                };                
                        
            var payloadText = JSON.stringify(payload, null, 2);
            alert(payloadText);   
            return payloadText;           
        }
        
        //Encript base64
        function getBase64Encode(rawStr){            
            var wordArray = CryptoJS.enc.Utf8.parse(rawStr);
            var result = CryptoJS.enc.Base64.stringify(wordArray);              
            return result;           
        }
