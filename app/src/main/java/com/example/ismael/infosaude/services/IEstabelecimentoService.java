package com.example.ismael.infosaude.services;

import com.example.ismael.infosaude.domain.EstabelecimentoDomain;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Ismael on 24/03/2017.
 */

public interface IEstabelecimentoService {
    @GET("estabelecimentos")
    Call<List<EstabelecimentoDomain>> getEstabelecimento(@QueryMap Map<String, String> options);
}
