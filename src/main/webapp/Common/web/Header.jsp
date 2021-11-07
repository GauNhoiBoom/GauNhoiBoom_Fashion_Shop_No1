<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/Common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
</head>
<body>
	<header class="header-section">
		<div class="header-top">
			<div class="container">
				<div class="ht-left">
					<c:if test="${sessionScope.account != null}">
					<div class="mail-service">
						<i class=" fa fa-envelope"></i> Hello: ${sessionScope.account.getHoten() }
					</div>
					<div class="phone-service">
						<i class=" fa fa-phone"></i> Phone Number: ${sessionScope.account.getSodienthoai() }
					</div>
					</c:if>
					<c:if test="${sessionScope.account == null}">
					<div class="mail-service">
						<i class=" fa fa-envelope"></i> Bạn chưa đăng nhập.
					</div>
					<div class="phone-service">
						<i class=" fa fa-phone"></i> Phone Number
					</div>
					</c:if>
				</div>
				<div class="ht-right">
					<a href="<c:url value='/Login'/>" class="login-panel"><i class="fa fa-user"></i>Login</a>
					<div class="lan-selector">
						<select class="language_drop" name="countries" id="countries"
							style="width: 300px;">
							<option value='yt'
								data-image="<c:url value='template/web/img/flag-1.jpg'/>"
								data-imagecss="flag yt" data-title="English">English</option>
							<option value='yu'
								data-image="<c:url value='template/web/img/flag-2.jpg'/>"
								data-imagecss="flag yu" data-title="Bangladesh">German
							</option>
						</select>
					</div>
					<div class="top-social">
						<a href="#"><i class="ti-facebook"></i></a> <a href="#"><i
							class="ti-twitter-alt"></i></a> <a href="#"><i
							class="ti-linkedin"></i></a> <a href="#"><i class="ti-pinterest"></i></a>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="inner-header">
				<div class="row">
					<div class="col-lg-2 col-md-2">
						<div class="logo">
							<a href="<c:url value= 'index.jsp'/>"> <img
								src="<c:url value='template/web/img/logo.png'/>" alt="">
							</a>
						</div>
					</div>
					<div class="col-lg-7 col-md-7">
						<div class="advanced-search">
							<button type="button" class="category-btn">All
								Categories</button>
							<div class="input-group">
								<input type="text" placeholder="What do you need?">
								<button type="button">
									<i class="ti-search"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="col-lg-3 text-right col-md-3">
						<ul class="nav-right">
							<li class="heart-icon"><a href="#"> <i
									class="icon_heart_alt"></i> <span>1</span>
							</a></li>
							<li class="cart-icon"><a href="#"> <i
									class="icon_bag_alt"></i> <span>3</span>
							</a>
								<div class="cart-hover">
									<div class="select-items">
										<table>
											<tbody>
												<tr>
													<td class="si-pic"><img
														src="<c:url value='template/web/img/select-product-1.jpg'/>"
														alt=""></td>
													<td class="si-text">
														<div class="product-selected">
															<p>$60.00 x 1</p>
															<h6>Kabino Bedside Table</h6>
														</div>
													</td>
													<td class="si-close"><i class="ti-close"></i></td>
												</tr>
												<tr>
													<td class="si-pic"><img
														src="<c:url value='template/web/img/select-product-2.jpg'/>"
														alt=""></td>
													<td class="si-text">
														<div class="product-selected">
															<p>$60.00 x 1</p>
															<h6>Kabino Bedside Table</h6>
														</div>
													</td>
													<td class="si-close"><i class="ti-close"></i></td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="select-total">
										<span>total:</span>
										<h5>$120.00</h5>
									</div>
									<div class="select-button">
										<a href="#" class="primary-btn view-card">VIEW CARD</a> <a
											href="#" class="primary-btn checkout-btn">CHECK OUT</a>
									</div>
								</div></li>
							<li class="cart-price">$150.00</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="nav-item">
			<div class="container">
				<div class="nav-depart">
					<div class="depart-btn">
						<i class="ti-menu"></i> <span>DANH MỤC</span>
						<ul class="depart-hover">
							<c:forEach items="${listdm }" var="a">

							<li><a href="<c:url value='/ListProducts?dmID=${a.getId()}'/>">${a.getTendanhmuc() }</a></li>
							
							</c:forEach>
							
						</ul>
					</div>
				</div>
				<nav class="nav-menu mobile-menu">
					<ul>
						<li class="active"><a href="./index.html">Home</a></li>
						<li><a href="<c:url value='/ListProducts'/>">Sản Phẩm</a></li>
						<li><a href="#">THƯƠNG HIỆU</a>
							<ul class="dropdown">
								<c:forEach items="${listhsx }" var="a">
								<li><a href="#">${a.getTenhang()}</a></li>
								</c:forEach>
							</ul></li>
						<li><a href="./blog.html">Blog</a></li>
						<li><a href="./contact.html">Contact</a></li>
						<li><a href="#">Pages</a>
							<ul class="dropdown">
								<li><a href="./blog-details.html">Blog Details</a></li>
								<li><a href="./shopping-cart.html">Shopping Cart</a></li>
								<li><a href="./check-out.html">Checkout</a></li>
								<li><a href="./faq.html">Faq</a></li>
								<li><a href="<c:url value='/Register'/>">Register</a></li>
								<li><a href="<c:url value='/Login'/>">Login</a></li>
							</ul></li>
					</ul>
				</nav>
				<div id="mobile-menu-wrap"></div>
			</div>
		</div>
	</header>
</body>
</html>