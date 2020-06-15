package home.beans.dto;

public class BoardDto {

	private int board_no;
	private String board_head;
	private String board_title;
	private String board_writer;
	private String board_content;
	private String board_date ;
	private int board_read;
	
	
	public BoardDto() {
		super();
	}


	public BoardDto(int board_no, String board_head, String board_title, String board_writer, String board_content,
			String board_date, int board_read) {
		super();
		this.board_no = board_no;
		this.board_head = board_head;
		this.board_title = board_title;
		this.board_writer = board_writer;
		this.board_content = board_content;
		this.board_date = board_date;
		this.board_read = board_read;
	}


	public int getBoard_no() {
		return board_no;
	}


	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}


	public String getBoard_head() {
		return board_head;
	}


	public void setBoard_head(String board_head) {
		this.board_head = board_head;
	}


	public String getBoard_title() {
		return board_title;
	}


	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}


	public String getBoard_writer() {
		return board_writer;
	}


	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}


	public String getBoard_content() {
		return board_content;
	}


	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}


	public String getBoard_date() {
		return board_date;
	}


	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}


	public int getBoard_read() {
		return board_read;
	}


	public void setBoard_read(int board_read) {
		this.board_read = board_read;
	}


	
	
	
	

		
		
		
	
	
}
