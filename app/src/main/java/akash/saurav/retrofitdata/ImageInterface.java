package akash.saurav.retrofitdata;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ImageInterface {

    String IMAGEURL = "https://babyandroid.000webhostapp.com/property/";
    @FormUrlEncoded
    @POST("uploadRetrofit.php")
    Call<String> getUserLogin(
            @Field("name") String name,
            @Field("image") String image
    );

}