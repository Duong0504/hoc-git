<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="register-container">
    <h2>Làm Thẻ Thư Viện</h2>
    <form action="function" method="post">

        <label for="name">Họ và Tên:</label>
        <input type="text" id="name" name="name" required value="${requestScope.name != null ? requestScope.name : ''}">

        <label for="sdt">SĐT:</label>
        <input type="number" id="sdt" name="sdt" required value="${requestScope.sdt != null ? requestScope.sdt : ''}">

        <label for="CCCD">Mã độc giả(CCCD):</label>
        <input type="text" id="CCCD" name="CCCD" required value="${requestScope.CCCD != null ? requestScope.CCCD : ''}">

        <label for="gender">Giới tính:</label>
        <select id="gender" name="gender" required>
            <option value="" disabled ${requestScope.gender == null ? 'selected' : ''}>Chọn giới tính</option>
            <option value="Nam" ${requestScope.gender == 'Male' ? 'selected' : ''}>Nam</option>
            <option value="Nữ" ${requestScope.gender == 'Female' ? 'selected' : ''}>Nữ</option>
            <option value="Khác" ${requestScope.gender == 'Other' ? 'selected' : ''}>Khác</option>
        </select>
        <label for="ngaysinh">Ngày sinh:</label>
        <input type="date" id="ngaysinh" name="ngaysinh" required value="${requestScope.ngaysinh != null ? requestScope.ngaysinh : ''}">

        <label for="place">Địa chỉ:</label>
        <input type="text" id="place" name="place" required value="${requestScope.place != null ? requestScope.place : ''}">

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required value="${requestScope.email != null ? requestScope.email : ''}">

        <label for="card">Mã thẻ:</label>
        <input type="text" id="card" name="card" required value="${requestScope.card != null ? requestScope.card : ''}">

        <label for="ngaycap">Ngày cấp thẻ:</label>
        <input type="date" id="ngaycap" name="ngaycap" required value="${requestScope.ngaycap != null ? requestScope.ngaycap : ''}">

        <label for="ngayhet">Ngày hết hạn:</label>
        <input type="date" id="ngayhet" name="ngayhet" required value="${requestScope.ngayhet != null ? requestScope.ngayhet : ''}">

        <label for="username">Tài khoản:</label>
        <input type="text" id="username" name="username" required value="${requestScope.username != null ? requestScope.username : ''}">

        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name="password" required value="${requestScope.password != null ? requestScope.password : ''}">

        <label for="cpassword">Xác Nhận Mật khẩu:</label>
        <input type="password" id="cpassword" name="cpassword" required value="${requestScope.cpassword != null ? requestScope.cpassword : ''}">

        <label for="avartar">Avartar:</label>
        <input type="file" id="avartar" name="avartar" required value="${requestScope.avartar != null ? requestScope.avartar : ''}">


        <input type="hidden" id="role" name="role" value="3">
        <p style="color: red">
            <c:if test="${requestScope.msg != null}">
                ${requestScope.msg} <br>
            </c:if>
        </p>

        <p style="color: green">
            <c:if test="${requestScope.success != null}">
                ${requestScope.success}
            </c:if>
        </p>
        <input type="submit" value="Đăng Ký Thẻ">
    </form>
</div>

<style>
    /* Remove vertical centering and ensure it fits inside the main content */
    .register-container {
        background-color: #ffffff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        width: 100%; /* Use full width of the main content area */
        max-width: 600px; /* Set a max width */
        margin: 0 auto; /* Center horizontally */
    }

    .register-container h2 {
        text-align: left;
        margin-bottom: 20px;
    }

    .register-container label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    .register-container input[type="text"],
    .register-container input[type="date"],
    .register-container select {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ddd;
        border-radius: 5px;
    }

    .register-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        border: none;
        color: white;
        border-radius: 5px;
        cursor: pointer;
    }

    .register-container input[type="submit"]:hover {
        background-color: #45a049;
    }

    .register-container p {
        margin-top: 10px;
    }
</style>
