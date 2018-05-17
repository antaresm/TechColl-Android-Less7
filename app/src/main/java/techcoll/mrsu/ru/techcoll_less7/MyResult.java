package techcoll.mrsu.ru.techcoll_less7;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyResult {

    @SerializedName("mul2")
    @Expose
    private Integer mul2;
    @SerializedName("pow2")
    @Expose
    private Integer pow2;

    public Integer getMul2() {
        return mul2;
    }

    public void setMul2(Integer mul2) {
        this.mul2 = mul2;
    }

    public Integer getPow2() {
        return pow2;
    }

    public void setPow2(Integer pow2) {
        this.pow2 = pow2;
    }

}