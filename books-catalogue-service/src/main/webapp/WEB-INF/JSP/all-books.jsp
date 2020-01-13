<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>All Books</title>
	</head>
	<body>
		All Books
		
		<c:forEach items="${allBooks}" var="book">
        	<div>
        		Book name: ${book.name} || Average Rating:<%--  ${book.rating}  --%> <!-- Check if rating is -1 then print "No
        																			rating given so far " -->
        	</div>
        	
		</c:forEach>
		
	</body>
</html>