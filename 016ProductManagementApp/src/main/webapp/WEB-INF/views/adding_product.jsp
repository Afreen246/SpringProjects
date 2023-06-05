<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>

<body style="background-image: url('https://thumbs.dreamstime.com/z/many-used-modern-electronic-gadgets-use-white-floor-reuse-recycle-concept-top-view-164230611.jpg');">


<!-- <h1>this is add product form</h1> -->

<div class="container mt3">
    <div class="row">
    <div class="col-md-6" offset-md-3">
    <h1 class="text-center mb3">Fill the Product details</h1>
       
             <form action="myproduct" method="post">
             
            <div class="form-group">
                  <label for="name">Product Name</label>
                <input class="form-control" type="text" id="name"  placeholder="Enter the product name here" 
                 name="name"
                  area-describedby="emailHelp">
            </div>

<!--             <div class="form-group"> -->
<!--             <label for="description">Product Description</label> -->
<!--                 <input class="input100" type="text" name="email" placeholder="Email" required> -->
<!--                 <span class="focus-input100"></span> -->
<!--             </div> -->



             <div class="form-group">
                <label for="description">Product Description</label>
                <textarea class="form-control" id="description" 
                name="description" 
                placeholder="Enter the product description" required rows="5"></textarea>
            </div>


           <div class="form-group">
                <label for="price">Product Price</label>
                <input class="form-control" type="text"  placeholder="Enter the product price" 
                 name="price" 
                  id="price">
            </div>


            <div class= "container text-center">
                       <!-- redirect the back page -->
                 <a href="${pageContext.request.contextPath }/"
                  class = "btn ntn-outline-danger">Back</a>
                  <button type "Submit" class ="btn btn-primary">
                  Add</button>
            </div>
        </form>

        
    </div>
</div>
</div>
</body>
</html>