<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www32.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理结果</title>
</head>
<body>
<table width="99%" align="center">
<tr>
<td width="50%"><img src=${pageContext.request.contextPath }<s:property value="pickInfo.imageURL"/>
      width="350"/></td>
<td width="50%"></td>
</tr>

</table>
</body>
</html>