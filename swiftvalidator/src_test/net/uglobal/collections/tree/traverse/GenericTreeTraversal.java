package net.uglobal.collections.tree.traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import net.uglobal.collections.tree.GenericTreeNode;

/**
 * Three ways to traverse a tree in Java 5.
 * The tree nodes may have zero or more children.
 * The traversals may be initiated from any node.
 *
 */
public class GenericTreeTraversal {

	/**
	 * A sample tree demonstrating the three algorithms.
	 * The tree that is built here is the same as used in the post.
	 *
	 * @param args Not used here.
	 */
	public static void main(String[] args) {
		GenericTreeNode<String> node0 = new GenericTreeNode<String>("0");
		GenericTreeNode<String> node1 = new GenericTreeNode<String>("1");
		GenericTreeNode<String> node2 = new GenericTreeNode<String>("2");
		GenericTreeNode<String> node3 = new GenericTreeNode<String>("3");
		GenericTreeNode<String> node4 = new GenericTreeNode<String>("4");
		GenericTreeNode<String> node5 = new GenericTreeNode<String>("5");
		GenericTreeNode<String> node6 = new GenericTreeNode<String>("6");
		GenericTreeNode<String> node7 = new GenericTreeNode<String>("7");

		node0.addChild(node1);
		node0.addChild(node2);

		node2.addChild(node3);
		node2.addChild(node4);
		node2.addChild(node5);

		node3.addChild(node6);
		node3.addChild(node7);

		//		GenericTreeNode<String>[] nodes = new GenericTreeNode[8];
		//		for (int i = 0; i < 8; i++) {
		//			nodes[i] = new GenericTreeNode("Node " + i);
		//		}
		//
		//		List<GenericTreeNode> list = new ArrayList<GenericTreeNode>();
		//		list.add(nodes[1]);
		//		list.add(nodes[2]);
		//		
		//		nodes[0].setChildren(list);
		//
		//		list = new ArrayList<GenericTreeNode>();
		//		list.add(nodes[3]);
		//		list.add(nodes[4]);
		//		list.add(nodes[5]);
		//		nodes[2].setChildren(list);
		//
		//		list = new ArrayList<GenericTreeNode>();
		//		list.add(nodes[6]);
		//		list.add(nodes[7]);
		//		nodes[3].setChildren(list);

		// Show all paths in the tree
		List<List<GenericTreeNode<String>>> result = new ArrayList<List<GenericTreeNode<String>>>();
		allPathsTraversal(node0, result);

		for (List<GenericTreeNode<String>> list : result) {
			System.out.println(list);
		}

		System.out.println("All paths: " + result);
		// Show the nodes in breadth first order
		System.out.println("Breadth first: " + breadthFirstTraversal(node0));
		// Show the nodes in depth first order
		System.out.println("Depth first: " + depthFirstTraversal(node0));
	}

	/**
	 * Is this node a leaf node?
	 *
	 * @param node Node to examine.
	 * @return true if this node is a leaf node.
	 */
	private static boolean isLeaf(GenericTreeNode<String> node) {
		return node.getChildren().size() == 0;
	}

	/**
	 * Traverse tree by using a depth first traversal.
	 *
	 * @param node Node to start from.
	 * @return A list of all nodes that have been traversed.
	 */
	public static List<GenericTreeNode<String>> depthFirstTraversal(GenericTreeNode<String> node) {
		return depthFirstTraversal(new ArrayList<GenericTreeNode<String>>(), node);
	}

	private static List<GenericTreeNode<String>> depthFirstTraversal(List<GenericTreeNode<String>> list,
			GenericTreeNode<String> node) {
		if (!isLeaf(node)) {
			for (GenericTreeNode<String> child : node.getChildren()) {
				depthFirstTraversal(list, child);
			}
		}
		list.add(node);
		return list;
	}

	private static Stack<GenericTreeNode<String>> stack = new Stack<GenericTreeNode<String>>();

	/**
	 * Construct all paths in tree.
	 *
	 * @param node Node to start from.
	 * @param list Result list containing a list of paths. A paths consists of
	 *             a list of nodes.
	 */
	public static void allPathsTraversal(GenericTreeNode<String> node,
			List<List<GenericTreeNode<String>>> list) {
		stack.push(node);
		if (!isLeaf(node)) {
			for (GenericTreeNode<String> child : node.getChildren()) {
				allPathsTraversal(child, list);
			}
		}

		if (isLeaf(node)) {
			List<GenericTreeNode<String>> path = new ArrayList<GenericTreeNode<String>>();
			for (GenericTreeNode<String> aNode : stack) {
				path.add(aNode);
			}
			list.add(path);
		}
		stack.pop();
	}

	private static Queue<GenericTreeNode<String>> queue = new Queue<GenericTreeNode<String>>();

	/**
	 * Traverse tree by using a breadth first traversal.
	 *
	 * @param node Node to start from.
	 * @return A list of all nodes that have been traversed.
	 */
	public static List<GenericTreeNode<String>> breadthFirstTraversal(GenericTreeNode<String> node) {
		List<GenericTreeNode<String>> resultList = new ArrayList<GenericTreeNode<String>>();
		queue.enqueue(node);
		resultList.add(node);
		return breadthFirstTraversal(resultList);
	}

	private static List<GenericTreeNode<String>> breadthFirstTraversal(
			List<GenericTreeNode<String>> resultList) {
		while (!queue.empty()) {
			GenericTreeNode<String> node = queue.dequeue();

			for (GenericTreeNode<String> child : node.getChildren()) {
				queue.enqueue(child);
				resultList.add(child);
			}
		}
		return resultList;
	}
}