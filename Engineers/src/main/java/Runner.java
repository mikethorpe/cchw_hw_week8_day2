import db.DBHelper;
import models.Engineer;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Engineer brunel = new Engineer("Isambard Kingdom", "Brunel");
		DBHelper.save(brunel);

		Engineer musk = new Engineer("Elon", "Musk");
		DBHelper.save(musk);

		brunel.setFirstName("I K");
		DBHelper.update(brunel);

		Engineer tesla = new Engineer("Nikola", "Tesla");
		DBHelper.save(tesla);
		// DBHelper.delete(tesla);

		List<Engineer> allEngineers = DBHelper.findAll(Engineer.class);

		Engineer foundTesla = DBHelper.findById(Engineer.class, 3);
	}
}
