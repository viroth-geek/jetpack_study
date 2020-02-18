package com.brormoul.app.repository.serviceInterface;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/brormoul/app/repository/serviceInterface/RetrofitClient;", "", "()V", "Companion", "app_debug"})
public final class RetrofitClient {
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String baseUrl;
    public static final com.brormoul.app.repository.serviceInterface.RetrofitClient.Companion Companion = null;
    
    public RetrofitClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/brormoul/app/repository/serviceInterface/RetrofitClient$Companion;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "getService", "Lcom/brormoul/app/repository/serviceInterface/PeopleInterface;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        public final void setRetrofit(@org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBaseUrl() {
            return null;
        }
        
        public final void setBaseUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.brormoul.app.repository.serviceInterface.PeopleInterface getService() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}