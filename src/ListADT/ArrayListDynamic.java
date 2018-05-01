package ListADT;

/**
 * @author : codedsun
 * Created on 01/May/2018
 */


public class ArrayListDynamic<E> implements List<E>{

    private static int CAPACITY = 1;
    int SIZE = 0 ;
    E data[];

    ArrayListDynamic(){
        data = (E[]) new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return SIZE ==0;
    }

    @Override
    public int getSize() {
        return SIZE;
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException{
        E element = null;
        if(checkIndex(i)){
            element = data[i];
            data[i] = e;
        }

        return element;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        E element;
        if(checkIndex(index)){
            return data[index];
        }
        else
            throw new IndexOutOfBoundsException("Out of Size");
    }

    @Override
    public void add(int i, E e) {

        if(i == SIZE){
            resize();
        }
        if(checkIndex(i)){

                for(int j = SIZE-1 ;j>=i;j--){
                    data[j] = data[j-1];
                }
                data[i] = e;

            SIZE++;
        }

    }

    public void resize(){
        E temp[] = (E[]) new Object[2*CAPACITY];
        for(int i=0;i<SIZE;i++){
            temp[i] = data[i];
        }
        data = temp;

    }

    @Override
    public E remove(int i) {
        E element;
        if(checkIndex(i)){
            element = data[i];
            for(int j = i; j<SIZE;j++){
                data[j] = data[j+1];
            }
            SIZE--;
            return element;
        }
        else
        {
            throw new IndexOutOfBoundsException("Out of Bounds");
        }
    }

    public boolean checkIndex (int i){
        if(i>=0 && i<=SIZE){
            return true;
        }
        else
            throw new IndexOutOfBoundsException("Out of Size");
    }
}


class Test1{
    public static void main(String[] args) {
        ArrayListDynamic<Integer> arrayList = new ArrayListDynamic<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        System.out.println(  arrayList.get(1));

    }

}