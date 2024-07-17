class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class SubtreeChecker {

    // Method to check if two trees are identical
    public boolean areIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.val == root2.val
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }

    // Method to check if the subtree is part of the main tree
    public boolean isSubtree(TreeNode mainTree, TreeNode subTree) {
        if (subTree == null) {
            return true;  // An empty tree is a subtree of any tree
        }
        if (mainTree == null) {
            return false;  // Non-empty subtree cannot be found in an empty tree
        }
        if (areIdentical(mainTree, subTree)) {
            return true;
        }
        return isSubtree(mainTree.left, subTree) || isSubtree(mainTree.right, subTree);
    }

    public static void main(String[] args) {
        // Create main tree
        TreeNode mainTree = new TreeNode(3);
        mainTree.left = new TreeNode(4);
        mainTree.right = new TreeNode(5);
        mainTree.left.left = new TreeNode(1);
        mainTree.left.right = new TreeNode(2);

        // Create subtree
        TreeNode subTree = new TreeNode(4);
        subTree.left = new TreeNode(1);
        subTree.right = new TreeNode(2);

        SubtreeChecker checker = new SubtreeChecker();
        System.out.println(checker.isSubtree(mainTree, subTree)); // Output should be true
    }
}

