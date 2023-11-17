package Sorting;


class SelectionSort{
	private long [] data;
	private int jumItem;
	
	public SelectionSort(int max){
		data = new long[max];
		jumItem = 0;
	}
	
	public void tambah(long nilai){
		data[jumItem] = nilai;
		jumItem++;
	}
	
	public void cetak(){
		for (int j=0; j<jumItem; j++)
		System.out.print(data[j] + " ");
		System.out.println(" ");
	}
	
	public void selection_sort(){
		int i,j,pos;
		for(i=0;i<jumItem-1;i++){
		 pos = i;
		
		 for(j=i+1;j<jumItem;j++){
			 if(data[j] < data[pos])
			 pos = j;
		 }
		 if(pos != i)
		 tukar(pos,i);
		
		 System.out.print("Hasil langkah ke " +(i+1)+ " :");
		 cetak();
		 System.out.println();
		}
	}
	
	private void tukar(int a, int b){
		long temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
}

class SortingSelectionSort{
	public static void main(String[] args){
		int ukuran = 100;
		SelectionSort DeretAngka;
		DeretAngka = new SelectionSort(ukuran);
		DeretAngka.tambah(22);
		DeretAngka.tambah(2);
		DeretAngka.tambah(90);
		DeretAngka.tambah(25);
		DeretAngka.tambah(20);
		DeretAngka.tambah(30);
        DeretAngka.tambah(6);
        DeretAngka.tambah(3);
		System.out.print("Data awal : ");
		DeretAngka.cetak();
		System.out.println();
		DeretAngka.selection_sort();
		System.out.print("Data akhir : ");
		DeretAngka.cetak();
		System.out.println();
	}
}
