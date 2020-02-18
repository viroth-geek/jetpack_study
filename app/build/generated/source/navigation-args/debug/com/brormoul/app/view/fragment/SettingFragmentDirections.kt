package com.brormoul.app.view.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brormoul.app.R

class SettingFragmentDirections private constructor() {
  companion object {
    fun actionSettingFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_setting_fragment_to_cartFragment)
  }
}
