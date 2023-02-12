package com.drug.dto;

import java.util.Date;

public class QnaDTO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Integer viewcnt;
	private Integer STEP; 	//step
	private Integer indent; //들여쓰기
	
	public Integer getSTEP() {
		return STEP;
	}
	public void setSTEP(Integer sTEP) {
		STEP = sTEP;
	}
	public Integer getIndent() {
		return indent;
	}
	public void setIndent(Integer indent) {
		this.indent = indent;
	}

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}
	@Override
	public String toString() {
		return "QnaDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + ", STEP=" + STEP + ", indent=" + indent + "]";
	}
	

}
