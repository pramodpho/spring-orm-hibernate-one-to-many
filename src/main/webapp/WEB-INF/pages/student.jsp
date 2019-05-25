<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 15/05/2019
  Time: 06:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

</head>
<body>

<div class="container">
    <div class="card">
        <div class="card-body">
            <form action="" id="studentForm">
                <div class="form-group row">
                    <label class="col-md-2" for="studentId">Student Id</label>
                    <div class="col-md-6">
                        <input type="number" class="form-control" name="studentId" id="studentId">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-2" for="studentId">Student Code</label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" name="studentCode" id="studentCode">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-2" for="studentName">Student Name</label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" name="studentName" id="studentName">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-2" for="dob">Date of Birth</label>
                    <div class="col-md-6">
                        <input type="date" class="form-control" name="dob" id="dob">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-2" for="grade">Grade</label>
                    <div class="col-md-6">
                        <input type="text" class="form-control" name="grade" id="grade">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-2">
                        <input type="submit" id="btnSave" class="btn btn-primary btn-block"/>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    $('#btnSave').on('click', function (e) {
        e.preventDefault();
        $.ajax({
            url: globalConf.context+'/student/save',
            type: 'POST',
            data: $('#studentForm').serializeArray(),
            success: function (res) {

                alert(res);

            }
        });
    });
</script>

</body>
</html>
