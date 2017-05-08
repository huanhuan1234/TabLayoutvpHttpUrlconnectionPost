package bawei.com.a20170429_yuekaoa.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by huanhuan on 2017/5/1.
 */

public class FileUtils {
    public static String readFile(InputStream inputStream){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] buffer=new byte[1024];
        int len=0;
        try {
            while ((len=inputStream.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            return  bos.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
