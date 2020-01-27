package aufgaben;

public class Bubblesort {  
    static void bubbleSort(int[] array) {  
        int n = array.length;  
        int temporary = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(array[j-1] > array[j]){  
                                  
                                 temporary = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temporary;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int array[] ={3,60,35,2,45,320,5}; 
                
                 
                
                for(int i=0; i < array.length-1; i++){  
                      
                }  
                
                  
                bubbleSort(array);
                 
                
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");  
                }  
   
        }  
}  
	
