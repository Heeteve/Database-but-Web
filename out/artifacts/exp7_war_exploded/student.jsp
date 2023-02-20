<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生页</title>
    <link rel="stylesheet" href="styles/student_style.css">
    <!-- Latest compiled and minified CSS -->
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">--%>
<%--    <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.21.2/dist/bootstrap-table.min.css">--%>

</head>
<body>
    <h1>学生信息</h1>
    <div>
        <form action="deleteStudent" method="get">
            <input type="text" placeholder="id" name="id">
            <button type="submit" class="deleteBtn" onclick="window.location.href='home.html'">删除</button>
        </form>
        <span>${errorMsg}</span>
    </div>
    <div>
        <table>

                <tr>
                    <th>ID&#09</th>
                    <th>学号&#09</th>
                    <th>姓名&#09</th>
                    <th>性别&#09</th>
                    <th>出生日期</th>
                </tr>
            <c:forEach items="${studentList}" var="student">
                <tr>
                    <td>${student.s_id}&#09</td>
                    <td>${student.s_no}&#09</td>
                    <td>${student.s_name}&#09</td>
                    <td>${student.s_gen}&#09</td>
                    <td>${student.s_birth}&#09</td>
                </tr>
            </c:forEach>
        </table>
    </div>


<%--    <table id="table" data-toggle="table" data-url="http://localhost:8080/student" data-pagination="true" data-search="true" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-toolbar="#toolbar">--%>
<%--        <thead>--%>
<%--            <tr>--%>
<%--                <th data-field="id" data-sortable="true">ID</th>--%>
<%--                <th data-field="name">姓名</th>--%>
<%--                <th data-field="gen" data-sortable="true">性别</th>--%>
<%--                </tr>--%>
<%--        </thead>--%>
<%--    </table>--%>

<%--    <div >--%>
<%--        <table id="tableList" class="table table-striped"></table>--%>
<%--    </div>--%>

    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://unpkg.com/bootstrap-table@1.21.2/dist/bootstrap-table.min.js"></script>
    <!-- Latest compiled and minified Locales -->
    <script src="https://unpkg.com/bootstrap-table@1.21.2/dist/locale/bootstrap-table-zh-CN.min.js"></script>
<%--    <script src="scripts/student.js" defer></script>--%>
</body>
</html>