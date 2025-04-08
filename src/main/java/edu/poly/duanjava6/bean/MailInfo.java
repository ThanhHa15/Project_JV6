package edu.poly.duanjava6.bean;

import java.io.File;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailInfo {  //Class MailInfo được sử dụng để đại diện thông tin của một email khi gửi đi trong ứng dụng.
	private String from = "phucnhps19246@fpt.edu.vn", to, cc[], bcc[], subject, body;
	private List<File> attachments;
	
	public MailInfo(String to, String subject, String body) {
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
}
