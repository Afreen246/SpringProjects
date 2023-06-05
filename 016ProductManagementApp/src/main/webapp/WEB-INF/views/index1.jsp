<html>
<head>
<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body style="background-image: url('https://images.news18.com/ibnlive/uploads/2021/06/1624945730_featured-image-2021-06-29t111724.512.jpg?impolicy=website&width=0&height=0');">
	<!-- mt3=margin top 3 ,mb3=bottom margin 3-->
	<div class="container mt3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcom to Product App</h1>

<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Pruct Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${pr}" var="item">
    <tr>
      <th scope="row">Product${item.id}</th>
      <td>${item.name}</td>
      <td>${item.description}</td>
      <td class="font-weight-bold">&#8377; ${item.price}</td>
    
    <td><!-- delete icon button -->
       <a href="delete/${item.id }"><i class="fa-solid fa-trash  text-danger" style="font-size: 30px;"></i></a>
    
       <a href="update/${item.id }"><i class="fa-solid fa-pen-fancy  text-primary" style="font-size: 30px;"></i></a>
    </td>
    
    </tr>
    </c:forEach>
    
  </tbody>
</table>

<div class="container text-center">
<a href="add"  class="btn btn-outline-success">Add Product</a>
</div>

			</div>

		</div>

	</div>

</body>
</html>
