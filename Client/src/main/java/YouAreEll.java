import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;



public class YouAreEll {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
            YouAreEll() {
    }

    public static void main(String[] args) {
        YouAreEll urlhandler = new YouAreEll();
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String mainurl, String method, String jpayload) {
        String myURL = "http://zipcode.rocks:8085" + mainurl;
        OkHttpClient client = new OkHttpClient();

        if(method.equals("GET")) {
            Request request = new Request.Builder().url(myURL).build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (method.equals("POST")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            Request request = new Request.Builder().url(myURL).post(body).build();

            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        else if (method.equals("PUT")) {
//            ObjectMapper objectMapper = new ObjectMapper();
//
//        }
        return "nothing";
    }
}
