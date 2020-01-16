<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>

<html>
	<head>
		<title>
			Create user account
		</title>	
	</head>
	<body>
	
		<div>
			Create account
		</div>
		
		<div>
			<form:form method='POST' action='/addUser' modelAttribute='User'>
				
				<div>
					<form:label path='name'>Name</form:label>
					<form:input path='name' />
					<form:errors path='name' cssClass='error' />
				</div>
				
				<div>
					<form:label path='username'>Username</form:label>
					<form:input path='username' />
					<form:errors name='username' cssClass='error'></form:errors>
				</div>
				
				<div>
					<form:label path="password"></form:label>
					<form:input path="password" />
					<form:errors path="password" cssClass="error"/>
				</div>
				
				<div>
					<input type="submit" value="Register" />
				</div>
				
			</form:form>
		</div> 
		
	</body>
</html>