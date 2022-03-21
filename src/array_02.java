import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class array_02 {
	
	public static void main(String[] args) {
		
		int[] a = {1, 1, 2, 3, 4};
		
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(1, a[0]);
		map.put(2, a[1]);
		map.put(3, a[2]);
		map.put(4, a[3]);
		map.put(5, a[4]);
		
		Set<Integer> kset = map.keySet();
		for(Integer k : kset) {
			System.out.println(k + " : " + map.get(k));
		}
		
	}
}
