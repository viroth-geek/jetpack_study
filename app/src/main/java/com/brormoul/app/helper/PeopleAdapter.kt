package com.brormoul.app.helper

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.brormoul.app.BR
import com.brormoul.app.R
import com.brormoul.app.databinding.PeopleItemViewBinding
import com.brormoul.app.model.People

class PeopleAdapter(private val context: Context, private val items: ArrayList<People>, private val listener: ItemListener) : RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val peopleBinding: PeopleItemViewBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.people_item_view, parent, false)
        return PeopleViewHolder(peopleBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(items[position], listener, context, position)
    }

    inner class PeopleViewHolder(private val binding: PeopleItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: People, listener: ItemListener, context: Context, position: Int) {
            binding.setVariable(BR.peopleItem, item)
            binding.executePendingBindings()
            itemView.setOnClickListener {
                listener.onItemClick(item)
            }
            binding.buttonOption.setOnClickListener {
                val popupMenu = PopupMenu(context, binding.root)
                popupMenu.inflate(R.menu.item_menu)
                popupMenu.setOnMenuItemClickListener { menuItem ->
                    when(menuItem.itemId) {
                        R.id.delete -> {
                            listener.onItemDelete(item)
                            removeAt(position)
                        }
                        R.id.update -> {
                            listener.onItemUpdate(item)
                            val newPeople = People("100", "PULI", "44")
                            updateAt(position, newPeople)
                        }
                    }
                    false
                }
                popupMenu.show()
            }
        }
        private fun removeAt(position: Int) {
            items.removeAt(position)
            notifyItemRemoved(position)
            notifyDataSetChanged()
        }

        private fun updateAt(position: Int, item: People) {
            items[position] = item
            notifyItemChanged(position)
            notifyDataSetChanged()

        }
    }
}

interface ItemListener {
    fun onItemClick(item: People)
    fun onItemDelete(item: People)
    fun onItemUpdate(item: People)
}