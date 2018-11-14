import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//Ejemplo utilizando las librerios IO para creacion, lectura, escritura y borrado de archivs
//Ejemplo 3: Abarca la escritura de archivos

class IO_3{
    public static void main(String[] args){
        FileOutputStream fos = null;
        File file;
        String myContent = "Nowhereyesterday" + "@gmail.com";

        try {
            file = new File("C:\\Users\\cube\\Desktop\\IO.txt");
            fos = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }

            byte[] bytesArray = myContent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Sucessfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }catch(IOException ioe){
                System.out.println("Error in closing the stream");
            }
        }
    }
}