package ankita.java_incremental6;

class SList<T> {
    Link head;
    private class Link {


        private T data;
        private Link next;
        Link(T data)
        {
            this.data=data;
            next=null;
        }


    }
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
        if (prev == curr) {
            throw new Exception("no element at current position");
        }
        if (prev == head) {
            head = prev.next;
            prev = head;
        } else {
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


    SList(T data) {
      head=new Link(data);
    }

    SList() {
//empty list
    }


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



