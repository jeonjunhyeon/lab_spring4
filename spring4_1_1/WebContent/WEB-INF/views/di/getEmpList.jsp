<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   	//서블릿에서 EmpLogic.java -> EmpDao.java -> List<Map>
   	// mav.addObject("empList", empList);
   	// request.setAttribute("empList", empList);
   	// 이것이 forwar방식이다.
   	List<Map<String, Object>> empList = (List<Map<String, Object>>)request.getArrayList();
   	out.print(empList); //구조체 형식의 출력을 볼 수 있다.
   	
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사원목록 list Page입니다.
</body>
</html>