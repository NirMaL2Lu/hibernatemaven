package com.listmapping.xml;

import java.util.List;

public class Question1 {
	
	private int qid;
	private String qName;
	private List<String> answers;
	
	public Question1() {
		
	}

	public Question1(int qid, String qName, List<String> answers) {
		super();
		this.qid = qid;
		this.qName = qName;
		this.answers = answers;
	}

	public Question1(String qName, List<String> answers) {
		super();
		this.qName = qName;
		this.answers = answers;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question1 [qid=" + qid + ", qName=" + qName + ", answers=" + answers + "]";
	}
	
	
	
}
