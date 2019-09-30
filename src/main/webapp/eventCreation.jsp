<%-- 
    Document   : view1
    Created on : 29/09/2019, 01:02:30 AM
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
            <jsp:attribute name="content"> <!--Bloque de contenido, definido en el tag sidebar.tag-->

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
                                            <label for="title">Título</label>
                                            <input type="text" class="form-control" id="title" name="title">
                                            <small id="titleHelp" class="form-text text-muted">Agrega un nombre conciso y claro.</small>
                                        </div>

                                        <div class="form-group">
                                            <br>
                                            <label for="description">Descripción</label>
                                            <textarea class="form-control" id="description" name="description" rows="5"></textarea>
                                            <small id="descriptionHelp" class="form-text text-muted">Cuenta a los demás de que trata el evento.</small>
                                        </div>

                                        <div class="form-group">
                                            <br>
                                            <label for="expositor">Expositor</label>
                                            <select id="expositor" name="expositor" class="form-control">
                                                <option selected>Elige...</option>
                                                <option>...</option>
                                            </select>
                                            <small id="expositorHelp" class="form-text text-muted">Persona que presentará la ponencia durante el evento.</small>
                                        </div>

                                        <div class="form-group">
                                            <br>
                                            <label for="date">Fecha y hora</label>
                                            <input class="form-control" type="datetime-local" value="2011-08-19T13:45:00" id="date" name="date">
                                            <small id="dateHelp" class="form-text text-muted">Día y hora en la cual se desarrollará el evento.</small> 
                                        </div>

                                        <br>

                                        <button type="submit" class="btn btn-primary" formaction="eventCreationS2.jsp">Siguiente</button>  

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

</body>
</html>