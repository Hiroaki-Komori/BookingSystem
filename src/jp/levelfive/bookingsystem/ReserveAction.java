package jp.levelfive.bookingsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ReserveAction extends Action {
	{
		System.out.println("loadReserveAction.java");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		{
			System.out.println("executeReserveAction");
		}
		ReserveForm reserveForm = (ReserveForm) form;
		// TODO SQL文：予約の登録を試みる
		String input = reserveForm.getName();
		System.out.println("こんにちは、" + input + "さん！");
		return mapping.findForward("index.jsp");
	}

}
