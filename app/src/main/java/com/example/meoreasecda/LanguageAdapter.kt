package com.example.meoreasecda

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class LanguageAdapter(var context: Context , var arrayList: ArrayList<LanguageItem) : BaseAdapter() {

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return arrayList.size
    }
    override fun getCount(): Int {
        var view:View = View.inflate(context , R.layout.grid_item_list, root: null)

        var iconds:ImageView = view.findViewById(R.id.icons)
        var names:TextView = view.findViewById(R.id.name_text_view)

        var languageItem:LanguageItem = arrayList.get(position)

        icons.setImageResource(languageItem.icons!!)
        names.text = languageItem.name

        return view
    }
}

}