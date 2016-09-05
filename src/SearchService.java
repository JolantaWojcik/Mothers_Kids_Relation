import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class SearchService {
//	1.matka ktora ma najwiecej dzieci
//	2. naciezsze dziecko
//	3. zestawienie rok urodzenia jaka liczba dzieci
	
	public Mother mothersWithMostKids(List<Mother> mothers){
		//problem kiedy maja taka sama ilosc dzieci !!!
		return mothers.stream().collect
				(Collectors.maxBy((o1, o2) -> o1.getKids().size() - o2.getKids().size())).get();
		
	}
	
	public Map<Mother, Long> nrOfKidsPerMother(List<Kid> kids){
		return kids.stream().collect(Collectors.groupingBy
				(e -> e.getMother(), Collectors.counting()));
		
	}
	
	public Kid  heaviestKid(List<Kid> kids){
		return kids.stream().collect(Collectors.maxBy(
				(o1, o2) -> o1.getWeight() - o2.getWeight())).get();
		}
	
	public  long numberOfKidsYearly(String year, List<Kid>kids){
		return kids.stream().filter(p -> p.getBirthDate().contains(year)).count(); 
	}
	
	public  Map<String, Long> listOfKidsYearly(String year, List<Kid>kids){
		
		return kids.stream().collect(Collectors.groupingBy
				(e -> e.getBirthDate(), Collectors.counting()));
	}
	
}
