<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/bootstrap.min.css">
</head>
<body>
<form action="saveToCart" class="form-horizontal" method="post">
<div class="form-group">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<h2 style="text-align: center;">Add Product To Cart</h2>
</div>
</div>
<hr>
<div class="form-group">
<label class="control-label col-sm-4">Product Name</label>
<div class="col-sm-4">
<input type="text" name="productname" class="form-control">
</div>
</div>
<div class="form-group">
<label class="control-label col-sm-4">Product Brand</label>
<div class="col-sm-4">
<input type="text" name="productbrand" class="form-control">
</div>
</div>
<div class="form-group">
<label class="control-label col-sm-4">Quantity</label>
<div class="col-sm-4">
<input type="text" name="quantity" class="form-control">
</div>
</div>
<div class="form-group">
<label class="control-label col-sm-4">Price</label>
<div class="col-sm-4">
<input type="text" name="price" class="form-control">
</div>
</div>
<div class="form-group">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<div class="col-sm-2">
<input type="submit" value="Add" class="btn btn-success" style="width: 80px;">
</div>
<div class="col-sm-1"></div>
<div class="col-sm-2">
<a href="viewAllCart" class="btn btn-primary">View Cart Product</a>
</div>
</div>
</div>
</form>
</body>
</html>