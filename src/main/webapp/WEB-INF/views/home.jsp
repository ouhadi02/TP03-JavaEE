<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Accueil</title></head>
<body>

    <h2>Page d'accueil</h2>

    <p>Bienvenue, <strong><%= session.getAttribute("username") %></strong> !</p>

    <p>Vous êtes bien connecté.</p>

    <a href="<%= request.getContextPath() %>/logout">Se déconnecter</a>

</body>
</html>