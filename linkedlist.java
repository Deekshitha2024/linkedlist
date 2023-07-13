class Node{
    public Object item;
    public Node next;
    public Node current;
    //pointing to next node
}
public class linkedlist {
    private int size;
    private Node head;
   // public Node current;

   public linkedlist(){
        this.size=0;
        this.head= null;   
   }
   public void insertingnode(String i){
    //public Node current;
    Node node= new Node();
    node.item= i;
    Node current=this.head;
    if (this.head==null){
        this.head=node;
        this.head.next= null;
        this.size=1;
        System.out.println(this.head.toString());
    }else{
        while(current.next!=null){
            current=current.next;
        }
       current.next=node;
        node.next=null;
        this.size+=1;
    }
   }
   public void addAtStarting(String i) {
    Node n = new Node();
    n.item = i;
    n.next = this.head;
    this.head = n;
}
public void addAtMiddle(String i,int pos)
	{
		Node node=new Node();
		Node current=this.head;
		if(this.head!=null && pos<=this.size)
		{
			for(int j=0;j<pos;j++) {
				current=current.next;
			}
			node.item=i;
			node.next=current.next;
			current.next=node;
			this.size+=1;
		}
		else
		{
			System.out.println("position is greater than size");
		}
	}
    public void deleteAtStarting(){
        Node current=this.head.next;
        this.head=null;
        this.head=current;
        this.size-=1;
        

     }
     public void deleteAtMidddele(int pos){
        Node current=this.head;
        if(this.head!=null && pos<=this.size){
            for(int j=0;j<pos-1;j++){
                current=current.next;
                

            }
            Node d=current.next;
            current.next=current.next.next;
            d.next=null;
     }
    

     }
    public void deleteAtEnd(){
        Node current=this.head;
        while(current.next.next!=null){
            current=current.next;

        }
        current.next=null;
        this.size-=1;
     }
     public void find(int value){
        Node current=this.head;
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(current.item.equals(value)){
                flag=true;
                System.out.println("Element present at index"+i);
                break;
            }
            current=current.next;

        }
        if(!flag){
            System.out.println("Element not present in linkedlist");
        }

     }
     public void display(){
        Node current=this.head;
        for(int i=0;i<size;i++){
            System.out.println(current.item);
            current=current.next;
        }
     }
     public static void main(String[] args){
        linkedlist list=new linkedlist();
        list.insertingnode("deeksha");
        list.insertingnode("aruna");
        list.insertingnode("teju");
        list.display();
       // list.addAtStarting("manasa");
        //list.display();
        //list.deleteAtStarting();
        //list.display();
        list.deleteAtEnd();
        list.display();


     }

}
