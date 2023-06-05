<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>

<body style="background-image: url('https://announcekit.app/blog/wp-content/uploads/2021/05/shutterstock_1235711227.jpg');">


<!-- <h1>this is update product form</h1> -->

<div class="container mt3">
    <div class="row">
    <div class="col-md-6" offset-md-3">
    
    <h1 class="text-center mb3">Update the Product details</h1>
       
<%--                <form action="${pageContext.request.contextPath}/myproduct" method="post"> --%>
                      <form action="${pageContext.request.contextPath}/update" method="post">
       
<!--            <form action="myproduct" method="post"> -->
             
             <input type="text" value="${upd.id}" readonly="readonly" name="id">
             
            <div class="form-group">
                  <label for="name">Product Name</label>
                <input class="form-control" type="text" id="name"
                  placeholder="Enter the product name here" 
                 name="name"
                  area-describedby="emailHelp"
                  value="${upd.name }"
                  >
            </div>


             <div class="form-group">
                <label for="description">Product Description</label>
                <textarea class="form-control" id="description" 
                name="description" 
                placeholder="Enter the product description" required rows="5"
                >${upd.description}
                
                </textarea>
            </div>


           <div class="form-group">
                <label for="price">Product Price</label>
                <input class="form-control" type="text"  placeholder="Enter the product price" 
                 name="price" 
                  id="price" value="${upd.price}">
            </div>


            <div class= "container text-center">
                       <!-- redirect the back page -->
                 <a href="${pageContext.request.contextPath }/"
                  class = "btn ntn-outline-danger">Back</a>
                  
                  <button type="submit" class ="btn btn-warning">
                  Update
                  </button>
            </div>
        </form>

        
    </div>
</div>
</div>
</body>
</html>