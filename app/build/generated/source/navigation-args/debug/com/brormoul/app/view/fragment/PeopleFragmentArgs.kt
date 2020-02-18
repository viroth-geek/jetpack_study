package com.brormoul.app.view.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

data class PeopleFragmentArgs(
  val userId: Int = 1
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("userId", this.userId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): PeopleFragmentArgs {
      bundle.setClassLoader(PeopleFragmentArgs::class.java.classLoader)
      val __userId : Int
      if (bundle.containsKey("userId")) {
        __userId = bundle.getInt("userId")
      } else {
        __userId = 1
      }
      return PeopleFragmentArgs(__userId)
    }
  }
}
