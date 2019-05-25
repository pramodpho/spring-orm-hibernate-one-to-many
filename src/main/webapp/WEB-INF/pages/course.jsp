<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 17/05/2019
  Time: 06:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div class="container">
    <div class="card-body">
        <form id="courseForm" class="" action="" method="POST">
            <div class="form-group row">
                <input type="hidden" name="courseId" id="courseId">
                <label class="col-md-2" for="courseName">Course Name</label>
                <div class="col-md-4">
                    <input type="text" class="form-control" id="courseName" name="courseName"/>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-md-2" for="courseType">Course Type</label>
                <div class="col-md-4">
                    <select class="form-control" id="courseType" name="courseType">
                        <option value="1">Arts</option>
                        <option value="2">Commerce</option>
                        <option value="3">Science</option>
                    </select>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-md-2" for="status">Status</label>
                <select class="form-control" id="status" name="status">
                    <option value="A">Active</option>
                    <option value="I">Inactive</option>
                </select>
            </div>

            <div class="table-responsive">
                <table class="table " id="subjectTbl">
                    <thead>
                        <tr><th>Subject Id</th><th>Subject Name</th><th>Score</th> <th><input type="button" value="Add More" id="addMore"> </th></tr>
                    </thead>
                    <tbody>

                        <tr>
                            <td><input type="number" id="sId" name="subjects[0].subjectId" class="form-control"> </td>
                            <td><input type="text" id="sName" name="subjects[0].subjectName" class="form-control"> </td>
                            <td><input type="number" id="score" name="subjects[0].score" class="form-control"> </td>
                            <td><input type="button" id="btnRemove" value="Remove" class="form-control"> </td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <div class="form-group row">
                <div class="col-md-2">
                    <input type="button" class="btn btn-block" value="Save" id="btnSave">
                </div>
                <div class="col-md-2">
                    <input type="button" class="btn btn-block" value="Delete" id="btnDelete">
                </div>
            </div>
        </form>

    </div>

    <div class="card">
        <div class="card-body">
            <table border="1" class="table" id="courseListTbl">
                <tr>
                    <th>Course Id</th>
                    <th>Course Name</th>
                    <th>Type</th>
                    <th>Status</th>
                </tr>
                <c:forEach var="course" items="${courseList}">
                    <tr>
                        <td><span name="courseId">${course.courseId}</span></td>
                        <td> ${course.courseName}</td>
                        <td> ${course.courseType}</td>
                        <td> ${course.status}</td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>
</div>

<script>
    var subjectTbl = $('#subjectTbl');

    subjectTbl.on('click','#addMore',function(e){
        var trNumber = subjectTbl.find('tbody tr').length;
        var tr = '<tr>'+
                '<td><input type="number" id="sId" name="subjects['+trNumber+'].subjectId" class="form-control"> </td>'+
                '<td><input type="text" id="sName" name="subjects['+trNumber+'].subjectName" class="form-control"> </td>'+
                '<td><input type="number" id="score" name="subjects['+trNumber+'].score" class="form-control"> </td>'+
                '<td><input type="button" id="btnRemove" value="Remove" class="form-control"> </td></tr>';
        subjectTbl.find('tbody').append(tr);
    });

    function save(){
        $('#courseForm').on('click','#btnSave',function(e){
            $.ajax({
                url: globalConf.context+'/course/save',
                type: 'POST',
                data: $('#courseForm').serializeArray(),
                success: function (res) {
                    alert(res);
                }

            });
        });
    }

    function delete_course(){
        $('#courseForm').on('click','#btnDelete',function(e){
            $.ajax({
                url: globalConf.context+'/course/deleteCourse/' + $('#courseId').val() ,
                type: 'DELETE',
                success: function (res) {
                    alert(res);
                }

            });
        });
    }

    function getSingleCourse() {
        $('#courseListTbl tr').on('click',function(e){
            var courseId = $(this).find("span[name='courseId']").html();
            $.ajax({
                url: globalConf.context+'/course/getSingleCourse/' + courseId,
                type: 'GET',
                success: function (res) {
                    debugger;
                    populate(res);
                }

            });
        });
    }

    save();
    getSingleCourse();
    delete_course();

    function populate(data) {
        for (var i in data) {
            if (typeof (data[i]) === 'object') {

            } else {
                $(
                        "input[type='text'][name='" + i + "']," +
                        " input[type='hidden'][name='" + i + "'], " +
                        "input[type='checkbox'][name='" + i + "'], " +
                        "input[type='email'][name='" + i + "'], " +
                        "select[name='" + i + "'], textarea[name='" + i + "']"
                )
                        .val(data[i]);

                $("input[type='radio'][name='" + i + "'][value='" + data[i] + "']").prop('checked', true);
            }
        }

        $('form').find('input[type="checkbox"]').each(
                function () {
                    if ($(this).siblings('input[type="hidden"]').val() == "true" ||
                            $(this).siblings('input[type="hidden"]').val() == 1) {
                        $(this).prop('checked', true);
                    } else {
                        $(this).prop('checked', false);
                    }
                }
        );
    }
</script>

</body>
</html>
