<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/Common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${errorConFirmPass!=null }">
		<script type="text/javascript">
		window.alert("Mật khẩu không đồng nhất");
		</script>
	</c:if>
 <!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text">
                        <a href="#"><i class="fa fa-home"></i> Home</a>
                        <span>Register</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Form Section Begin -->

    <!-- Register Section Begin -->
    <div class="register-login-section spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 offset-lg-3">
                    <div class="register-form">
                        <h2>Register</h2>
                        <form action="<c:url value='/Register' />" method="POST">
                            <div class="group-input">
                                <label for="username">Username or email address *</label>
                                <input type="text" id="username" name="user">
                            </div>
                             <div class="group-input">
                                <label for="username">Fullname *</label>
                                <input type="text" id="username" name="fullname">
                            </div>
                             <div class="group-input">
                                <label for="username">Address *</label>
                                <input type="text" id="username" name="addrees">
                            </div>
                             <div class="group-input">
                                <label for="username">Phone number *</label>
                                <input type="text" id="username" name="phone">
                            </div>
                            <div class="group-input">
                                <label for="username">Gender *</label>
                                <input type="text" id="username" name="gender">
                            </div>
                            <div class="group-input">
                                <label for="pass">Password *</label>
                                <input type="text" id="pass" name="pass">
                            </div>
                            <div class="group-input">
                                <label for="con-pass">Confirm Password *</label>
                                <input type="text" id="con-pass" name = "cfpass">
                            </div>
                            <button type="submit" class="site-btn register-btn">REGISTER</button>
                        </form>
                        <div class="switch-login">
                            <a href="/Login" class="or-login">Or Login</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Register Form Section End -->
</body>
</html>