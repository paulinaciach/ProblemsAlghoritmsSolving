package paula.info.Sekcja5;

public class FlourPacker {

	public static void main(String[] args) {

		// System.out.println(canPack(1, 0, 6));
		System.out.println(canPack(2, 1, 11));
	}

	// bigCount is 5kg
	// if bigCount(*5) + smallCount are equal Goal return true
	// if bigCount = 0, then smallCount needs to be equal goal or be higher
	// if smallCount = 0 then bigCount needs to be multiply * 5 and goal%5==0
	// then if bigCount > goal and goal%5==0 return true
	// if both SCount and BCount are !=0, then goal = goal-bigCount(*5)
	// smallCount needs to be higher than goal or equal

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		if (bigCount == 0 && smallCount >= goal) {
			return true;
		} else if ((smallCount == 0) && (goal % 5 == 0) && ((bigCount * 5) >= goal)) {
			return true;
		} else if ((smallCount != 0) && (bigCount != 0)) {

			int smallBagsNeeded = goal % 5;
			int bigBagsReq = goal / 5;

			if (bigCount >= bigBagsReq && (bigBagsReq * 5) + smallCount >= goal) {
				return true;
			} else if (bigCount < bigBagsReq && (bigCount * 5) + smallCount >= goal) {
				return true;
			} else
				return false;

		}
		return false;

	}

}
