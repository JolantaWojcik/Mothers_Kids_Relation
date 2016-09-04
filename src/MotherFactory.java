import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotherFactory {
	public static List<Mother> getMothers() {
		List<Mother> result = new ArrayList<>();
		try (Scanner sc = new Scanner(new File("mamy.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] args = line.split(" ");
				result.add(new Mother(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2])));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
