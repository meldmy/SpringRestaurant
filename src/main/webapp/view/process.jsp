<!DOCTYPE html>
<html>
<head>
    <title>Hello, tester</title>
</head>
<body>
Hello, tester!
<br><br>
Tester firstName, received as GET: ${param.testerName} <br>
Tester last firstName, received as GET: ${param.testerLastName} <br>
<hr>
Tester firstName, received from model layer: ${modelTesterName} <br>
Tester last firstName, received from model layer: ${modelTesterLastName} <br>
<hr>
${tester}

<form action="/processDataFormAnnRequest" method="GET">
    <input type="text" firstName="testerName" placeholder="Change your firstName"/>
    <input type="text" firstName="testerLastName" placeholder="Change your last firstName"/>
    <input type="submit"/>
</form>

</body>
</html>
