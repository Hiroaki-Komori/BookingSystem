package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ReserveAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ReserveForm reserveForm = (ReserveForm) form;
		String input = reserveForm.getName();
		System.out.println("こんにちは、" + input + "さん！");
		return mapping.getInputForward();
	}

}
