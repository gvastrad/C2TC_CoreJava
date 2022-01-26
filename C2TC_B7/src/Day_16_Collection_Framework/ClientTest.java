package Day_16_Collection_Framework;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ClientTest {

	public static void main(String[] args) {

		Comparator<String> vowelComparator = new VowelComparator();
		PriorityQueue<String> pq = new PriorityQueue<String>(10,vowelComparator);
		pq.add("orange");
		pq.add("fig");
		pq.add("watermelon");
		pq.add("lemon");
		while (pq.size() != 0) {
			System.out.println(pq.remove());
		}
		
	}

}
