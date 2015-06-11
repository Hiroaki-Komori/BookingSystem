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
		{
			System.out.println("executeCalendarForwardAction");
		}
		CalendarForm calendarForm = (CalendarForm) form;
		if (calendarForm.getMonth() + 1 == 1) {
			calendarForm.setYear(calendarForm.getYear() - 1);
			calendarForm.setMonth(12);
		} else {
			calendarForm.setMonth(calendarForm.getMonth() - 1);
			calendarForm.setCalendarMatrix(calendarForm.getYear(),
					calendarForm.getMonth());
		}
		return mapping.findForward("index.jsp");
	}
}
