package bawei.com.a20170429_yuekaoa;

import android.os.Handler;
import android.os.Message;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import bawei.com.a20170429_yuekaoa.Utils.FileUtils;

/**
 * Created by huanhuan on 2017/5/1.
 */

public class MyHttpUrlConnection {

    String path;
    Map<String,String> map;
    Handler handler;

    public MyHttpUrlConnection(String path, Map<String,String> map, Handler handler){
        this.path = path;
        this.map = map;
        this.handler = handler;
    }

    public void requsetConnection(){

        try {
            URL url = new URL(path);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");

            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();

            Set<String> set = map.keySet();

            StringBuilder sb = new StringBuilder();

            for (String key:
                    set) {

                sb.append(key+"="+map.get(key));

                sb.append("&");

            }

            sb.deleteCharAt(sb.length()-1);

            os.write(sb.toString().getBytes());

            if (conn.getResponseCode() == 200){

                InputStream is = conn.getInputStream();

                String json = FileUtils.readFile(is);

                Message msg = Message.obtain();

                msg.obj = json;

                msg.what = 0;

                handler.sendMessage(msg);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void requsetViewPagerConnection(){

        try {
            URL url = new URL(path);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");

            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();

            Set<String> set = map.keySet();

            StringBuilder sb = new StringBuilder();

            for (String key:
                    set) {

                sb.append(key+"="+map.get(key));

                sb.append("&");

            }

            sb.deleteCharAt(sb.length()-1);

            os.write(sb.toString().getBytes());

            if (conn.getResponseCode() == 200){

                InputStream is = conn.getInputStream();

                String json = FileUtils.readFile(is);

                Message msg = Message.obtain();

                msg.obj = json;

                msg.what = 1;

                handler.sendMessage(msg);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
