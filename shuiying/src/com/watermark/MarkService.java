package com.watermark;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

public interface MarkService {
	
	public static final String MARK_TEXT="≈À∑…";
	
	public static final String FONT_NAME="Œ¢»Ì—≈∫⁄";
	public static final int FONT_STYLE=Font.BOLD;
	public static final int FONT_SIZE=120;
	public static final Color FONT_COLOR=Color.black;
	
	public static final int X=10;
	public static final int Y=10;
	public static float ALPHA =0.3F;
	public static final String LOGO ="logo.png";
   public String watermark(File image,String imageFileName,String uploadPath,String readUploadPath);
}
