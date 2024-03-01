package ss10_LIST;

public class myList<E> {
    private int size = 0;
//    tao dung luong mac dinh
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[] ;

    public myList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public myList(int capacity) {
        elements = new Object[capacity];
    }

    public void add (int index , E element){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("error index: 'index < 0' or 'index > size' , size = "+size+" , index = "+index);
        }else {
            if(size == elements.length){

            }
        }
    }
}
