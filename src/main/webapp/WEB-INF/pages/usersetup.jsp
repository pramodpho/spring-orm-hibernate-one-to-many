<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 14/05/2019
  Time: 06:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="card">
    <div class="card-body">
        <form id="userSetupForm" method="post" action="<c:url value='/usersetup/save'/>"
              class="form-horizontal globalForm">

            <div class="row">

                <div class="col-md-12">
                    <div class="form-group row">
                        <label class="col-md-2 align-right required" for="userName">Username : </label>

                        <div class="col-md-3">
                            <input type="text" name="userName" id="userName" class="form-control input-sm" required>
                        </div>

                    </div>
                    <div class="form-group row">
                        <label class="col-md-2 align-right required" for="password">Password : </label>

                        <div class="col-md-3">
                            <input type="password" name="password" id="password"
                                   class="form-control input-sm resetP" required>
                        </div>
                        <label class="col-md-2 align-right required" for="confirmPassword">Confirm Password : </label>

                        <div class="col-md-3">
                            <input type="password" name="confirmPassword" id="confirmPassword"
                                   class="form-control input-sm resetP" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-md-2 align-right required" for="fullName">Full Name : </label>

                        <div class="col-md-3">
                            <input type="text" name="fullName" id="fullName" class="form-control input-sm editable"
                                   required>
                        </div>
                    </div>
                    <div class="form-group  row">
                        <label class="col-md-2 align-right required" for="agencyCode">Agency :</label>

                        <div class="col-md-3">
                            <select id="agencyCode"
                                    class="form-control input-sm editable" name="agencyCode"
                                    required="true">
                                <option value="">---Please select---</option>
                                <option value="1">MoEA</option>
                                <option value="2">MoF</option>
                                <option value="3">MoWHS</option>
                                <option value="3">MoLHR</option>

                            </select>
                        </div>

                        <label class="col-md-2 align-right required" for="userStatus">Status :</label>

                        <div class="col-md-3">
                            <select id="userStatus"
                                    class="form-control input-sm editable" name="userStatus"
                                    required="true">
                                <option value="I">Inactive</option>
                                <option value="A">Active</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-md-2 align-right" for="employeeCode">Employee Code :</label>

                        <div class="col-md-3">
                            <input type="text" name="employeeCode" id="employeeCode"
                                   class="form-control input-sm editable">

                        </div>

                        <label class="col-md-2 align-right required" for="userProfileId">User Profile :</label>

                        <div class="col-md-3">
                            <select id="userProfileId"
                                    class="form-control input-sm editable" name="userProfileId"
                                    required="true">
                                <option value="">---Please select---</option>
                                <option value="1">Admin</option>
                                <option value="2">Users</option>

                            </select>
                        </div>
                    </div>


                    <div class="form-group row">
                        <div class="col-md-1"></div>
                        <div class="col-md-2">
                            <input type="reset" id="btnReset" class="btn btn-primary btn-block" value="Reset">
                        </div>
                        <div class="col-md-2">
                            <input type="button" id="btnEdit" value="Edit" class="btn btn-primary btn-block"
                                   disabled>
                        </div>
                        <div class="col-md-2 hide" id="resetDiv">
                            <input type="button" id="resetPassword" value="Reset Password"
                                   class="btn btn-primary btn-block" disabled>
                        </div>
                        <div class="col-md-2">
                            <input type="submit" id="btnSave" value="Save" class="btn btn-primary btn-block">
                        </div>
                        <div class="col-md-2">
                            <input type="button" id="btnDelete" value="Delete" class="btn btn-primary btn-block"
                                   disabled>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>
