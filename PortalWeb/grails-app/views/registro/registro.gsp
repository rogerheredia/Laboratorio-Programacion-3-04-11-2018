<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Portal Web- Contactanos  </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="../css/AMEstyle.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

        <style type="text/css">
            
h1.title { 
    font-size: 50px;
    
    font-weight: 700px; 
    color: black;
    text-shadow: 3px 3px 5px #f00,
                 6px 6px 5px #0f0,
                 9px 9px 5px #00f;    
                 

}

hr{
    width: 80%;
    color: black;
    border-color: red;

}

.form-group{
    margin-bottom: 20px;
}





label{
    margin-bottom: 15px;
    color: #D62929

}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 50px;

}

.main-login{
    background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);



}


.main-center{
    
    margin-top: 50px;
    margin: 0 auto;
    max-width: 500px;
    padding: 30px 40px;
    

   
    border-width: 5px;
    border-color: #D62929;
  
    border-radius: 50px;



}



input:hover{
    background-color: #5164F4;
    color: black;
}


.login-button{
    margin-top: 5px;

}

.login-register{
    font-size: 11px;
    text-align: center;

}

        </style>

</head>


<body id="bodyregistro" >
    
      
    <div class="container">
            <div class="row main" >
                <div class="panel-heading">
                   <div class="panel-title text-center">
                        <h1 class="title">Registro de Usuario</h1>
                        <hr />
                    </div>
                </div> 
                <div class="main-login main-center" >
                    <form class="form-horizontal" method="post" action="#">
                        
                        <div class="form-group">
                            <label for="name" class="cols-sm-2 control-label">Nombre Completo</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="name" id="name"  placeholder="Ingrese su nombre completo."/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email" class="cols-sm-2 control-label">Email Usuario</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="email" id="email"  placeholder="Ingrese su correo electronico."/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="username" class="cols-sm-2 control-label">Nombre de Usuario</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="username" id="username"  placeholder="Introduce tu nombre de usuario."/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="password" class="cols-sm-2 control-label">Contraseña</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control" name="password" id="password"  placeholder="Escribe tu contraseña."/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="confirm" class="cols-sm-2 control-label">Confirma tu Contraseña</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Escribe nuevamente tu contraseña."/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group ">
                            <button type="button" class="btn btn-primary btn-lg btn-block login-button">Registrar</button>
                        </div>
                    
                    </form>
                </div>
            </div>
        </div>








</body>
</html>
