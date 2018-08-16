package csku.datastrucrures;

public class ArrayCollection implements Collection {
    private Object[] objs;
    private int size;


    public ArrayCollection(int c){
        this.objs = new Object[c];
        this.size = 0;
        
    }
    public void add(Object element) {
        if (element == null){
            throw new IllegalArgumentException();
        }
        this.objs[size++] = element;

    }

    public void remove(Object element) {
        
        int i = indexOf(element);
        if (i != -1){
            this.objs[i] = this.objs[--i];
            this.objs[size] = null;
            
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object element) {
        return indexOf(element) != -1; 
    }

    public int size() {
        return size;
    }

    private int indexOf(Object element){
        
      for (int i =0 ;i<size;i++){
          if(this.objs[i].equals(element)) return i;
      }
      return -1; 
    }
}
