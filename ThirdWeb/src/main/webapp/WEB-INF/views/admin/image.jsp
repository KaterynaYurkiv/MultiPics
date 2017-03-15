<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>
<div class="row">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
				    <li><a href="/admin/itemName">Item Name</a></li>
					<li><a href="/admin/brand">Brand</a></li>
					<li><a href="/admin/toc">Type of clothing</a></li>
					<li><a href="/admin/targeta">Target audience</a></li>
					<li><a href="/admin/color<custom:allParams/>">Color</a></li>
					<li><a href="/admin/size">Size</a></li>
					<li><a href="/admin/ioc">Item of clothing</a></li>
					<li><a href="/admin/customer">Customer</a></li>
					<li class="active"><a href="/admin/image">Image</a><span
						class="sr-only">(current)</span></li>
				</ul>
			</div>
		</div>
	</nav>
</div>
<div class="row">
	<%-- <div class="col-md-3 col-xs-12">
 		<form:form class="form-inline" action="/admin/image" method="GET" modelAttribute="filter">
 			<custom:hiddenInputs excludeParams="search"/>
 			<div class="form-group">
 				<form:input class="form-control" path="search" placeholder="Search"/>
 			</div>
 			<button type="submit" class="btn btn-primary">Ok</button>
 		</form:form>
 	</div> --%>
	<div class="col-md-7 col-xs-12">
<%-- 		<div class="row">
			<div class="col-md-12 col-xs-12">
				<form:form class="form-horizontal" action="/admin/image" method="POST" modelAttribute="image" enctype="multipart/form-data">
					<custom:hiddenInputs excludeParams="image"/>					
					<div class="form-group">
    					<label for="name" class="col-sm-2 control-label">Version</label>
    					<div class="col-sm-10">
      						<form:input class="form-control" path="version" id="name"/>
    					</div>
  					</div>
  					<div class="form-group">
     					<label for="file" class="col-sm-2 control-label">Image</label>
     					<div class="col-sm-10">
       						<input name="file" id="file" type="file">
     					</div>
   					</div>
  					<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-10">
      						<button type="submit" class="btn btn-default">Create</button>
    					</div>
  					</div>
				</form:form>
			</div>
		</div> --%>
		<div class="row">
			<div class="col-md-3 col-xs-3"><h3>Image</h3></div>
 			<div class="col-md-3 col-xs-3"><h3>Version</h3></div>
 			<div class="col-md-3 col-xs-3"><h3>Update</h3></div>
 			<div class="col-md-3 col-xs-3"><h3>Delete</h3></div>
		</div>
			<c:forEach items="${images}" var="image">
				<div class="row">
<!-- 					тут все так само як на сервлетах -->
					<div class="col-md-3 col-xs-3"><img src="/images/clothes/${image.id}.jpg?version=${image.version}" width="100%"></div>
 					<div class="col-md-3 col-xs-3">${image.version}</div>
 					<div class="col-md-3 col-xs-3"><a class="btn btn-warning" href="/admin/image/update/${image.id}<custom:allParams/>">update</a></div>
 					<div class="col-md-3 col-xs-3"><a class="btn btn-danger" href="/admin/image/delete/${image.id}<custom:allParams/>">delete</a></div>
				</div>
			</c:forEach>
	</div>
<%-- 	<div class="col-md-2 col-xs-12">
			<div class="row">
					<div class="col-md-6 col-xs-6 text-center">
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" type="button"
								data-toggle="dropdown">
								Sort <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<custom:sort innerHtml="Version asc" paramValue="version" />
								<custom:sort innerHtml="Version desc" paramValue="version,desc" />
							</ul>
						</div>
					</div>
					<div class="col-md-6 col-xs-6 text-center">
						<custom:size posibleSizes="1,2,5,10" size="${page.size}" />
					</div>
				</div>
	</div> --%>
</div>
<%-- <div class="row">
	<div class="col-md-12 col-xs-12 text-center">
		<custom:pageable page="${page}" cell="<li></li>" container="<ul class='pagination'></ul>" />
	</div>
</div> --%>