package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

public class QAVO implements Serializable {
	private Integer questionId;
	private Integer count;
	private Integer countToal;

	public Integer getCount() {
		return count;
	}

	public Integer getCountToal() {
		return countToal;
	}

	public void setCountToal(Integer countToal) {
		this.countToal = countToal;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private Integer userId;
	private Date date;
	private String contents;
	private Integer answerId;
	private Integer employeeId;
	private String answer;

}
