package A05_Breitensuche;

import java.util.*;

public class Breitensuche extends BaseTree<Integer> {

	@Override
	protected int compare(Integer a, Integer b) {
		return a.compareTo(b);
	}

	/**
	 * Liefert Knoten des Baums ausgehend von Start in Reihenfolge der Breitensuche zur�ck
	 * @param start Startknoten f�r Teilbaum
	 * @return Liste der Knoten in Breitenfolge
	 */
	public List<Integer> getBreadthFirstOrder(Node<Integer> start) {

		LinkedList<Node<Integer>> next = new LinkedList<>();
		List<Integer> visited = new ArrayList<>();

		next.add(start);

		while (!next.isEmpty()){
									// TODO: define node outside while? and move "remove" to bottom (= before while is checked)
			Node<Integer> node = next.remove(); // returns first element and removes it
			visited.add(node.getValue());	// add element to linkedlist

			if (node.getLeft() != null){
				next.add(node.getLeft());
			}
			if (node.getRight() != null){
				next.add(node.getRight());
			}
		}

		return visited;

	}

	/**
	 * Liefert Knoten des Baums ausgehend von Start in Reihenfolge der Breitensuche zur�ck,
	 * allerdings nur jene Knoten, die in der angegebenen Ebene liegen (Start hat Ebene=1)
	 * @param start Startknoten f�r Teilbaum
	 * @param level Nur Knoten dieser Ebene ausgeben
	 * @return Liste aller Knoten
	 */
	public List<Integer> getBreadthFirstOrderForLevel(Node<Integer> start, int level) {

		return null;
	}

}
