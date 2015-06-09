<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking System</title>
</head>

	<html:form method="POST" action="reserve.do">
	<center>
	<table>

	<tr><td>
	タイトル<html:text property="title" />
	予約者名<html:text property="name" />
	</td>
	<td rowspan=2>
	　
	<html:submit value="予約" />
	　
	</td>
	</tr>

	<tr><td>
	月<html:select property="month" />
	日<html:select property="day" />
	時<html:select property="hourFrom" />
	分<html:select property="minFrom" />
	～
	時<html:select property="hourTo" />
	分まで<html:select property="minTo" />
	削除パスワード<html:password property="password" />
	</td></tr>

	</table>
	</center>
	</html:form>

<table>
	<tr>
		<td colspan="7">
		mon
		</td>
	</tr>

	<tr>
		<th>sun</th>
		<th>mon</th>
		<th>tue</th>
		<th>wed</th>
		<th>thr</th>
		<th>fri</th>
		<th>sat</th>
	</tr>

	<html:form method="POST" action="calendar.do"/>
<%--	<logic:iterate id="row" name="calendarform">
	<tr>
	<logic:iterate id="col" name="row">
	<bean:write name="col"/>
	</logic:iterate>
	</tr>
	</logic:iterate>
 --%>
</table>


</html:html>