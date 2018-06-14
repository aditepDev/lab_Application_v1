package com.aditep.lab_android_v1.manager.http;

import com.aditep.lab_android_v1.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiService {
    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
