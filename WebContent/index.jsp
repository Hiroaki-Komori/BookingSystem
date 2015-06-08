<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Booking System</title>
</head>

<frameset rows="100,*">
<frame src="reserve.jsp" name="frame1" title="予約フォーム">

<frameset cols="500,*">
<frame src="calendar.jsp" name="frame2" title="カレンダー">
<frame src="timetable.jsp" name="frame3" title="日別">

</frameset>

<noframes>
<body>
<p>フレーム非対応ブラウザ用の中身</p>
</body>
</noframes>
</frameset>

</html:html>