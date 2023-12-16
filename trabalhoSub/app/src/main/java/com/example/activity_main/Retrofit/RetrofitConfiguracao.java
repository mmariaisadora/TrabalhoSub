package com.example.activity_main.Retrofit;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import com.example.activity_main.Service.IPais;


        public class RetrofitConfiguracao {

        private Retrofit retrofit;
        private static final String BASE_URL = "https://falabr.cgu.gov.br/";

        public RetrofitConfiguracao() {
            this.retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();

        }

        public IPais paisService() {
            return this.retrofit.create(IPais.class);
        }


    }