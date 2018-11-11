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
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Gallary</li>
						</ol>
					</c:if>
					<c:if test="${userClickCetegoryGallary==true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot} / home">Home</a></li>&nbsp;
							<li class="active">Cetegory</li>&nbsp;
							<li class="active">${cetegory.name}</li>
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>
		</div>
		</div>