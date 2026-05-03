<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Inscription</title></head>
<body>

    <h2>Inscription</h2>

    <% if (request.getAttribute("error") != null) { %>
        <p style="color:red;"><%= request.getAttribute("error") %></p>
    <% } %>

    <form method="post" action="<%= request.getContextPath() %>/signup">

        <label>Nom d'utilisateur :</label><br>
        <input type="text" name="username" /><br><br>

        <label>Mot de passe :</label><br>
        <input type="password" name="password" /><br><br>

        <input type="submit" value="S'inscrire" />

    </form>

    <br>
    <a href="<%= request.getContextPath() %>/login">
        Déjà un compte ? Se connecter
    </a>

</body>
</html>