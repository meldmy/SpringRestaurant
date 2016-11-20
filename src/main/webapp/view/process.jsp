<!DOCTYPE html>
<html>
<head>
    <title>Hello, tester</title>
</head>
<body>
Hello, tester!
<br><br>
Tester name, received as GET: ${param.testerName} <br>
Tester name, received from model layer: ${modelTesterName} <br>

<form action="processDataForm" method="GET">
    <input type="text" name="testerName" placeholder="Change your name"/>
    <input type="submit"/>
</form>

</body>
</html>
