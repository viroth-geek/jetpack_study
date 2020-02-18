package com.brormoul.app.databinding;
import com.brormoul.app.R;
import com.brormoul.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PeopleItemViewBindingImpl extends PeopleItemViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutInformation, 4);
        sViewsWithIds.put(R.id.buttonOption, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PeopleItemViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PeopleItemViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.ageTextView.setTag(null);
        this.idTextView.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.nameTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.peopleItem == variableId) {
            setPeopleItem((com.brormoul.app.model.People) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPeopleItem(@Nullable com.brormoul.app.model.People PeopleItem) {
        this.mPeopleItem = PeopleItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.peopleItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String peopleItemName = null;
        com.brormoul.app.model.People peopleItem = mPeopleItem;
        java.lang.String peopleItemId = null;
        java.lang.String peopleItemEmail = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (peopleItem != null) {
                    // read peopleItem.name
                    peopleItemName = peopleItem.getName();
                    // read peopleItem.id
                    peopleItemId = peopleItem.getId();
                    // read peopleItem.email
                    peopleItemEmail = peopleItem.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ageTextView, peopleItemEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.idTextView, peopleItemId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, peopleItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): peopleItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}