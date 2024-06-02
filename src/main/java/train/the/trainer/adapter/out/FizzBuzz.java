package train.the.trainer.adapter.out;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import train.the.trainer.application.port.Convertor;

import java.io.IOException;

public class FizzBuzz implements Convertor {

    private final OkHttpClient client = new OkHttpClient();

    public String convert(int number)  {
        String url =  "http://localhost:9000/fizzbuzz?number=" + number;
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException("oh no, was this supposed to work?", e);
        }
    }
}
