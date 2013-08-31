/*
 Copyright 2010 Vivin Suresh Paliath
 Distributed under the BSD License
*/

package net.uglobal.collections.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GenericTree<T> {

	private GenericTreeNode<T> root;

	// Used internally by traversing all paths
	private final Stack<GenericTreeNode<T>> stack = new Stack<GenericTreeNode<T>>();

	public GenericTree() {
		super();
	}

	public GenericTreeNode<T> getRoot() {
		return this.root;
	}

	public void setRoot(GenericTreeNode<T> root) {
		this.root = root;
	}

	public int getNumberOfNodes() {
		int numberOfNodes = 0;

		if (root != null) {
			numberOfNodes = auxiliaryGetNumberOfNodes(root) + 1; //1 for the root!
		}

		return numberOfNodes;
	}

	private int auxiliaryGetNumberOfNodes(GenericTreeNode<T> node) {
		int numberOfNodes = node.getNumberOfChildren();

		for (GenericTreeNode<T> child : node.getChildren()) {
			numberOfNodes += auxiliaryGetNumberOfNodes(child);
		}

		return numberOfNodes;
	}

	public boolean exists(T dataToFind) {
		return (find(dataToFind) != null);
	}

	public GenericTreeNode<T> find(T dataToFind) {
		GenericTreeNode<T> returnNode = null;

		if (root != null) {
			returnNode = auxiliaryFind(root, dataToFind);
		}

		return returnNode;
	}

	private GenericTreeNode<T> auxiliaryFind(GenericTreeNode<T> currentNode, T dataToFind) {
		GenericTreeNode<T> returnNode = null;
		int i = 0;

		if (currentNode.getData().equals(dataToFind)) {
			returnNode = currentNode;
		}

		else if (currentNode.hasChildren()) {
			i = 0;
			while (returnNode == null && i < currentNode.getNumberOfChildren()) {
				returnNode = auxiliaryFind(currentNode.getChildAt(i), dataToFind);
				i++;
			}
		}

		return returnNode;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public List<GenericTreeNode<T>> build(GenericTreeTraversalOrderEnum traversalOrder) {
		List<GenericTreeNode<T>> returnList = null;

		if (root != null) {
			returnList = build(root, traversalOrder);
		}

		return returnList;
	}

	public List<GenericTreeNode<T>> build(GenericTreeNode<T> node,
			GenericTreeTraversalOrderEnum traversalOrder) {
		List<GenericTreeNode<T>> traversalResult = new ArrayList<GenericTreeNode<T>>();

		if (traversalOrder == GenericTreeTraversalOrderEnum.PRE_ORDER) {
			buildPreOrder(node, traversalResult);
		}

		else if (traversalOrder == GenericTreeTraversalOrderEnum.POST_ORDER) {
			buildPostOrder(node, traversalResult);
		}

		return traversalResult;
	}

	private void buildPreOrder(GenericTreeNode<T> node, List<GenericTreeNode<T>> traversalResult) {
		traversalResult.add(node);

		for (GenericTreeNode<T> child : node.getChildren()) {
			buildPreOrder(child, traversalResult);
		}
	}

	private void buildPostOrder(GenericTreeNode<T> node, List<GenericTreeNode<T>> traversalResult) {
		for (GenericTreeNode<T> child : node.getChildren()) {
			buildPostOrder(child, traversalResult);
		}

		traversalResult.add(node);
	}

	public Map<GenericTreeNode<T>, Integer> buildWithDepth(GenericTreeTraversalOrderEnum traversalOrder) {
		Map<GenericTreeNode<T>, Integer> returnMap = null;

		if (root != null) {
			returnMap = buildWithDepth(root, traversalOrder);
		}

		return returnMap;
	}

	public Map<GenericTreeNode<T>, Integer> buildWithDepth(GenericTreeNode<T> node,
			GenericTreeTraversalOrderEnum traversalOrder) {
		Map<GenericTreeNode<T>, Integer> traversalResult = new LinkedHashMap<GenericTreeNode<T>, Integer>();

		if (traversalOrder == GenericTreeTraversalOrderEnum.PRE_ORDER) {
			buildPreOrderWithDepth(node, traversalResult, 0);
		}

		else if (traversalOrder == GenericTreeTraversalOrderEnum.POST_ORDER) {
			buildPostOrderWithDepth(node, traversalResult, 0);
		}

		return traversalResult;
	}

	private void buildPreOrderWithDepth(GenericTreeNode<T> node,
			Map<GenericTreeNode<T>, Integer> traversalResult, int depth) {
		traversalResult.put(node, depth);

		for (GenericTreeNode<T> child : node.getChildren()) {
			buildPreOrderWithDepth(child, traversalResult, depth + 1);
		}
	}

	private void buildPostOrderWithDepth(GenericTreeNode<T> node,
			Map<GenericTreeNode<T>, Integer> traversalResult, int depth) {
		for (GenericTreeNode<T> child : node.getChildren()) {
			buildPostOrderWithDepth(child, traversalResult, depth + 1);
		}

		traversalResult.put(node, depth);
	}

	public String toString() {
		/*
		We're going to assume a pre-order traversal by default
		 */

		String stringRepresentation = "";

		if (root != null) {
			stringRepresentation = build(GenericTreeTraversalOrderEnum.PRE_ORDER).toString();

		}

		return stringRepresentation;
	}

	public String toStringWithDepth() {
		/*
		We're going to assume a pre-order traversal by default
		 */

		String stringRepresentation = "";

		if (root != null) {
			stringRepresentation = buildWithDepth(GenericTreeTraversalOrderEnum.PRE_ORDER).toString();
		}

		return stringRepresentation;
	}

	/**
	 * Construct all paths in tree.
	 *
	 * @param node Node to start from.
	 * @param list Result list containing a list of paths. A paths consists of
	 *             a list of nodes.
	 */
	public void allPathsTraversal(GenericTreeNode<T> node, List<List<GenericTreeNode<T>>> list) {
		stack.push(node);
		if (!isLeaf(node)) {
			for (GenericTreeNode<T> child : node.getChildren()) {
				allPathsTraversal(child, list);
			}
		}

		if (isLeaf(node)) {
			List<GenericTreeNode<T>> path = new ArrayList<GenericTreeNode<T>>();
			for (GenericTreeNode<T> aNode : stack) {
				path.add(aNode);
			}
			list.add(path);
		}
		stack.pop();
	}

	/**
	 * Is this node a leaf node?
	 *
	 * @param node Node to examine.
	 * @return true if this node is a leaf node.
	 */
	private boolean isLeaf(GenericTreeNode<T> node) {
		return node.getChildren().size() == 0;
	}

}