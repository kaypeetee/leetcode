```python3 []
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        frontier = [(root, 1)]  # Queue to hold nodes along with their depth
        max_depth = 0

        while frontier:
            node, depth = frontier.pop(0)  # Dequeue the next node and its depth
            max_depth = max(max_depth, depth)  # Update the maximum depth

            # Add children to the queue with incremented depth
            if node.left:
                frontier.append((node.left, depth + 1))
            if node.right:
                frontier.append((node.right, depth + 1))

        return max_depth
```
