package com.yadu.himalayamtnew.xmlGetterSetter;

import java.util.ArrayList;

public class CategoryMasterGetterSetter {
	
	public String getCategory_master_table() {
		return category_master_table;
	}
	public void setCategory_master_table(String category_master_table) {
		this.category_master_table = category_master_table;
	}
	public ArrayList<String> getCategory_cd() {
		return category_cd;
	}
	public void setCategory_cd(String category_cd) {
		this.category_cd.add(category_cd);
	}
	public ArrayList<String> getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category.add(category);
	}
	String category_master_table;
	
	ArrayList<String> category_cd=new ArrayList<>();
	ArrayList<String> category=new ArrayList<>();

	ArrayList<String> HIMALAYA_PHOTO = new ArrayList<>();
	ArrayList<String> CATEGORY_PHOTO = new ArrayList<>();

	public ArrayList<String> getHIMALAYA_PHOTO() {
		return HIMALAYA_PHOTO;
	}

	public void setHIMALAYA_PHOTO(String HIMALAYA_PHOTO) {
		this.HIMALAYA_PHOTO.add(HIMALAYA_PHOTO);
	}

	public ArrayList<String> getCATEGORY_PHOTO() {
		return CATEGORY_PHOTO;
	}

	public void setCATEGORY_PHOTO(String CATEGORY_PHOTO) {
		this.CATEGORY_PHOTO.add(CATEGORY_PHOTO);
	}
}
