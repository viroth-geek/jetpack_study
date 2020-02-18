package com.brormoul.app.repository.serviceInterface;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t0\u0003H\'\u00a8\u0006\n"}, d2 = {"Lcom/brormoul/app/repository/serviceInterface/PeopleInterface;", "", "getUserById", "Lretrofit2/Call;", "Lcom/brormoul/app/model/People;", "id", "", "getUsers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface PeopleInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract retrofit2.Call<java.util.ArrayList<com.brormoul.app.model.People>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{id}")
    public abstract retrofit2.Call<com.brormoul.app.model.People> getUserById(@retrofit2.http.Path(value = "id")
    int id);
}