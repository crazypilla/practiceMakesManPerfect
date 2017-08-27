import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortmapbyval {
	public static class ValueComparator implements Comparator<Integer> {

	    private TreeMap<Integer, String> map;

	    public ValueComparator(TreeMap<Integer, String> map) {
	        this.map = map;
	    }

	    public int compare(Integer a, Integer b) {
	        return map.get(a).compareTo(map.get(b));
	    }
	}


    public static void main(String[] args){
        TreeMap<Integer, String> random = new TreeMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            random.put(34,"harshu");
            random.put(12,"apple");
            random.put(18,"jeep");
            random.put(9,"ball");
        }

        System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));

        TreeMap<Integer, String> sorted = new TreeMap<Integer, String>(new ValueComparator(random));
    //    System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));
      sorted.putAll(random);
        System.out.println("Sorted Map: " + Arrays.toString(sorted.entrySet().toArray()));
    }


}
