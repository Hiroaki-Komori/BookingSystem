<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="Content-Style-Type" content="text/css">
<title>Booking System</title>
<style type="text/css">
<!--
body {
	margin: 0 auto;
	padding: 10px;
	text-align: center;
}

div#wrap {
	margin: 0 auto;
	width: 1050px;
}

.reserveForm {
	height: 100px;
	width: 600px;
	potision: top;
	margin: 0 auto;
}

.calendar {
	float: left;
	margin: 0px;
	padding: 10px;
}

.timeTable {
	float: right;
	margin: 0px;
	padding: 10px;
}

.table2 {
	border: solid 1px #000000;
	border-collapse: collapse;
	table-layout: fixed;
	width: 500;
	empty-cells: show;
}

.table2 tr td{
	border: solid 1px #000000;
	border-collapse: collapse;
	empty-cells: show;
}
-->
</style>

</head>
<body>
	<div id="wrap">
		<div class="reserveForm">
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
		</div>

		<div class="calendar">
			<table width="500">
				<tr>
					<td colspan="7"><html:form method="POST" action="calendar.do" />
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
				<logic:iterate id="row" name="calendarform"
					property="calendarMatrix">
					<tr align="center">
						<logic:iterate id="col" name="row">
						<%= if(${col} == 3){} %>
							<c:if test="${${col}==3}"><td rowspan="3">${col}</td>></c:if>
							<td>${col}</td>
						</logic:iterate>
					</tr>
				</logic:iterate>
			</table>
		</div>
		<div class="timeTable">
			<table class="table2">
				<tr>
					<td>会議室</td>
					<td>応接室</td>
					<td>リフレッシュルーム</td>
				</tr>

<%--			<logic:iterate id="timetable" name="room" property="timeTableArray" scope="request">
				<tr height="12">
					<logic:iterate id="room" name="timetable">
						<td>${room}</td>
					</logic:iterate>
				</tr>
				</logic:iterate>
--%>
			</table>
		</div>
	</div>
</body>
</html:html>