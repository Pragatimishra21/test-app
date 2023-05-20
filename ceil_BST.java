class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        int ceil = -1;  // Initialize ceil as -1
        
        while (root != null) {
            if (root.data == key) {
                ceil = root.data;
                return ceil;
            }
            if (key > root.data) {
                root = root.right;
            }
            else {
                ceil = root.data;  // Update ceil if the current node value is greater than key
                root = root.left;
            }
        }
        
        return ceil;
    }
}

   
