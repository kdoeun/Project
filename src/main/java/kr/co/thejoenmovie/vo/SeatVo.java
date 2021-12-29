package kr.co.thejoenmovie.vo;

import lombok.Data;

@Data
public class SeatVo {
	
	private String title;
	private String cinema_name;
	private String date;
	private String time_start;
	// 좌석을 예매했을 경우 좌석번호를 보낼때 멤버변수모음
	private String[] seat;
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCinema_name() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTime_start() {
		// TODO Auto-generated method stub
		return null;
	}
	public String[] getSeat() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
