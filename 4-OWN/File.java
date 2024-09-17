//File.java
//
public class File {

    private String fileName;

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public File(String fileName){
        setFileName(fileName);
    }

    public String getFileName(){
        return fileName;
    }

    // to print file based on its level --> int start is file's #layer based on the root folder
    public void print(int start){
        String sep = "| ".repeat(start);
        System.out.println(sep +"File: " + fileName);
    }
}
