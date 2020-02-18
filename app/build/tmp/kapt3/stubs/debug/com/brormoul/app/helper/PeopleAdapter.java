package com.brormoul.app.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/brormoul/app/helper/PeopleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/brormoul/app/helper/PeopleAdapter$PeopleViewHolder;", "context", "Landroid/content/Context;", "items", "Ljava/util/ArrayList;", "Lcom/brormoul/app/model/People;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/brormoul/app/helper/ItemListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/brormoul/app/helper/ItemListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PeopleViewHolder", "app_debug"})
public final class PeopleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.brormoul.app.helper.PeopleAdapter.PeopleViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.brormoul.app.model.People> items = null;
    private final com.brormoul.app.helper.ItemListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.brormoul.app.helper.PeopleAdapter.PeopleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.brormoul.app.helper.PeopleAdapter.PeopleViewHolder holder, int position) {
    }
    
    public PeopleAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.brormoul.app.model.People> items, @org.jetbrains.annotations.NotNull()
    com.brormoul.app.helper.ItemListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/brormoul/app/helper/PeopleAdapter$PeopleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/brormoul/app/databinding/PeopleItemViewBinding;", "(Lcom/brormoul/app/helper/PeopleAdapter;Lcom/brormoul/app/databinding/PeopleItemViewBinding;)V", "bind", "", "item", "Lcom/brormoul/app/model/People;", "listener", "Lcom/brormoul/app/helper/ItemListener;", "context", "Landroid/content/Context;", "position", "", "removeAt", "updateAt", "app_debug"})
    public final class PeopleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.brormoul.app.databinding.PeopleItemViewBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.brormoul.app.model.People item, @org.jetbrains.annotations.NotNull()
        com.brormoul.app.helper.ItemListener listener, @org.jetbrains.annotations.NotNull()
        android.content.Context context, int position) {
        }
        
        private final void removeAt(int position) {
        }
        
        private final void updateAt(int position, com.brormoul.app.model.People item) {
        }
        
        public PeopleViewHolder(@org.jetbrains.annotations.NotNull()
        com.brormoul.app.databinding.PeopleItemViewBinding binding) {
            super(null);
        }
    }
}