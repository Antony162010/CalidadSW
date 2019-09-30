<%-- 
    Document   : eventCreationS2
    Created on : 29/09/2019, 04:04:12 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webapp/lib/css/simple-sidebar.css" />
        <title>SIGCE</title>
    </head>
    <body>
        <t:sidebar>
            <jsp:attribute name="content">
                <div class="container-fluid">
                    <br>
                    <div class="row">
                        <div class="col-7">

                            <!--Card event creation-->
                            <div class="card ml-4">
                                <div class="card-body">
                                    <h2>Crear Evento</h2>
                                    Después de crear un evento, no podrás cambiar la configuración de este.

                                    <form method="post" action="">
                                        
                                        <div class="form-group">
                                            <br>
                                            <label for="environment">Ambiente</label>
                                            <select id="environment" name="environment" class="form-control">
                                                <option selected>Elige...</option>
                                                <option>...</option>
                                            </select>
                                            <small id="enviromentHelp" class="form-text text-muted">Lugar donde se realizará el evento.</small>
                                        </div>

                                        <br>

                                        <button type="submit" class="btn btn-primary">Crear</button>  

                                    </form>
                                </div>
                            </div>
                            <!--Card end-->
                            <br>
                        </div>

                        <div class="col-2">
                            <!--Default space-->
                        </div>

                        <div class="col-3">
                            <div class="card bg-light mb-3" style="max-width: 18rem;">
                                <div class="card-header">¿Necesitas ayuda?</div>
                                <div class="card-body">
                                    <h5 class="card-title">Sobre la creación de eventos...</h5>
                                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
            </jsp:attribute>
        </t:sidebar>
    </body>
</html>