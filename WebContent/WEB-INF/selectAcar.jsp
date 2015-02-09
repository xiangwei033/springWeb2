<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

      <form action="/springWeb2/submitselectedCar.html" method="post" style="margin-top:3em;margin-left:5em;">
         <span class = "glyphicon glyphicon-user"></span> 
          Brand: <input type = "text" name="Brand"/><br/>
          Year: <input type = "text" name="year"/><br/>
          Market_price<input type = "text" name="market_price"/><br/>
          <input type="submit">
     </form>
</body>
<footer>
     <%@ include file="footer.jsp" %>
</footer>
</html>