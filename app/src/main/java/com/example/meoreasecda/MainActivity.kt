package com.example.meoreasecda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textclassifier.TextClassifierEvent
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener {

    private var girdView:GridView ? = null
    private var arrayList:ArrayList<LanguageItem> ? = null
    private var languageAdapter:LanguageAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.my_grid_view)
        arrayList= ArrayList()
        languageAdapter = LanguageAdapter(applicationContext, arrayList!!)
        arrayList= setdatalist()
        gridView?.adapter = languageAdapter
        gridView?.onItemClickListener = this
    }

    private fun setdatalist() :ArrayList<LanguageItem>{
        var arrayList:ArrayList<LanguageItem> = ArrayList()

        arrayList.add(LanguageItem(R.drawable.cicon ,"Donut"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Eclair"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Froyo"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Gingerbread"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Honeycomb"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Ice Cream Sandwich"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Jelly Bean"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"KitKat"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Lolipop"))
        arrayList.add(LanguageItem(R.drawable.cicon ,"Marshmallow"))

        return arrayList


    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var languageItem:LanguageItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, languageItem.name, Toast.LENGTH_LONG).show()
    }
}