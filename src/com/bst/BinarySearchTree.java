package com.bst;

public class BinarySearchTree {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}

	}

	Node root;

	public BinarySearchTree() {
		root=null;
	}

	void insert(int value) {
		root = insertNode(root, value);
	}

	private Node insertNode(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.data) {
			root.left = insertNode(root.left, value);
		} else {
			root.right = insertNode(root.right, value);
		}
		return root;
	}

	void inorder() {
		inorderTrav(root);
	}

	private void inorderTrav(Node root) {
		if (null != root) {
			inorderTrav(root.left);
			System.out.println(root.data);
			inorderTrav(root.right);
		}

	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inorder();
	}

}
