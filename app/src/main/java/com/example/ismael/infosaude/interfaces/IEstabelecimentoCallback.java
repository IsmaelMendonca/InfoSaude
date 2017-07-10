package com.example.ismael.infosaude.interfaces;

import com.example.ismael.infosaude.domain.EstabelecimentoDomain;
import com.example.ismael.infosaude.domain.RemedioDomain;

import java.util.List;

import retrofit2.Callback;

/**
 * Created by Ismael Mendonca on 27/06/17.
 */

public interface IEstabelecimentoCallback extends Callback<List<EstabelecimentoDomain>> {
}
