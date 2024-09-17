

public class Main {
    public static void main(String[] args){
        //adding all folders and files and linking all of them in to a tree
        Folder phpDemo1 = new Folder("php_demo 1");

        String[] phpSubFolders = {"Source Files"};
        String[] sourceSubFolders = {"app","cache","public"};
        phpDemo1.addFolderList(phpSubFolders);
        Folder source  = phpDemo1.getSubFolder("Source Files");
        source.addFolderList(sourceSubFolders);
        Folder app = source.getSubFolder("app");
        Folder pub = source.getSubFolder("public");
        String[] appSubFolders = {"config","controllers","library","migrations","models","views"};
        String[] publicSubFiles = {".htaccess",".htrouter.php","index.html"};
        app.addFolderList(appSubFolders);
        pub.addFileList(publicSubFiles);
        String[] phpSubFolders2 = {"Include Path","Remote Files"};
        phpDemo1.addFolderList(phpSubFolders2);

        //print the structure
        System.out.println("\nphp_demo1 Structure: \n");
        phpDemo1.print(0);
        
        //delete the app folder and print the structure again
        source.deleteFolder("app");
        System.out.println("\nDelete folder: app\ncurrent php_demo1 Structure: \n");
        phpDemo1.print(0);
    }
}
