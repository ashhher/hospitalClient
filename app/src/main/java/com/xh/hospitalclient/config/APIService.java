package com.xh.hospitalclient.config;

import com.xh.hospitalclient.model.UserBean;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

//网络请求API
public interface APIService {

    @GET(Constants.UrlOrigin.login)
    Observable<UserBean> loginRx(@Query("id") String username ,@Query("pwd") String password);

    @POST(Constants.UrlOrigin.register)
    Observable<UserBean> registerRx(@Query("id") String username ,@Query("pwd") String password,@Query("name") String name,@Query("age") int age,@Query("sex") Boolean sex);
}