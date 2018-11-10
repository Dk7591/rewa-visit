<h1 class="my-4"> Name</h1>
<div class="list-group">

	<c:forEach items="${cetegories}" var="cetegory">
	
		<a href="#" class="list-group-item">${cetegory.name}</a>
		
	</c:forEach>
</div>