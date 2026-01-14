<%@ page import="com.masonic.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Home" />
	<jsp:param name="pageDescription" value="Home Page" />
	<jsp:param name="topMenu" value="<%= 0 == 1 ? Menus.PUBLIC.asTopLevel().output(request, \"logout\") : \"\" %>" />
	<jsp:param name="h1" value="Reinstein QuizBowl" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>This is the app for writing the Masonic sets. You know what to do.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />