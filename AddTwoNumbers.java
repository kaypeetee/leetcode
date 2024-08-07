/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        boolean addTen = false;
        ListNode currentNode = dummy;
       

        while(l1!= null && l2!=null){
           ListNode l3= new ListNode(0);
            if(addTen){
                l3.val = (l1.val+l2.val+1)%10;
            } else{
                l3.val = (l1.val+l2.val)%10;
            }

            
            if(addTen){
                if((l1.val+l2.val+1)>=10){
                    addTen=true;
                }else{
                    addTen = false;
                }
            } else{
                if((l1.val+l2.val)>=10){
                    addTen=true;
                }else{
                    addTen = false;
                }
            }
            currentNode.next= l3;
            currentNode=currentNode.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null){
            ListNode l3= new ListNode(0);
            if(addTen){
                l3.val = (l1.val+1)%10 ;
            } else{
                l3.val = (l1.val)%10;
            }

            
            if(addTen&&((l1.val+1)>=10) ){
                    addTen=true;
            } else{
                addTen = false;
            }
            currentNode.next= l3;
            currentNode=currentNode.next;
            l1=l1.next;
        }
        while(l2 != null){
            ListNode l3= new ListNode(0);
            if(addTen){
                l3.val = (l2.val+1)%10;
            } else{
                l3.val = (l2.val)%10;
            }

            
            if(addTen&&((l2.val+1)>=10) ){
                    addTen=true;
            } else{
                addTen = false;
            }
            currentNode.next= l3;
            currentNode=currentNode.next;
            l2=l2.next;
        }

        if(addTen){
            ListNode l3= new ListNode(1);

            currentNode.next=l3;
        }
        
        ListNode head = dummy.next;
        return head;
    }
}
