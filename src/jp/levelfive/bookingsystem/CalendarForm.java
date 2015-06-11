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
	// private ArrayList<String[]> calendarArray = new ArrayList<>();
	// private String[][] calMatrixRows = new String[6][];
	// private String[] calMatrixCols = new String[7];

	private String[][] calendarMatrix = new String[6][7];

	// private CalendarBean[] calBean = null;

	// public String[][] getCalMatrixRows() {
	// return calMatrixRows;
	// }
	//
	// public void setCalMatrixRows(String[][] calMatrixRows) {
	// this.calMatrixRows = calMatrixRows;
	// }
	//
	// public String[] getCalMatrixCols() {
	// return calMatrixCols;
	// }
	//
	// public void setCalMatrixCols(String[] calMatrixCols) {
	// this.calMatrixCols = calMatrixCols;
	// }

	public void setCalendarMatrix(int year, int month) {
		this.year = year;
		this.month = month;
		calcFields();
	}

	public String[][] getCalendarMatrix() {
		return calendarMatrix;
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
		calendar.set(this.year, this.month, 1);
		startDay = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		lastDate = calendar.get(Calendar.DATE);

		for (int row = 0, date = 1; row < 6; row++) {
			for (int col = 0; col < 7; col++) {
				if (row == 0 && col < startDay - 1) {
					calendarMatrix[row][col] = "";
				} else if (date > lastDate) {
					calendarMatrix[row][col] = "";
				} else {
					calendarMatrix[row][col] = String.valueOf(date);
					date++;
				}
			}
		}

		// int row = 0;
		// int col = startDay - 1;
		// for (int date = 1; date < lastDate; date++) {
		// calendarMatrix[row][col] = String.valueOf(date);
		// if (col == 6) {
		// row++;
		// col = 0;
		// } else {
		// col++;
		// }
		// }
		for (String[] strArray : calendarMatrix) {
			for (String str : strArray) {
				System.out.print(str + "\t");
			}
			System.out.println();
		}
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		System.out.println("resetCalendarForm");
		super.reset(mapping, request);
		try {
			request.setCharacterEncoding("UTF-8");
			this.setYear(Calendar.getInstance().get(Calendar.YEAR));
			this.setMonth(Calendar.getInstance().get(Calendar.MONTH));
			this.setCalendarMatrix(this.year, this.month);
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
	}

}