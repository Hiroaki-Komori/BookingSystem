package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalendarAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		{
			System.out.println("executeCalendarAction");
		}
		CalendarForm calendarForm = (CalendarForm) form;
		calendarForm.setCalendarMatrix(CalendarForm.getCurrentYear(), CalendarForm.getCurrentMonth());
		return mapping.getInputForward();
	}
}
