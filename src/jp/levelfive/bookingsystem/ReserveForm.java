package jp.levelfive.bookingsystem;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ReserveForm extends ActionForm {
	{
		System.out.println("loadReserveForm.java");
	}
	private static final long serialVersionUID = 1L;
	private String title;
	private String name;
	private int month;
	private int day;
	private int hourFrom;
	private int minFrom;
	private int hourTo;
	private int minTo;
	private String password;

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getHourFrom() {
		return hourFrom;
	}

	public int getMinFrom() {
		return minFrom;
	}

	public int getHourTo() {
		return hourTo;
	}

	public int getMinTo() {
		return minTo;
	}

	public String getPassword() {
		return password;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setHourFrom(int hourFrom) {
		this.hourFrom = hourFrom;
	}

	public void setMinFrom(int minFrom) {
		this.minFrom = minFrom;
	}

	public void setHourTo(int hourTo) {
		this.hourTo = hourTo;
	}

	public void setMinTo(int minTo) {
		this.minTo = minTo;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
		System.out.println("resetReserveForm");
		try {
			request.setCharacterEncoding("UTF-8");
			this.setName("お名前は？");
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
	}

}
