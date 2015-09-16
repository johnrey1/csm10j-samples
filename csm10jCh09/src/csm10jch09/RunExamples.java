/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jch09;

/**
 *
 * @author johnr
 */
public class RunExamples {



    // Show that an array is mutable
    // The value of the array at the specified index when returning 
    // to the calling method, has been updated to newvalue
    public static void ArrayMutable(int[] arr, int index, int newValue) {
        arr[index] = newValue;
    }

    public static void RunArrayMutable() {
        System.out.println("RunArrayMutable");
        // Demonstrate array mutability
        int[] arrMutable = {0, 0, 0};
        ArrayMutable(arrMutable, 1, 42);
        // Is the output 0 or 42?
        // why is the different than how a string behaves
        System.out.println("arrMutable[1] = " + arrMutable[1]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InitializeArray.OneDimDeclared();
        InitializeArray.OneDimBraces();
        InitializeArray.OneDimExpression();
        InitializeArray.OneDimUserInput();
        InitializeArray.OneDimRefType();
        
        // what impact does array boundaries have
        // when you're accepting user input to index or size arrays
//        IndexingArray.OutOfBoundsInt();
//        IndexingArray.OutOfBoundsLength();
//        IndexingArray.OutOfBoundsNegative();
        RunArrayMutable();

        ArrayCopy.ShallowCopy();
        ArrayCopy.DeepCopy();
        ArrayCopy.CompareReferences();
        ArrayCopy.CompareValues();

        ArraySearch.SearchFound();
        ArraySearch.SearchNotFound();
        
        NDim.TwoDimInit();
        NDim.TwoDimRagged();
        
    }

}
