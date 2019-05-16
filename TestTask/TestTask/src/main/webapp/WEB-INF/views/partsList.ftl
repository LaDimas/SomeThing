<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Parts list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Need</th>
        <th>Quantity</th>
    </tr>

<#list parts as part>
    <tr>
        <td>${part.id}</td>
        <td><a href="/part/${part.name}">${part.name}</a></td>
        <td>${part.need}</td>
        <td>${part.quantity}</td>
    </tr>

</#list>
</table>

</body>
</html>