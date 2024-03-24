package com.sathya.productApp;

import java.io.InputStream;
import java.sql.Date;
import java.util.Arrays;

public class Product {
	private String proId;
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	public byte[] getProAudio() {
		return proAudio;
	}
	public void setProAudio(byte[] proAudio) {
		this.proAudio = proAudio;
	}
	public byte[] getProVideo() {
		return proVideo;
	}
	public void setProVideo(byte[] proVideo) {
		this.proVideo = proVideo;
	}
	private String proName;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + ", proBrand=" + proBrand
				+ ", proMadeIn=" + proMadeIn + ", proMfgDate=" + proMfgDate + ", proExpDate=" + proExpDate
				+ ", proImage=" + Arrays.toString(proImage) + ", proAudio=" + Arrays.toString(proAudio) + ", proVideo="
				+ Arrays.toString(proVideo) + "]";
	}
	private double proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date proMfgDate;
	private Date proExpDate;
	private byte[] proImage;
	private byte[] proAudio;
	private byte[] proVideo;

}
