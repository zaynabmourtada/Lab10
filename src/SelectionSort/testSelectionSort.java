package SelectionSort;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
public testSelectionSort() {
}

public void writeToOutputFile(int[] sortedArray) 
{
	String fileName = "output.txt"; // Define the output file name
    try {
        FileWriter fileWriter = new FileWriter(fileName, true); // 'true' for appending to the file
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < sortedArray.length; i++) {
            bufferedWriter.write(String.valueOf(sortedArray[i]));
            bufferedWriter.newLine();
        }
        
        bufferedWriter.write("--------------------------------\n"); // Separator line
        bufferedWriter.newLine(); // Add a newline for better readability
        bufferedWriter.close();
        System.out.println("Output has been written to " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
	}
public void testPositive(){
int[] arr = new int[5];
arr[0] = 8;
arr[1] = 9;
arr[2] = 7;
arr[3] = 10;
arr[4] = 2;
int[] Sortedarr = new int[5];
Sortedarr[0] = 2;
Sortedarr[1] = 7;
Sortedarr[2] = 8;
Sortedarr[3] = 9;
Sortedarr[4] = 10;
SelectionSort ss = new SelectionSort();
int[] sortedArray = ss.basicSelectionSort(arr); 

writeToOutputFile(sortedArray);


}

public void testNegative(){
/** Test data contains negative values only **/
int[] arr = new int[5];
arr[0]= -4;
arr[1] = -2;
arr[2] = -7;
arr[3] = -1;
arr[4] = -9;
int[] Sortedarr = new int[5];
Sortedarr[0] = -9;
Sortedarr[1] = -7;
Sortedarr[2] = -4;
Sortedarr[3] = -2;
Sortedarr[4] = -1;
SelectionSort ss = new SelectionSort();
int[] sortedArray = ss.basicSelectionSort(arr); 

writeToOutputFile(sortedArray);


}
public void testMixed(){
int[] arr = new int[5];
arr[0] = -4;
arr[1] = 10;
arr[2] = 0;
arr[3] = -2;
arr[4] = 5;
int[] Sortedarr = new int[5];
Sortedarr[0] = -4;
Sortedarr[1] = -2;
Sortedarr[2] = 0;
Sortedarr[3] = 5;
Sortedarr[4] = 10;
SelectionSort ss = new SelectionSort();
int[] sortedArray = ss.basicSelectionSort(arr); 
writeToOutputFile(sortedArray);

}

public void testDuplicates(){
/** Test data contains duplicates **/
int[] arr = new int[5];
arr[0] = 1;
arr[1] = 5;
arr[2] = 4;
arr[3] = 1;
arr[4] = 4;
int[] Sortedarr = new int[5];
Sortedarr[0] = 1;
Sortedarr[1] = 1;
Sortedarr[2] = 4;
Sortedarr[3] = 4;
Sortedarr[4] = 5;
SelectionSort ss = new SelectionSort();
int[] sortedArray = ss.basicSelectionSort(arr);
writeToOutputFile(sortedArray);

}
}