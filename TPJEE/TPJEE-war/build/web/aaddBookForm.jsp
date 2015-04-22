<%-- 
    Document   : aaddBookForm
    Created on : 20 avr. 2015, 16:04:05
    Author     : ziad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
 <body>
        <h1>Ajouter un livre</h1>
        <form method="post" action="AddBook">
                <label for="titre">Titre</label>
                <input required="required" type="text" name="title" id="title"/>

                <label for="auteur">Auteur</label>
                <input required="required" type="text" name="author" id="author"/>
                                
                <label for="parution">Annee de parution :</label>
                <input required="required" type="date" name="parution" id="parution"/>

            <input type="submit" value="Envoyer" />
            <input type="reset" value="Effacer" />
        </form>
    </body>   
</html>
