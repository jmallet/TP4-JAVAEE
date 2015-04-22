<%-- 
    Document   : ex2
    Created on : 20 avr. 2015, 14:26:26
    Author     : ziad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercice 2</title>
    </head>
    <body>
        <h1>Récapitulatif</h1>
        <a style="color:green;">Titre:</a> <%= request.getParameter("titre") %> <br/>
        <a style="color:green;"> Nom d'auteur: </a><%= request.getParameter("auteur") %> <br/>
        <a style="color:green;"> Année de parution:</a> <%= request.getParameter("annee") %> <br/>
        </br>
        <%
            String titre = (request.getParameter("titre") == null) ? "" : request.getParameter("titre");
            String annee = (request.getParameter("annee") == null) ? "" : request.getParameter("annee");
            String auteur = (request.getParameter("auteur") == null) ? "" : request.getParameter("auteur");
        %>
        
        <form action="ex2.jsp" method="POST">
        	<label for="titre">Titre</label>
        	<input required="required" type="text" name="titre" value="<%= titre %>"><br/>
        	<label for="auteur">Auteur</label>
        	<input required="required" type="text" name="auteur" value="<%= auteur %>"><br/>
        	<label for="annee">Année de parution</label>
        	<input required="required" type="text" name="annee" pattern="[0-9]{4}" value="<%= annee %>"><br/>
        	<button type="submit">Valider</button>
        </form>
        
    </body>
</html>
