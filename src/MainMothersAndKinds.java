import java.util.List;

public class MainMothersAndKinds {

	public static void main(String[] args) {
		List<Mother> mothers = MotherFactory.getMothers();
		mothers.forEach(System.out::println);
		List<Kid> kids = KidFactory.getKids(mothers);
		kids.forEach(System.out::println);
		System.out.println("###");
		SearchService ss = new SearchService();
		System.out.println(ss.heaviestKid(kids));
		System.out.println("###");
		System.out.println(ss.listOfKidsYearly("1999-11-17", kids).toString().replace(" ","\n"));
		System.out.println("###");
		System.out.println(ss.numberOfKidsYearly("1999", kids));
		System.out.println("###");
		System.out.println(kids.get(0).getMother());
		System.out.println(ss.nrOfKidsPerMother(kids).toString().replace(" M","\n"));
		System.out.println("###");
		System.out.println(ss.mothersWithMostKids(mothers));
	}
}
