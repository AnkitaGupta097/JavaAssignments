package ankita.java_incremental6;



//genric class which create linklist
class SList<T> {

    //store head of linklist
  private   Link head;

  //private inner class that generate nodes
    private class Link {


        private T data;
        private Link next;
        Link(T data)
        {
            this.data=data;
            next=null;
        }


    }

    //Iterator class used to iterate through linked list
    class  SListIteratorImplementor implements SListIterator<T>{
private Link curr,prev;

SListIteratorImplementor()
{
    curr=head;
    prev=head;
}

        @Override
        public boolean hasNext() {
if(curr!=null)
{
    return true;
}
return false;
        }

        @Override
       public T next() {
    T data=curr.data;
    prev=curr;
    curr=curr.next;

    return data;

        }
        @Override
        public void insert(T data)
        {
Link newNode=new Link(data);

//inserting at starting
        if(prev==curr)
        {
            head=newNode;
            head.next=prev;
            prev=head;
            curr=head;
        }
        else {
            prev.next=newNode;
            newNode.next=curr;
            curr=newNode;

        }

        }

        @Override
        public void remove() {
    try {
        //before calling next() method first time exception occured
        if (prev == curr) {
            throw new Exception("no element at current position");
        }
        //removal of first node
        if (prev == head) {
            head = prev.next;
            prev = head;
        }

        else {
            Link st = head;
            while (st.next != prev) {
                st = st.next;
            }
            st.next = prev.next;
            prev = st;

        }
    }
catch (Exception e)
{
    System.out.println(e.getMessage());
}

        }
    }

//creade a node with constructor
    SList(T data) {
      head=new Link(data);
    }

    SList() {
//empty list
    }

//returning object of iterator class
    SListIterator iterator() {
       return new SListIteratorImplementor();


    }

    @Override
    public String toString() {
        Link node=head;
        String str;
        str="[ ";
        while (node!=null)
        {
            str+=node.data+" ";

        }
      str+="]";
        return str;
    }
}



