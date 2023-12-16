package com.example.activity_main.Service;
import java.util.ArrayList;

import com.example.activity_main.Dto.DtoPais;
import retrofit2.Call;
import retrofit2.http.GET;
public interface IPais {
    @GET("api/paises")
    Call<ArrayList<DtoPais>> getPaisDtoCall();
}
