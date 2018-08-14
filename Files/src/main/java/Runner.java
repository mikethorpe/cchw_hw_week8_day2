import db.DBFolder;
import db.DBHelper;
import models.File;
import models.FileExtensionType;
import models.Folder;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Folder superFolder = new Folder("SuperFolder");
		DBHelper.save(superFolder);

		Folder myJunkFolder = new Folder("Junk");
		DBHelper.save(myJunkFolder);

		File myCode = new File("myCode", FileExtensionType.JAVA, 240, superFolder);
		DBHelper.save(myCode);

		File toDo = new File("Todo", FileExtensionType.TXT, 40, superFolder);
		DBHelper.save(toDo);

		myCode.setName("myFantasticCode");
		DBHelper.update(myCode);

		File myPhoto = new File("myPhoto", FileExtensionType.JPG, 400, superFolder);
		DBHelper.save(myPhoto);

		File myJunkFile = new File("JunkFile", FileExtensionType.TXT, 200, myJunkFolder);
		DBHelper.save(myJunkFile);

		// Test delete
		// DBHelper.delete(myPhoto);

		// Test get all files
		List<File> allFiles = DBHelper.findAll(File.class);

		// Test get file by id
		File foundPhoto = DBHelper.findById(File.class, 3);

		// Test get all files in folder
		List<File> allSuperFolderFiles = DBFolder.getFiles(superFolder);

	}
}
