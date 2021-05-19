import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author Sangeetha Murugesan
 * @version 2021.05.19
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {   
       
        
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
        else {
         System.out.println("valid index range is" + "    " +(files.size()-1));
        } 
        
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
        else {
         System.out.println("valid index range is" + "    " +(files.size()-1));
        } 
    }
    
    
   public void checkIndex(int index){
    if((index >= 0) && index <= files.size()-1){
      
        System.out.println("");
    }
    else {
         System.out.println("valid index range is" + "    " +(files.size()-1));
    }
    }
    
    public boolean validIndex(int index){
     if((index >= 0) && index <= files.size()-1){
        return true;
        }
       else {
         return false;
        } 
        
      
    
    }
    
}
