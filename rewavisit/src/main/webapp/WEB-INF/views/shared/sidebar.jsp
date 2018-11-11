<h1 class="my-4"> Visiting Places</h1>
<div class="list-group">

	<c:forEach items="${cetegories}" var="cetegory">
	
		<a href="${contextRoot}/show/cetegory/${cetegory.id}/gallary" class="list-group-item">${cetegory.name}</a>
		
	</c:forEach>
</div>