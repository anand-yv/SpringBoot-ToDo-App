<html>
    <head>
        <title> Login </title>
        <link href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Welcome to Login Page!!</h1>
            <pre style="color:red">${errorMessage}</pre>
            <form method="post">
                Username : <input type="text" name="name"/>
                Password : <input type="password" name="password"/>
                <input type="submit"/>
            </form>
        </div>

        <script src="/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>