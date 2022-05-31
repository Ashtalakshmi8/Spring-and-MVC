package com.xworkz.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaperFactoryBean {
	@Value(value = "365")
	private Integer noOfPaperproduced;
//	@Value(value ="true")
	private boolean isPaperavailable;


	private TreeBean treeBean;


	PaperFactoryBean(TreeBean treeBean) {
		super();
		this.treeBean = treeBean;
		System.out.println("PARAMETERIZED:" + this.getClass().getSimpleName() + "Object created");

	}

	
	public PaperFactoryBean() {
		System.out.println("Zero:" + this.getClass().getSimpleName() + "Object created");
	}

	public Integer getNoOfPaperproduced() {
		return noOfPaperproduced;
	}

	public void setNoOfPaperproduced(Integer noOfPaperproduced) {
		this.noOfPaperproduced = noOfPaperproduced;
	}

	public boolean isPaperavailable() {
		return isPaperavailable;
	}
	@Value(value = "true")
	public void setPaperavailable(boolean isPaperavailable) {
		this.isPaperavailable = isPaperavailable;
	}

	public TreeBean getTreeBean() {
		return treeBean;
	}
	@Autowired
	public void setTreeBean(TreeBean treeBean) {
		this.treeBean = treeBean;
	}

	public void generatePaper() {
		treeBean.getWood();
		System.out.println("generating the wood");
	}

	@Override
	public String toString() {
		return "PaperFactoryBean [noOfPaperproduced=" + noOfPaperproduced + ", isPaperavailable=" + isPaperavailable
				+ ", treeBean=" + treeBean + "]";
	}

}
