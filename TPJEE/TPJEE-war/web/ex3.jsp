<%-- 
    Document   : ex3
    Created on : 22 avr. 2015, 15:09:16
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
         <h1>Connection :</h1>   
        <form method="post" action="Connexion">
            <p><input type="text" name="user" placeholder="Identifiant"></p>
            <p><input type="password" name="password" placeholder="Mot de passe"></p>
            <p><input type="submit" value="Connexion"></p>
        </form>
         
         </br></br> <a style="color:Black;" href="inscription.jsp"><h2> Vous n'etes pas encore inscrit? </h2></a>
          </br></br> <a style="color:Black;" href="ex3-index.jsp"><h2> Anon User </h2></a>

    </body>
</html>
