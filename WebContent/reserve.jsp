<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<html:form method="POST" action="reserve.do">
	タイトル<html:text property="title" />
	予約者名<html:text property="name" />
	月<html:select property="month" />
	日<html:select property="day" />
	時<html:select property="hourFrom" />
	分<html:select property="minFrom" />
	～
	時<html:select property="hourTo" />
	分まで<html:select property="minTo" />
	削除パスワード<html:password property="password" />
	</html:form>
</body>
</html:html>