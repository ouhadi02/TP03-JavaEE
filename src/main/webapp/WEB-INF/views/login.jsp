<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Connexion</title></head>
<body>

    <h2>Connexion</h2>

    <% if (request.getAttribute("error") != null) { %>
        <p style="color:red;"><%= request.getAttribute("error") %></p>
    <% } %>

    <% if (request.getAttribute("success") != null) { %>
        <p style="color:green;"><%= request.getAttribute("success") %></p>
    <% } %>

    <form method="post" action="<%= request.getContextPath() %>/login">

        <label>Nom d'utilisateur :</label><br>
        <input type="text" name="username" /><br><br>

        <label>Mot de passe :</label><br>
        <input type="password" name="password" /><br><br>

        <input type="submit" value="Se connecter" />

    </form>

    <br>
    <a href="<%= request.getContextPath() %>/signup">
        S'inscrire
    </a>

</body>
</html>