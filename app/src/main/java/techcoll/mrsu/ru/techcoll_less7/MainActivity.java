package techcoll.mrsu.ru.techcoll_less7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dev.handh.ru/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService service = retrofit.create(MyService.class);
        Call<MyResult> result = service.getData(5);
        result.enqueue(new Callback<MyResult>() {
            @Override
            public void onResponse(Call<MyResult> call, Response<MyResult> response) {
                Log.d("TAG", response.toString());
                Log.d("TAG", response.body().getMul2().toString() + " : " + response.body().getPow2().toString());
            }

            @Override
            public void onFailure(Call<MyResult> call, Throwable t) {

            }
        });
    }
}
