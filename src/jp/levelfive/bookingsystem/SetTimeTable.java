package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SetTimeTable extends Action {
	{
		System.out.println("loadSetTimeTableDate.java");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		{
			System.out.println("executeSetTimeTableAction");
		}
		TimeTableForm timeTableForm = (TimeTableForm) form;
		int date = timeTableForm.getDate();
		timeTableForm.setTimeTable(date);
		timeTableForm.setReserveList(date);
		return mapping.getInputForward();
	}
}
