<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en" xmlns:form="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>List Todos</title>
    <link href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <form:form method="post" modelAttribute="todo">
        <h1>Enter Todo</h1>
        Description :
        <form:input type="text" path="description" required="required"/>
        <form:errors path="description" cssClass="text-danger"/>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success">
    </form:form>
</div>


<script src="/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>