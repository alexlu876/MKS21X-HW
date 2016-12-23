public class Sorts{
    



    
    public static String name(){
	return "10.Lu.Alexander"; 
    }

    public static void selectionSort(int[] data){
	for(int i = 0; i < data.length - 1; i++){
	    int a = data[i];
	    int b = i;
	    for(int k = i + 1; k < data.length; k++){
		if(a > data[k]){
		    a = data[k];
		    b = k;
		}
	    }
	    int c = data[i];
	    data[i] = data[b];
	    data[b] = c;
	}
    }

    public static void insertionSort(int[] data){
	for(int i = 1; i < data.length; i++){
	    int b = data[i];
	    int k;
	    for(k = i - 1; k >= 0; k--){
		if(data[k] > data[k+1]){
		    data[k+1] = data[k];
		}
	    }
	    data[k] = b;
	}
    }

    public static void bubbleSort(int[] data){
	for(int i = 0; i < data.length; i++){
	    int p = 0;
	    for(int k = 0; k < data.length - i - 1; k++){
		if(data[k] > data[k+1]){
		    int t = data[k+1];
		    data[k+1] = data[k];
		    data[k] = t;
		    p++;
		}
	    }
	    if(p == 0){
		i = data.length;
	    }
	}
    }

    private static void printArray(int[] data){
	String a = "";
	for(int i = 0; i < data.length; i++){
	    a += data[i] + " ";
	}
	System.out.println('[' + a + ']');
    }

    //System.currentTimeMillis
    private static int[] arrayGen(int key){
	int[] data = new int[key];
	for(int i = 0; i < key; i++){
	    data[i] = (int)(Math.random() * 100000);
	}
	return data;
    }

    public static void main(String[] ARGS){
	if(ARGS.length != 2){
	    System.out.println("Length of Array, Type of Sort(0/Selection, 1/Insertion, 2/Bubble)");
	    return;
	}
	int[]work = arrayGen(Integer.parseInt(ARGS[0]));
	if(work.length < 21){
	    printArray(work);
	}
	int x = Integer.parseInt(ARGS[1]);
	long start;
	long end;
	start = System.currentTimeMillis();
	if(x == 0){
	    selectionSort(work);
	}
	if(x == 1){
	    insertionSort(work);
	}
	if(x == 2){
	    bubbleSort(work);
	}
	end = System.currentTimeMillis();
	if(work.length < 21){
	    printArray(work);
	}
	System.out.println((end - start) / 1000.0);
    
	
    }
	


     
}