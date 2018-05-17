package techcoll.mrsu.ru.techcoll_less7;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyService {
    @GET("test.php")
    Call<MyResult> getData(@Query("data") int digit);
}
