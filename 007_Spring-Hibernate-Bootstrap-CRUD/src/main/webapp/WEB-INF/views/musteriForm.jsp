<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Müşteri</title>
</head>

<body>

	<div class="container">
		<h2>Müşteri Ekle</h2>
		<form:form id="MusteriRegisterForm" modelAttribute="musteri"
			method="post" action="saveMusteri">
			
			<form:hidden path="musteriId" value="${musteriObject.musteriId}" />
			

			<div class="form-group">
				<form:label for="musteriNo" path="musteriNo">Müşteri No :</form:label>
				<form:input type="text" class="form-control" path="musteriNo"
					id="musteriNo" placeholder="Müşteri No" name="musteriNo"
					value="${musteriObject.musteriNo}" />
			</div>


			<div class="form-group">
				<form:label for="musteriAdi" path="musteriAdi">Müşteri Adı :</form:label>
				<form:input type="text" class="form-control" path="musteriAdi"
					id="musteriAdi" placeholder="Müşteri Adı" name="musteriAdi"
					value="${musteriObject.musteriAdi}" />
			</div>


			<div class="form-group">
				<form:label for="musteriSoyadi" path="musteriSoyadi">Müşteri Soyadı :</form:label>
				<form:input type="text" class="form-control" path="musteriSoyadi"
					id="musteriSoyadi" placeholder="Müşteri Soyadı"
					name="musteriSoyadi" value="${musteriObject.musteriSoyadi}" />
			</div>



			<button type="submit" id="saveMusteri" class="btn btn-default"
				>Kaydet</button>

		</form:form>
	</div>


</body>
</html>
