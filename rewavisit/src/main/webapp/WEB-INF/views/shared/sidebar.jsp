<h1 class="my-4"> Category</h1>
<div class="list-group">

	<c:forEach items="${cetegories}" var="cetegory">
	
		<a href="${contextRoot}/show/cetegory/${cetegory.id}/gallary" class="list-group-item" id="a_${cetegory.name}">${cetegory.name}</a>
		
	</c:forEach>
</div>