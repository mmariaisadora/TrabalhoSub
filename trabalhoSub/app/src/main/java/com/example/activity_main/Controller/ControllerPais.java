package com.example.activity_main.Controller;

import android.content.Context;

import com.example.activity_main.Dao.PaisDao;
import com.example.activity_main.Dto.DtoPais;
import com.example.activity_main.Model.Pais;
import com.example.activity_main.Retrofit.RetrofitConfiguracao;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ControllerPais {

    private static Context context;
    public static void getViaPais(Context context){
        try{
            retrofit2.Call<ArrayList<DtoPais>> call = new RetrofitConfiguracao().paisService().getPaisDtoCall();
            call.enqueue(new Callback<ArrayList<DtoPais>>() {
                @Override
                public void onResponse(Call<ArrayList<DtoPais>> call, Response<ArrayList<DtoPais>> response) {
                    ArrayList<DtoPais> listaPais = response.body();
                    for (int i = 0 ; i <listaPais.size(); i++){
                        DtoPais pais = listaPais.get(i);
                        salvar(pais.getCodigo(), pais.getDescricao(),context);
                    }}
                @Override
                public void onFailure(Call<ArrayList<DtoPais>> call, Throwable t) {
                }
            });
        }catch (Exception ex){}
    }
    public static String salvar(int codigo, String descricao, Context context){
        try {
            Pais pais = new Pais();

            pais.setCodigo(codigo);
            pais.setDescricao(descricao);

            PaisDao.getInstancia(context).insert(pais);
        } catch (Exception ex) {
            return "Erro ao gravar pais." + ex.getMessage();
        }
        return null;
    }
    public static ArrayList<Pais> retornar(Context context){
        return PaisDao.getInstancia(context).getAll();
    }

}
