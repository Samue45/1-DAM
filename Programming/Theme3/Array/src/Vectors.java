
public class Vectors {

    //Method to calculate the media note
    public static float mediaNotes(float notes[]){
        float sum = 0;

        for (float note : notes) {
            sum += note;
        }
        return  sum / notes.length;
    }

    //Method to look the notes
    public static StringBuilder lookAllNotes(float[] notes){
        StringBuilder allNotes = new StringBuilder();

        for (float note : notes){
            allNotes.append(note).append("/");
        }
        return allNotes;
    }
}
