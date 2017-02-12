<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body {
            background-color: #404040;
            color: powderblue;
        }
    </style>
    <title>Test form request example</title>
</head>
<body>
<div class="container">
    <h1>Test form request example</h1>
    <table id="first" width="25%">
        <tr>
            <td>
                <form action="/showForm">
                    <input type="submit" class="btn btn-primary"
                           value="Fill tester info "
                           title="Show form that uses tester model by Tester POJO"/>
                </form>
            </td>
            <td>
                <form action="/home/requestForm/">
                    <input type="submit" class="btn btn-primary"
                           value="Fill request form"
                           title="Form with REST attributes that using @RequestParam for retrieving data"/>
                </form>
            </td>
        </tr>
    </table>
    <br/>
    <table border="0" width="100%">
        <tr>
            <td width="33%"><a href="http://hibernate.org/" target="_blank">
                <img src="/images/hibernate_logo.png" style="width: 100%"/>
            </a>
            </td>
            <td width="33%">
                <a href="https://spring.io/" target="_blank">
                    <img src="/images/spring_logo.png" style="width: 100%">
                </a>
            </td>
            <td width="34%">
                <a href="http://www.oracle.com/technetwork/java/javaee/jsp/index.html"
                   target="_blank">
                    <img src="/images/jsp_logo.png" alt="" style="width: 100%">
                </a>
            </td>
        </tr>
        <tr>
            <td>
                <div class="caption">
                    <p>We use Hibernate as a main project's ORM</p>
                </div>
            </td>
            <td>
                <div class="caption">
                    <p>We use Spring Framework for dependency injection and
                        build the "flow" for web application.</p>
                </div>
            </td>
            <td>
                <div class="caption">
                    <p>JavaServer Pages (JSP) technology helps us to
                        provides a simplified, fast way to create dynamic
                        web content.</p>
                </div>
            </td>
        </tr>
    </table>
</div>
</body>
</html>