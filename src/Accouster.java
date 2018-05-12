import java.util.Scanner;

public class Accouster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to get the no of elements in the note seqeunce
        int n = sc.nextInt();
        String [] noteSequence = new String[n];
        for(int i =0;i<n;i++){
            noteSequence[i] = sc.next();
        }
        getScale(noteSequence);


    }
    public static ScaleDescriptor getScale(String[] composition) {
        String notes[] = new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        int w = 2;
        int h =1;
        return null;

//see which of the scale type contains all the notes of composition
// return a scale descriptor or null in case composition doesnt match any scale
    }
}

class ScaleDescriptor{
        String rootNote; // can be any value among notesArray
        String type; // can be either minor, major 
        }
