package com.solivar.InitialProj.data;

import org.springframework.stereotype.Component;

@Component
public class AddDTO {
	
	private Long addSeqId;
	
	public Long getAddSeqId() {
		return addSeqId;
	}
	public void setAddSeqId(Long addSeqId) {
		this.addSeqId = addSeqId;
	}
	private int num1;
	private int num2;
	private int sum;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	

}
