package hdt8;

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{

	protected Vector<E> data; // the data, kept in heap order

	public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}

	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
		return (i-1)/2;
	}

	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}

	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return (2*i+1) + 1;
	}

	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

	public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
            if (data.isEmpty())
		data.add(value);
            else{
                boolean padreMenor=true;
    		data.add(value);
                while(padreMenor){
                int posicionValue=data.indexOf(value);
                int posicionPadre;
                if ((posicionValue%2)==0){
                        posicionPadre=(posicionValue/2)-1;
                    }else{
                        posicionPadre=((posicionValue-1)/2);
                    }
                    if(posicionPadre>=0){
                        if (value.compareTo(data.get(posicionPadre))<0){
                            intercambiar(posicionValue,posicionPadre);
                            posicionValue=posicionPadre;
                        }else{
                            padreMenor=false;
                        }
                    }else{
                        padreMenor=false;
                    }
                }
            }
	}

	protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

	public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

    @Override
    public E getFirst() {
        return data.get(0);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }   
    
    public void intercambiar(int posicionOriginal,int posicionFinal){
        E provisional=data.get(posicionFinal);
        data.removeElementAt(posicionFinal);
        data.insertElementAt(data.get(posicionOriginal-1), posicionFinal);
        data.removeElementAt(posicionOriginal);
        data.insertElementAt(provisional, posicionOriginal);
    }
    public String toString(){
        String cadena="";
        for(int i=0;i<data.size();i++){
            cadena=cadena+data.get(i).toString()+"\n";
        }
        return cadena;
    }
}
