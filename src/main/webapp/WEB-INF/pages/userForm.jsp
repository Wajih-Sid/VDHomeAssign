
<%--
  Created by IntelliJ IDEA.
  User: Wajih Sid
  Date: 10/25/2015
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>


<meta charset="utf-8" />
<title>User CRUD Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}../../resources/js/user.js"></script>
</head>
<body>

<div class="container">

  <div class="page-header">
    <h1>Registration form <small>Please Enter User Information</small></h1>
  </div>

  <!-- Registration form - START -->
  <div class="container">
    <div class="row">
      <form role="form"  id="userForm" name="user" method="post" action="#">
        <div class="col-lg-6">

          <div class="form-group">
            <label>Enter Email</label>
            <div class="input-group">
              <input type="email" class="form-control" id="InputEmailFirst" name="EMAIL" placeholder="Enter Email" required>
              <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
          </div>

          <div class="form-group">
            <label for="InputName">Enter UserName</label>
            <div class="input-group">
              <input type="text" class="form-control" name="NAME" id="InputName" placeholder="Enter Name" required>
              <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
          </div>

          <div class="form-group">
            <label for="ROLE">Role</label>
            <div class="input-group">
              <input type="role" name="ROLE" id="ROLE" placeholder="Enter user role" class="form-control" />
              <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
            </div>
          </div>

        </div>
      </form>

    </div>
  </div>
  <!-- Registration form - END -->

</div>




<div class="container col-lg-12">
    <div class="row">
        <form role="form"  id="userFetchForm" name="user" method="get" action="#">
            <div class="col-lg-12">

                <div class="form-group">
                    <label>User to find</label>
                    <div class="input-group">
                        <input type="text" class="form-control" id="InputUserEmail" name="ID" placeholder="Please enter user id" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <input type="button" name="usershow" id="userget" value="Show Users" class="btn btn-success pull-right" onclick="getUsers()">
            </div>
        </form>

    </div>
</div>


<!-- Registration form - END -->








<div class="container col-lg-12">
    <div class="row">
        <form role="form"  id="userDelForm" name="user" method="get" action="#">
            <div class="col-lg-12">

                <div class="form-group">
                    <label>User to Delete</label>
                    <div class="input-group">
                        <input type="text" class="form-control" id="deleteUser" name="ID" placeholder="User to Delete" required>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                    </div>
                </div>
                <input type="button" name="usershow" id="userdel" value="Delete User" class="btn btn-warning pull-right" onclick="delUser()">
            </div>
        </form>

    </div>
</div>


















<div class="container col-lg-12">
    <div class="row">
        <form role="form"  id="userAllFetchForm" name="user" method="patch" action="#">
            <div class="col-lg-12">
                <input type="button" name="usershow" id="usergetAll" value="Show All Users" class="btn btn-warning pull-left" onclick="getAllUsers()">
            </div>
        </form>

    </div>
</div>








<div id="resultsContainer">
    <table class="table table-responsive table-bordered" id="results">
        <thead>
        <th>Name</th>
        <th>Role</th>
        </thead>
        <tbody>

        </tbody>

    </table>


</div>


<table class="table table-responsive table-bordered" id="resultsAll">
    <thead>
    <th>ID</th>
    <th>Name</th>
    <th>Role</th>
    <th>Email</th>
    </thead>
    <tbody>

    </tbody>
</table>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

</body>
</html>