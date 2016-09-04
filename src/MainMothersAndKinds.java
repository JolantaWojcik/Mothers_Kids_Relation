import java.util.List;

public class MainMothersAndKinds {
	public static void main(String[] args) {
		List<Mother> mothers = MotherFactory.getMothers();
		mothers.forEach(System.out::println);
		List<Kid> kids = KidFactory.getKids(mothers);
		kids.forEach(System.out::println);
		System.out.println("###");
		System.out.println(kids.get(0).getMother());
	}
}
