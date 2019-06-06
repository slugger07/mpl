
<% 
	if(request.getSession(false).getId() != null){
	%>
	<jsp:forward page="./view/Home.jsp"></jsp:forward>;
	<%}
	else {
	%>
	<jsp:forward page="./view/login.jsp"></jsp:forward>
	<%}
%>

		