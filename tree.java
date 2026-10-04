class TreeNode:
    """Represents an individual node inside the BST."""
    def __init__(self, key):
        self.val = key
        self.left = None
        self.right = None

class BinarySearchTree:
    """Manages BST operations like insertion, searching, and traversal."""
    def __init__(self):
        self.root = None

    def insert(self, key):
        """Public method to insert a new key into the BST."""
        self.root = self._insert_recursive(self.root, key)

    def _insert_recursive(self, root, key):
        # If the tree/subtree is empty, return a new node
        if root is None:
            return TreeNode(key)

        # Otherwise, recur down the tree
        if key < root.val:
            root.left = self._insert_recursive(root.left, key)
        elif key > root.val:
            root.right = self._insert_recursive(root.right, key)
        
        # Return the unchanged node pointer
        return root

    def search(self, key):
        """Public method to search for a key. Returns True if found, False otherwise."""
        return self._search_recursive(self.root, key)

    def _search_recursive(self, root, key):
        # Base Cases: root is null or key is present at root
        if root is None:
            return False
        if root.val == key:
            return True

        # Key is smaller than root's key
        if key < root.val:
            return self._search_recursive(root.left, key)

        # Key is greater than root's key
        return self._search_recursive(root.right, key)

    def inorder_traversal(self):
        """Public method to print the BST elements in sorted order."""
        result = []
        self._inorder_recursive(self.root, result)
        return result

    def _inorder_recursive(self, root, result):
        if root:
            self._inorder_recursive(root.left, result)
            result.append(root.val)
            self._inorder_recursive(root.right, result)


# --- Driver Code to Test the BST ---
if __name__ == "__main__":
    bst = BinarySearchTree()

    # 1. Insert elements
    # Elements will build a balanced tree structure rooted around 50
    elements = [50, 30, 20, 40, 70, 60, 80]
    for el in elements:
        bst.insert(el)

    # 2. Print In-Order Traversal (Should print numbers sorted in ascending order)
    print("In-order Traversal (Sorted):", bst.inorder_traversal())

    # 3. Search for keys
    search_keys = [40, 90]
    for key in search_keys:
        if bst.search(key):
            print(f"Key {key} found in the BST!")
        else:
            print(f"Key {key} NOT found in the BST.")
