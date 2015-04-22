<%-- 
    Document   : ex3-index
    Created on : 21 avr. 2015, 18:25:17
    Author     : ziad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercice 3</title>
    </head>
    <body>      
        <form method="post" action="AddBook">
             <h1>Ajouter un livre</h1>
            <fieldset>
                <label for="titre">Titre :</label>
                <input required="required" type="text" name="title" id="title"/>
                
                <label for="auteur">Auteur :</label>
                <input required="required" type="text" name="author" id="author"/>
                
                <label for="parution">Date :</label>
                <input required="required" type="date" name="date" id="date"/>
            </fieldset>  
            <input type="submit" value="Ajouter" />
            <input type="reset" value="Effacer" />
        </form>                              
        
     <form method="post" action="Authors">
         <a><h1>Afficher la liste des auteurs!</h1></a>
            <p><input type="submit" value="Auteurs"></p>
        </form>
    </body>
</html>
