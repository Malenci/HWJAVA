<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="hello-servlet" method="get">
    <a href="hello-servlet">Click here</a>
</form>
<form action="Max-Number" method="post">
    <label for="n1">Number-1</label>
    <input type="number" id="n1" name="num1"/><br/>
    <label for="n2">Number-2</label>
    <input type="number" id="n2" name="num2"/><br/>
    <label for="n3">Number-3</label>
    <input type="number" id="n3" name="num3"/><br/>
    <input type="radio" id="max" name="action" value="max"/>
    <label for="max">Максимум</label><br/>
    <input type="radio" id="min" name="action" value="min"/>
    <label for="min">Минимум</label><br/>
    <input type="radio" id="average" name="action" value="average"/>
    <label for="average">Среднее арифметическое</label><br/>
    <button type="submit">Результат</button>
</form>

<form action="TextWriter" method="get">
    <label for="text">Text</label>
    <input type="text" id="text" name="text">
    <button type="submit">Результат</button>
</form>




</body>
</html>