public class Exercise4 {

    /*
    * 1º Create methods (public boolean isEqualBySize(parameter Array){},
    * public boolean isEqualByReference(parameter Array){},
    * public boolean isEqualByType(parameter Array){} )
    *
    * public boolean isEqualBySize(parameter Array){}
    * 2º Create a boolean variable = false
    * 2.1º Use a buckle for and set a condition if(size1 == size2){ true}
    * 2.2º Return variable
    *
    * public boolean isEqualByReference(parameter Array){}
     * 2º Create a boolean variable = false
     * 2.1º Use a buckle for and set a condition if(Array1 == Array2){ true}
     * 2.2º Return variable
    *
    *public boolean isEqualByType(parameter Array){}
     * 2º Create a boolean variable = false
     * 2.1º Use a buckle for and set a condition if(Array1 === Array2){ true}
     * 2.2º Return variable
    * */

    public boolean isEqualByReference(int[] Array1, int[] Array2){
        return Array1 == Array2;
    }

    public boolean isEqualBySize(int[] Array1, int[] Array2){
        return Array1.length == Array2.length;
    }

    public String isEqualByType(int[] Array1, int[] Array2){
        String message= "";

        if (!isEqualBySize(Array1,Array2)) message=  "ERROR: They don't have the same size";

        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] == Array2[i]){
                message = "Both Arrays have the same type of data";
            }else {
                message = "The Arrays are different";
            }
        }

        return message;
    }

}
