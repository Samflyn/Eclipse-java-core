package arrayList;
//List can contain duplicate values;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionAll {
	public static void main(String[] args) {
		List<String> al =new ArrayList<String>();//increases by 50%.
		LinkedList<String> ll = new LinkedList<String>();
		List<String> l = new LinkedList<String>();
		Vector<String> v = new Vector<String>();//synchronized. increases by 100%.
		Stack<String> s = new Stack<String>();
		//Sets cantain unique variables.It is parent for hash and tree set.
		HashSet<String> h = new HashSet<String>();
		TreeSet<String> t = new TreeSet<String>();
		Set<String> set = new HashSet<String>();
		//Maps contain keys and values.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
	}
}
