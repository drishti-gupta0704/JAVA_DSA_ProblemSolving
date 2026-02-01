package linkedlist;

public class ReverseLinkedlist {


        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

        public static ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            return prev;
        }

        public static void main(String[] args) {
            // Create list: 1 -> 2 -> 3 -> 4 -> null
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            System.out.print("Original List: ");
            printList(head);

            head = reverseList(head);

            System.out.print("\nReversed List: ");
            printList(head);
        }

        static void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }


