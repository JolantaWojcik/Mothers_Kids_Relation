import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KidFactory {

	public static List<Kid> getKids(List<Mother> mothers) {
		
		/*
		 * przekszta³cenie listy matek na mapê klucz wartosc.
		 * gdzie kluczem bedzie id matki a wartoscia referencja do matki
		 */
		List<Kid> kids = new ArrayList<>();
	
		Map<Integer, Mother> map = new HashMap<>();
		//174
		for(int i=0; i<mothers.size(); i++){
			map.put(mothers.get(i).getId(), mothers.get(i));
		}
				
		try (Scanner sc = new Scanner(new File("dzieci.txt"))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] args = line.split(" ");
				//Kid(int id, String gender, String name, String birthDate, int weight, int height, Mother mother)
				//1 c Agnieszka 1999-11-20 2450 48 33
				kids.add(new Kid(Integer.parseInt(args[0]), args[1], args[2], args[3],
						Integer.parseInt(args[4]),Integer.parseInt(args[5]), 
						map.get(Integer.parseInt(args[6]))));// <- zwroci Ci Matkê z mapy
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kids;
	}
}
