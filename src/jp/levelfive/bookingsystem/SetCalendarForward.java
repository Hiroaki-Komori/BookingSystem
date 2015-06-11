package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SetCalendarForward extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		{
			System.out.println("executeCalendarForwardAction");
		}
		CalendarForm calendarForm = (CalendarForm) form;
		if (calendarForm.getMonth() + 1 == 12) {
			calendarForm.setYear(calendarForm.getYear() + 1);
			calendarForm.setMonth(1);
		} else {
			calendarForm.setMonth(calendarForm.getMonth() + 1);
		}
		return mapping.getInputForward();
	}
}