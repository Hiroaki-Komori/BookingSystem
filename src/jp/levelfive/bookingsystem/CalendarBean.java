package jp.levelfive.bookingsystem;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CalendarBean extends ActionForm {
	{
		System.out.println("loadCalendarBean.java");
	}
	private static final long serialVersionUID = 2L;
	private int year;
	private int month;

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
		System.out.println("resetCalendarBean");
		try {
			request.setCharacterEncoding("UTF-8");
			this.setYear(Calendar.getInstance().get(Calendar.YEAR));
			this.setMonth(Calendar.getInstance().get(Calendar.MONTH));
			//this.setYear(2015);
			//this.setMonth(6);
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
	}

}
