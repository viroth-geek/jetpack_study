package com.brormoul.app.view.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.brormoul.app.R

class PeopleFragmentDirections private constructor() {
  companion object {
    fun actionPeopleDestToMusicFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_people_dest_to_musicFragment)

    fun actionPeopleDestToSettingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_people_dest_to_settingFragment)
  }
}
