package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SetCalendarBack extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		CalendarForm calendarForm = (CalendarForm) form;
		int year = CalendarForm.getCurrentYear();
		int month = CalendarForm.getCurrentMonth();
		if (month == 1) {
			CalendarForm.setCurrentYear(year - 1);
			CalendarForm.setCurrentMonth(12);
		} else {
			CalendarForm.setCurrentMonth(month - 1);
			calendarForm.setCalendarMatrix(year,month);
		}
		System.out.println("month--");
		return mapping.getInputForward();
	}
}
