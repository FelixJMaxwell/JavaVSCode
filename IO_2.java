import java.io.*;

//Ejemplo utilizando las librerios IO para creacion, lectura, escritura y borrado de archivs
//Ejemplo 2: Abarca la lectura del contenido de un archivo

public class IO_2{
    public static void main(String[] args){
        File file = new File("C:\\Users\\cube\\Desktop\\IO.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            
            //Mostrar letra por letra todo el contenido del archivo leido
            while( bis.available() > 0 ){
                System.out.println((char)bis.read());
            }
            
            //Mostrar toda la informacion dentro del archivo leido como un solo string
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            }
            br.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        } catch (IOException ioe ) {
            System.out.println("I/O exception: " + ioe);
        }finally{
            try{
                if( bis != null && fis != null ){
                    fis.close();
                    bis.close();
                }
            }catch ( IOException ioe ){
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }

    }
}