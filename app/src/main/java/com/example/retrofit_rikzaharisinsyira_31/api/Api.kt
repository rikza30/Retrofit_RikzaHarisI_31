import com.example.retrofit_rikzaharisinsyira_31.model.IndonesiaResponse
import com.example.retrofit_rikzaharisinsyira_31.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}
