import com.example.cosmetictogether.data.model.AuthResponse
import com.example.cosmetictogether.data.model.SignInRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthRetrofitInterface {
    @POST("api/v1/login")
    fun login(
        @Body SignInRequest: SignInRequest
    ): Call<AuthResponse>
}