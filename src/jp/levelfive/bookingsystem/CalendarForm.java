package jp.levelfive.bookingsystem;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CalendarForm extends ActionForm {
	{
		System.out.println("loadCalendarForm.java");
	}
	public static final long serialVersionUID = 2L;
	private int year;
	private int month;
	private int[] calendarMatrix = new int[5 * 7];

	// private CalendarBean[] calBean = null;

	public int[] getCalendarMatrix() {
		return calendarMatrix;
	}

	public void setCalendarMatrix(int[] calMatrix) {
		this.calendarMatrix = calMatrix;
	}

	public CalendarForm(int year, int month) {
		this.year = year;
		this.month = month;
		calcFields();
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	private void calcFields() {
		int startDay;
		int lastDate;

		Calendar calendar = Calendar.getInstance();
		calendar.clear();

		calendar.set(year, month - 1, 1);
		startDay = calendar.get(Calendar.DAY_OF_WEEK);

		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		lastDate = calendar.get(Calendar.DATE);

		int row = 0;
		int col = startDay - 1;
		for (int date = 1; date <= lastDate; date++) {
			calendarMatrix[row * 7 + col] = date;
			if (col == 6) {
				row++;
				col = 0;
			} else {
				col++;
			}
		}
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("resetCalendarForm");
		super.reset(mapping, request);
		try {
			request.setCharacterEncoding("UTF-8");
			// this.setYear(Calendar.YEAR);
			// this.setMonth(Calendar.MONTH);
			this.setYear(2015);
			this.setMonth(6);
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
	}
}
