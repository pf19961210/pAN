package com.watermark;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class WaterMarkAction extends ActionSupport{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File image;
	private String imageFileName;
	private String uploadPath;//xiangduilujing
	private PickInfo picInfo = new PickInfo();
	public PickInfo getPicInfo() {
		return picInfo;
	}

	public void setPicInfo(PickInfo picInfo) {
		this.picInfo = picInfo;
	}

	public String watermark() throws Exception{
	  String realUploadPath = ServletActionContext.getServletContext().getRealPath(uploadPath);
	  UploadService uploadService = new UploadService();
		
		picInfo.setImageURL(uploadService.uploadImage(image, imageFileName, uploadPath, realUploadPath));
		MarkService markService = new ImageMarkService();
		picInfo.setLogoImageURL(markService.watermark(image, imageFileName, uploadPath, realUploadPath));	
		
		
		
		return SUCCESS;
   }
	
	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
public void setImageFileName(String imageFileName){
	this.imageFileName = imageFileName;
}
	public File getImage(){
		return image;
	}
	public String getImageFileName(){
		return imageFileName;
	}
	public void setImage(File image){
		this.image = image;
	}
}
