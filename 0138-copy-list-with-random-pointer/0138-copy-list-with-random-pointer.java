/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        Node copyHead = (current != null) ? new Node(current.val) : null;
        Node copyCurrent = copyHead;
        Map<Node, Node> hash = new HashMap();
        while(current != null)
        {
            hash.put(current, copyCurrent);
            copyCurrent.random = current.random;
            copyCurrent.next = (current.next != null) ? new Node(current.next.val) : null;
            current = current.next;
            copyCurrent = copyCurrent.next;
        }
        copyCurrent = copyHead;
        while(copyCurrent != null)
        {
            copyCurrent.random = hash.get(copyCurrent.random);
            copyCurrent = copyCurrent.next;
        }
        return copyHead;
    }
}