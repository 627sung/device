package home.beans.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

//뷰 (daily_count)를 저장하기 위한 DTO
public class DailyCountDto {	
	private String day;
	
	
	
	public DailyCountDto(ResultSet rs)  throws SQLException {
		this.setDay(rs.getString("day"));
		this.setCnt(rs.getInt("cnt"));

	}
	
	
	public DailyCountDto() {
		super();
	}
	
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	private int cnt ;
	
	
	
	
	
	
}
