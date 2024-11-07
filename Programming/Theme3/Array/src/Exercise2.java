import java.util.Random;

public class Exercise2 {

    //PROPERTIES
    private int[] classStudent;

    //CONSTRUCTOR
    public Exercise2(){
        classStudent = new int[10];
        saveStudents();
    }

    //GETTER amd SETTER
    public int[] getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(int[] classStudent) {
        this.classStudent = classStudent;
    }

    //Method to save students in the Array
    public void saveStudents(){
       //We instance a Random object to can generate aleatory numbers
        Random age = new Random();

        //Then we save those number in our Array and then work with it
        for (int i = 0; i < this.classStudent.length; i++){
            classStudent[i] = age.nextInt(130);
        }
    }



    //Method to calculate the media of all age of the students
   public int mediaAge(){
        int result = 0;

       for (int i = 0; i < classStudent.length; i++){
           result += classStudent[i];
       }
       return result/classStudent.length;
   }

   //Method to calculate the media age more high
    public int [] mediaHighAge(){
        int[] highAge = this.classStudent;

        for (int i=0; i < classStudent.length; i++){
            if (classStudent[i] > mediaAge()){
                highAge[i] = classStudent[i];
            }
        }

        return highAge;
    }

    //Method to calculate the media age more high
    public int [] mediaLessAge(){
        int[] lessAge = this.classStudent;

        for (int i=0; i < classStudent.length; i++){
            if (classStudent[i] < mediaAge()){
                lessAge[i] = classStudent[i];
            }
        }

        return lessAge;
    }


    //Method to calculate the max age
    public int maxAge(){
        int maxAge = 0;

        for (int i=0; i < classStudent.length; i++){

            maxAge = classStudent[i];

            if (maxAge < classStudent[i]){
                maxAge = classStudent[i];
            }

        }

        return maxAge;
    }

    //Method to calculate the max age
    public int minAge(){
        int minAge = 0;

        for (int i=0; i < classStudent.length; i++){

            minAge = classStudent[i];

            if (minAge > classStudent[i]){
                minAge = classStudent[i];
            }

        }

        return minAge;
    }

}
