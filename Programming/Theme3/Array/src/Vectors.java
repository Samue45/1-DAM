
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

    //Method to pass all notes
    public static StringBuilder passAllNotes(float[] notes){
        StringBuilder allNotes = new StringBuilder();

        for (int i= 0; i< notes.length; i++){
            if (notes[i] < 5){
                notes[i] = 5;
            }
            allNotes.append(notes[i]).append("/");
        }
        return allNotes;
    }
}
