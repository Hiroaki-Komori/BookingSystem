package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalendarAction extends Action {
	{
		System.out.println("loadCalendarAction.java");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		{
			System.out.println("executeCalendarAction");
		}
		CalendarBean calendarBean = (CalendarBean)form;
		request.setAttribute("msg", calendarBean);
		return mapping.findForward("index.jsp");
	}
}
