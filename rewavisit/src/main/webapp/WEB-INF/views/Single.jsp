<div class="container">

<!-- Breadcram -->
<div class="row">
<div class="col-xs-12">

<ol class="breadcrumb">

<li><a href="${contextRoot}/home">Home</a></li>
<li><a href="${contextRoot}/show/all/prodcuts">Product</a></li>
<li class="active">${product.name}</li>
</ol>

</div>
</div>




<div class="row">

<!-- Display Img -->
<div class="col-xs-12 col-sm-4">
<div class="thumnail">

<img src="${images}/${product.code}.jpg" class="img img-responsive"/></div>
</div> 

<!-- Description -->

<div class="col-xs-12 col-sm-8">
<h3>${product.name}</h3>
<hr>
<p>${product.discription}</p>
<hr>
<h4> <strong> &#8377; ${product.unitPrice} /-</strong></h4>
<hr>
<h6>Qty. Available  : ${product.quantity}</h6>

<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart">Add to Cart</span></a>
<a href="${contextRoot}/show/all/products"	class="btn btn-success">Back</a>
</div>


</div>

</div>