package np.com.sumanastani.stackoverflow;

import np.com.sumanastani.stackoverflow.Model.Answer;
import np.com.sumanastani.stackoverflow.Model.Question;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Simon on 11/7/2017.
 */

public interface StackOverflowAPI {
    String BASE_URL = "https://api.stackexchange.com";

    @GET("/2.2/questions?order=desc&sort=votes&site=stackoverflow&tagged=android&filter=withbody")
    Call<ListWrapper<Question>> getQuestions();

    @GET("/2.2/questions/{id}/answers?order=desc&sort=votes&site=stackoverflow")
    Call<ListWrapper<Answer>> getAnswersForQuestion(@Path("id") String questionId);
}
