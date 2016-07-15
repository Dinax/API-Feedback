
        //Faz a leitura do formulario para verificar se usuario e senha estão preenchidos
        $(document).ready(function(){
            $("input").blur(function(){
            if(($(this).val() == "")||($(this).val().trim() == "")){
             
                    $(this).css({"border-color" : "#F00", "padding": "2px"});
            }else {
               
                    $(this).css({"border-color" : "#CCCCCC", "padding": "1px"});                    
                }               
                  
            });
        })      


