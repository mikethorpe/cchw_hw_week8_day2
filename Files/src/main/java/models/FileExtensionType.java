package models;

public enum FileExtensionType {
	JPG(".jpg"),
	TXT(".txt"),
	JAVA(".java");

	private String fileExtension;

	FileExtensionType(String fileExtension){
		this.fileExtension = fileExtension;
	}

	public String getFileExtension(){
		return this.fileExtension;
	}


}
