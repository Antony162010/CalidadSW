<%@tag description="header" pageEncoding="UTF-8" %> 
<!--description="header" // <t:header></t:header> es como llamas al tag y su contenido en el jsp-->
<%@attribute name="content" fragment="true" %>


<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-dark border-right border-dark" id="sidebar-wrapper">
        <div class="sidebar-heading border-right border-dark"><font color="white">SIGCE</font></div>
        <div class="list-group list-group-flush">
            <a href="eventStartPage.jsp" class="list-group-item list-group-item-action bg-dark"><font color="white">Inicio</font></a>
            <a href="eventCreation.jsp" class="list-group-item list-group-item-action bg-dark"><font color="white">Crear evento</font></a>
            <a href="eventManagement.jsp" class="list-group-item list-group-item-action bg-dark"><font color="white">Gestión de eventos</font></a>
            <a href="eventEnviroment.jsp" class="list-group-item list-group-item-action bg-dark"><font color="white">Ambiente</font></a>
            <a href="#" class="list-group-item list-group-item-action bg-dark"><font color="white">Reportes</font></a>
        </div>
    </div>
    <!-- /#sidebar-wrapper -->
    
    
    <!-- Page Content -->
    <div id="page-content-wrapper">

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark border-bottom border-dark">

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                          
                    <li class="nav-item ml-4">
                        <a class="nav-link" href="#">Usuario Logueado</a>
                    </li>

                </ul>
            </div>
        </nav>

        <jsp:invoke fragment="content" /> <!--Bloque para trabajar el contenido de las vistas-->

    </div>
    <!-- /#page-content-wrapper -->
    
    
</div>
<!-- /#wrapper -->