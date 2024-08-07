class Solution {
    public void reorderList(ListNode head) {
        //get length
        int length = 0;
        ListNode lt= head;
        while(lt!= null){
            // System.out.println(lt.val);
            lt=lt.next;
            length++;
        }
        int i=0;
        ListNode currentNode = head;
        ListNode after= currentNode.next;
    
        while(i<length-1){
            
            if(i%2==0){
                ListNode tail = currentNode;
            //update tail
                for (int j=0; j<length-1-i; j++){
                    tail=tail.next;
                }
                currentNode.next = tail;
            } else{
                currentNode.next = after;
                after=after.next;
            }
            currentNode= currentNode.next;
            i++;
        }
        ListNode tailFixer = head;
        for (int k =0; k<length-1; k++){
            tailFixer=tailFixer.next;
        }
        tailFixer.next = null;
    }
}
