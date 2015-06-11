package jp.levelfive.bookingsystem;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class TimeTableForm extends ActionForm {
	private int date;
	private int[][] timeTable = new int[48][3];
	private ArrayList<ReserveData> reserveList = new ArrayList<>();

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int[][] getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(int date) {
		for (ReserveData data : reserveList) {
			for (int time = data.getStartTime() + 1; time <= data.getEndTime(); time++) {
				this.timeTable[time][data.getRoomNumber()] = 1;
			}
		}
	}

	public ArrayList<ReserveData> getReserveList() {
		return reserveList;
	}

	public void setReserveList(int date) {
		// TODO SQL文：当日の予約リストを取得して、リストに入れる
	}

}
