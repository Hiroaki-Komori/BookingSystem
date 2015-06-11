package jp.levelfive.bookingsystem;

public class ReserveData {
	private int id;
	private int date;
	private int roomNumber;
	private int startTime;
	private int endTime;
	private String title;
	private String username;

	public ReserveData(int date, int roomNumber, int startTime) {
		this.setDate(date);
		this.setRoomNumber(roomNumber);
		this.setStartTime(startTime);
	}

	public ReserveData getReseveData() {
		return this;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
