class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if not head or head.next is None or k == 0:
            return head
        
        # Step 1: Store all node values in a list
        values = []
        curr = head
        while curr:
            values.append(curr.val)
            curr = curr.next
        
        n = len(values)
        k = k % n
        if k == 0:
            return head
        
        # Step 2: Rotate the values array
        rotated = values[-k:] + values[:-k]
        
        # Step 3: Rebuild the linked list
        curr = head
        for val in rotated:
            curr.val = val
            curr = curr.next
        
        return head
