package com.selimcinar.retroftjava.service;

import com.selimcinar.retroftjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoApı {
    // Get verileri getirir,Post veri gönderir,Update,Delete
    //Url base https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();
    // Call<List<CryptoModel>> getData(); //Verileri al

}
