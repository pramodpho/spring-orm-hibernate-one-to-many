<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/05/2019
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
    <script src="<c:url value="/resources/js/jQuery-3.4.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</head>
<body>
<div class="container">
    <div class="card">
        <div class="card-body">
            <form action="user/save" method="POST" id="userForm">

                <div class="form-group row">
                    <label for="userId" class="col-sm-2 col-form-label">User ID</label>

                    <div class="col-sm-4">
                        <input type="number" class="form-control" name="userId" id="userId">
                    </div>
                </div>

                <div class="form-group row">
                    <label for="username" class="col-sm-2 col-form-label">User Name</label>

                    <div class="col-sm-4">
                        <input type="text" class="form-control" name="username" id="username">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="password" class="col-sm-2 col-form-label">Password</label>

                    <div class="col-sm-4">
                        <input type="password" class="form-control" id="password" placeholder="Password">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="status" class="col-sm-2 col-form-label">Status</label>

                    <div class="col-sm-4">
                        <input type="number" class="form-control" id="status" placeholder="status" >
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-offset-1 col-sm-4">
                        <input type="submit" value="Submit" class="btn-block btn btn-primary" id="btnSubmit"/>
                    </div>
                </div>

            </form>
        </div>
    </div>
    <div class="card">
        <div class="card-body">
            <table border="1" class="table">
                <tr>
                    <th>UserId</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Status</th>
                    <th>Remove</th>
                </tr>
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <td> ${user.userId}</td>
                        <td> ${user.username}</td>
                        <td> ${user.password}</td>
                        <td> ${user.status}</td>
                        <td><a href="<c:url value='/user/delete?id=${user.userId}'/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>
</div>

<script>
    $('#btnSubmit').on('click', function (e) {
        e.preventDefault();
        alert('Submit Clicked');
        $.ajax({
            url: '/user/save',
            type: 'POST',
            data: $('#userForm').serializeArray(),
            success: function (res) {
                alert(res);
                /*if(res.status == 1){
                 alert(res.text);
                 } else{
                 alert(res.text);
                 }*/
            }
        });
    });
</script>

</body>
</html>
