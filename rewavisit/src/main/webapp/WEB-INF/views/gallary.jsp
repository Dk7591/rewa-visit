<div class="container">


	<div class="row">


		<!-- 	would be display sidebar -->

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>



		<!-- 	To display actual product -->

		<div class="col-md-9">
			<!-- Added breadcrum component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllGallary==true}">
					
					<script>
					window.cetegoryId='';
					</script>
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>&nbsp;&nbsp;
							<li class="active">/ All Places</li>
						</ol>
					</c:if>
					<c:if test="${userClickCetegoryGallary==true}">
					
					<script>
					window.cetegoryId='${cetegory.id}';
					</script>
					
						<ol class="breadcrumb">

							<li><a href="${contextRoot} / home">Home</a></li>&nbsp;
							<li class="active">/ Place</li>&nbsp;
							<li class="active">/ ${cetegory.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
			<div class="row">

				<div class="col-xs-12">
					<table id="productListTable"
						class="table table-striped table-borderd">

						<thead>
							<tr>
							<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qnty Available</th>
								<th></th>
							</tr>
							</thead>
							
							<tfoot>
							<tr>
							<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qnty Available</th>
								<th></th>
							</tr>
							</tfoot>
					</table>
				</div>
			</div>

		</div>
	</div>
</div>