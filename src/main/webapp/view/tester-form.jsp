<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Example Input Form</title>
</head>
<body>
<h1>Input form example</h1>
Enter tester's data for processing :
<hr>
<form:form action="processForm" modelAttribute="tester">

    First firstName: <form:input path="firstName"/>
    <br><br>
    Last firstName: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">

        <form:options items="${tester.countryOptions}"/>

    </form:select>
    <br><br>
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
    Scala <form:radiobutton path="favoriteLanguage" value="Scala"/>
    <br><br>
    <input type="submit" value="Submit">
</form:form>


</body>
</html>