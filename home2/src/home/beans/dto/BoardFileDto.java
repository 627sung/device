package home.beans.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

//board_file 테이블을 옮겨담기 위한 DTO 클래스
public class BoardFileDto {
	private int board_file_no;
	private String board_file_name;
	private String board_file_type;
	private long board_file_size;
	private int board_origin;
	
	public BoardFileDto(ResultSet rs) throws SQLException {
		this.setBoard_file_no(rs.getInt("board_file_no"));
		this.setBoard_file_name(rs.getString("board_file_name"));
		this.setBoard_file_type(rs.getString("board_file_type"));
		this.setBoard_file_size(rs.getLong("board_file_size"));
		this.setBoard_origin(rs.getInt("board_origin"));
	}
	
	public BoardFileDto() {
		super();
	}
	
	public int getBoard_file_no() {
		return board_file_no;
	}
	public void setBoard_file_no(int board_file_no) {
		this.board_file_no = board_file_no;
	}
	public String getBoard_file_name() {
		return board_file_name;
	}
	public void setBoard_file_name(String board_file_name) {
		this.board_file_name = board_file_name;
	}
	public String getBoard_file_type() {
		return board_file_type;
	}
	public void setBoard_file_type(String board_file_type) {
		this.board_file_type = board_file_type;
	}
	public long getBoard_file_size() {
		return board_file_size;
	}
	public void setBoard_file_size(long board_file_size) {
		this.board_file_size = board_file_size;
	}
	public int getBoard_origin() {
		return board_origin;
	}
	public void setBoard_origin(int board_origin) {
		this.board_origin = board_origin;
	}
}