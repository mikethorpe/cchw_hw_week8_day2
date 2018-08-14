import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Folder superFolder = new Folder("SuperFolder");
		DBHelper.save(superFolder);

		File myCode = new File("myCode", ".java", 240, superFolder);
		DBHelper.save(myCode);

		File toDo = new File("Todo", ".txt", 40, superFolder);
		DBHelper.save(toDo);

		myCode.setName("myFantasticCode");
		DBHelper.update(myCode);

		File myPhoto = new File("myPhoto", ".jpd", 400, superFolder);
		DBHelper.save(myPhoto);
//		DBHelper.delete(myPhoto);

		List<File> allFiles = DBHelper.findAll(File.class);

		File foundPhoto = DBHelper.findById(File.class, 3);
	}
}
