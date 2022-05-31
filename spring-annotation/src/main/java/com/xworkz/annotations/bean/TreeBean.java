package com.xworkz.annotations.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TreeBean {
	@Value(value = "Mango")
	private String treeName;
	@Value(value = "10.5")
	private double height;

	public TreeBean() {
		System.out.println(this.getClass().getSimpleName() + "Object created");
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TreeBean [treeName=" + treeName + ", height=" + height + "]";
	}
	public void getWood() {
		System.out.println("getting the wood");
	}
	
}
