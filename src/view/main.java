package view;

import br.com.KauanPaulino.ListaInt.Lista_Int;
import www.kauanpaulino.QuickSort.QuickSort;

public class main {

	public static void main(String[] args) {
		Lista_Int l = new Lista_Int();
		QuickSort q = new QuickSort();
		
		l.addFirst(10);
		try {
			l.addLast(5);
			l.addLast(8);
			l.addLast(1);
			l.addLast(9);
			l.addLast(2);
			l.addLast(4);
			l.addLast(7);
			l.addLast(3);
			l.addLast(6);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ordernaçao
		int tamanho = l.size();
		int vt[] = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			try {
				vt[i]=l.get(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		vt=q.quicksort(vt, 0, tamanho-1);
		for (int valor:vt){
			System.out.print(valor+" ");
		}
	}

}
