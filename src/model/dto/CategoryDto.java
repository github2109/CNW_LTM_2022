package model.dto;

public class CategoryDto {
	private int CategoryId;
	private String CategoryName;
	
	public CategoryDto(int categoryId, String categoryName) {
		CategoryId = categoryId;
		CategoryName = categoryName;
	}
	
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
}