class MyLinkedList {
    Node head=null;
    Node tail=null;
    int i=0;
    class Node{
        int  data;
        Node next;
        Node(int d){
            data=d;
            this.next=next;
        }
       
    }
    public MyLinkedList() {
        
    }
    private Node getNodeAtIndex(int index) {
        if(index < 0 || index >= i)
            return null;

        Node temp = head;
        for(int k=0; k<index; k++){
            temp = temp.next;
        }
        return temp;
    }
    
    public int get(int index) {
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(i==index){
                return temp.data;
            }
            i++;
            temp=temp.next;

        }
        return -1;
    }
    
    
    public void addAtHead(int val) {
        Node n=new Node(val);
        n.next=head;
        head=n;
        if(i==0){
            tail=head;
        }
        i++;
        
    }
    
    public void addAtTail(int val) {
        if(i==0){
            addAtHead(val);
        }
        else{
            Node n=new Node(val);
            tail.next=n;
            tail=n;
            i++;
        }
         
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index > i ){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == i){
            addAtTail(val);
        }
        else{
            Node n=new Node(val);
            Node prev=getNodeAtIndex(index-1);
            n.next=prev.next;
            prev.next=n;
            i++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=i){
            return;
        }
        else if(index==0){
            head=head.next;

        }
        else if(index==i-1){
            Node prev=getNodeAtIndex(index-1);
            prev.next=null;
            tail=prev;
        }
         else {
            Node previousNode = getNodeAtIndex(index-1);
            previousNode.next = previousNode.next.next;
        }
        i--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */