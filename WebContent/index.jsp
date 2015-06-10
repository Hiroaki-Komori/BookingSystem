<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking System</title>
</head>

<center>
	<table>
		<html:form method="POST" action="reserve.do">

			<tr>
				<td>タイトル<html:text property="title" /> 予約者名<html:text
						property="name" />
				</td>
				<td rowspan=2><html:submit value="予約" /></td>
			</tr>

			<tr>
				<td>月<html:select property="month" /> 日<html:select
						property="day" /> 時<html:select property="hourFrom" /> 分<html:select
						property="minFrom" /> ～ 時<html:select property="hourTo" /> 分まで<html:select
						property="minTo" /> 削除パスワード<html:password property="password" />
				</td>
			</tr>
		</html:form>
	</table>
</center>
<bean:write name="reserveform" property="name" scope="request" />
<bean:write name="reserveform" property="title" scope="request" />
<table>
	<tr>
		<td colspan="7">
		<html:form method="POST" action="calendar.do" />
			<bean:write name="calendarform" property="year" scope="request" />
			<bean:write name="calendarform" property="month" scope="request" />
			</td>
	</tr>

	<tr>
		<th>日</th>
		<th>月</th>
		<th>火</th>
		<th>水</th>
		<th>木</th>
		<th>金</th>
		<th>土</th>
	</tr>
	<tr>
		<td></td>
	</tr>
	<% int x=0; int y=0; %>
	<logic:iterate id="row" name="calendarform" property="calendarMatrix">
	<tr>
	<logic:iterate id="col" name="row">
	<td>てす
	<%-- bean:write name="calendarform" property="calendarMatrix"/--%>
	</td>
	</logic:iterate>
	</tr>
	</logic:iterate>

</table>


</html:html>