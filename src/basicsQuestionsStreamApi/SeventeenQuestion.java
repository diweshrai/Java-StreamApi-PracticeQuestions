package basicsQuestionsStreamApi;

import java.util.ArrayList;
import java.util.List;

public class SeventeenQuestion {

//Question No:17. How to convert a List of objects into a Map by 
//				considering duplicated keys and store them in sorted order?
	
	
	public static void main(String[] args) {
		
		
		 
		
		List<Notes> noteLst = new ArrayList<>();
		
		noteLst.add(new Notes(1, "note1", 11));
	    noteLst.add(new Notes(2, "note2", 22));
	    noteLst.add(new Notes(3, "note3", 33));
	    noteLst.add(new Notes(4, "note4", 44));
	    noteLst.add(new Notes(5, "note5", 55));

	    noteLst.add(new Notes(6, "note4", 66));
		
	    
	    
	    System.out.println(noteLst);
	    
	    
	    
	    //System.out.println(Notes);

	}

}



 class Notes{
	 
	 int noteId;
	 String noteName;
	 int noteValue;
	 
	 
	 
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public int getNoteValue() {
		return noteValue;
	}
	public void setNoteValue(int noteValue) {
		this.noteValue = noteValue;
	}
	public Notes(int noteId, String noteName, int noteValue) {
		super();
		this.noteId = noteId;
		this.noteName = noteName;
		this.noteValue = noteValue;
	}
	
	
	
	@Override
	public String toString() {
		return "Notes [noteId=" + noteId + ", noteName=" + noteName + ", noteValue=" + noteValue + "]";
	}
	 
	 
	
	 
 }