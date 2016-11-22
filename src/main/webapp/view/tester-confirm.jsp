<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Tester information</title>
</head>
<body>
The tester is confirmed: <b>${tester.firstName} ${tester.lastName}</b>
<hr>
Country: <b>${tester.country}</b>
<hr>
Main programming language: <b>${tester.favoriteLanguage}</b>
<hr>
Experience level in programming: <b>${tester.experienceLevel}</b>
<hr>
Languages: <b>
    <ul>
        <c:forEach var="temp" items="${tester.choosenLanguages}">
            <li> ${temp} </li>
        </c:forEach>
    </ul>
</b>
</body>
</html>
