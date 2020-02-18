package com.brormoul.app.repository

import com.brormoul.app.model.People

class PeopleService {
    companion object {
        var list :ArrayList<People> = ArrayList()
        fun invokePeople() :ArrayList<People> {
            list.apply {
                add(People("1", "Jenny", "10"))
                add(People("2", "Kulu","20"))
            }
            return list
        }
    }
}