package com.brormoul.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.brormoul.app.databinding.FragmentDetailBindingImpl;
import com.brormoul.app.databinding.FragmentPeopleBindingImpl;
import com.brormoul.app.databinding.PeopleItemViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDETAIL = 1;

  private static final int LAYOUT_FRAGMENTPEOPLE = 2;

  private static final int LAYOUT_PEOPLEITEMVIEW = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brormoul.app.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brormoul.app.R.layout.fragment_people, LAYOUT_FRAGMENTPEOPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.brormoul.app.R.layout.people_item_view, LAYOUT_PEOPLEITEMVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPEOPLE: {
          if ("layout/fragment_people_0".equals(tag)) {
            return new FragmentPeopleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_people is invalid. Received: " + tag);
        }
        case  LAYOUT_PEOPLEITEMVIEW: {
          if ("layout/people_item_view_0".equals(tag)) {
            return new PeopleItemViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for people_item_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "peopleItem");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "detail");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_detail_0", com.brormoul.app.R.layout.fragment_detail);
      sKeys.put("layout/fragment_people_0", com.brormoul.app.R.layout.fragment_people);
      sKeys.put("layout/people_item_view_0", com.brormoul.app.R.layout.people_item_view);
    }
  }
}
