<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html>
<html>
	<head>
		<title>Books Catalouge</title>	
	</head>
	<body>
		Welcome to Books Catalogue
		
		<div>
			<a href='/books-catalogue/all-books'>All books</a>
		</div>
		
		<div>
			Seach books 
		</div>
		
		<div>
		
			<form action='/books-catalogue/search-by-user' method='GET'>
				Search book by user
				<input type='text' id='userName' name='userName'>
				<input type='submit' value='Search'/>
			</form>
				 
			 
		</div>
		
		<div>
			
			<form action='/books-catalogue/search-by-book' method='GET'>
				Search book by book name
				<input type='text' id='bookName' name='bookName'>
				<input type='submit' value='Search'>
			</form>
			
		</div>
		
	</body>
</html>