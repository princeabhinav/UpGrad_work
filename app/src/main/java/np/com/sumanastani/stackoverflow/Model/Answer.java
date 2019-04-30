package np.com.sumanastani.stackoverflow.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Simon on 11/7/2017.
 */

public class Answer {
    @SerializedName("answer_id")
    public int answerId;

    @SerializedName("is_accepted")
    public boolean accepted;

    public int score;

    /*toString method is used when we need a string representaton of object*/
    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", accepted=" + (accepted ? "Yes" : "No") +
                ", score=" + score +
                '}';
    }
}
