import db.DBHelper;
import models.File;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		File myCode = new File("myCode", ".java", 240, "Somefolder");
		DBHelper.save(myCode);

		File toDo = new File("Todo", ".txt", 40, "Another folder");
		DBHelper.save(toDo);

		myCode.setName("myFantasticCode");
		DBHelper.update(myCode);

		File myPhoto = new File("myPhoto", ".jpd", 400, "Photo folder");
		DBHelper.save(myPhoto);
//		DBHelper.delete(myPhoto);

		List<File> allFiles = DBHelper.findAll(File.class);

		File foundPhoto = DBHelper.findById(File.class, 3);
	}
}
