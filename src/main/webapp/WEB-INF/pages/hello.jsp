<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>${message}</h1>
    <h2> Name : ${name}</h2>
<a href="<c:url value="/user"/>"> Click to view User page</a>
</body>
</html>