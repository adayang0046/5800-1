//Folder.java
//Using hash map to store sub folder and file list

import java.util.HashMap;
import java.util.Map;

public class Folder {
    private String folderName;
    private Map<String, File> fileList;
    private Map<String, Folder> folderList;

    public void setFolderName(String folderName){
        this.folderName = folderName;
    }

    //Initiate an empty folder with a name and empty sub folder and file list.
    public Folder(String folderName){
        setFolderName(folderName);
        this.fileList = new HashMap<>();
        this.folderList = new HashMap<>();
        
    }

    public String getFolderName(){
        return folderName;
    }

    public Folder getSubFolder(String subFolderName){
        return folderList.get(subFolderName);
    }

    public void addFile(File file) {
        fileList.put(file.getFileName(),file);
    }

    public void addFolder(Folder folder){
        folderList.put(folder.getFolderName(),folder);
    }

    //delete file and folder from the current source folder
    public File deleteFile(String fileName){
        return fileList.remove(fileName);
    }

    public Folder deleteFolder(String folderName){
        return folderList.remove(folderName);        
    }

    //add a list of folders or files
    public void addFolderList (String[] folderNames){
        for (String i : folderNames){
            Folder temp = new Folder(i);
            this.addFolder(temp);
        }
    }

    public void addFileList (String[] fileNames){
        for (String i : fileNames){
            File temp = new File(i);
            this.addFile(temp);
        }
    }
    // print the current folder structure using the current folder as the source
    public void print(int start){
        String sep = "| ".repeat(start);
        System.out.println(sep + "Folder: " + folderName);
        for(File i : fileList.values()){
            i.print(start +1);
        }
        
        for(Folder i : folderList.values()){
            
            i.print(start +1);
            
        }
    }




}
