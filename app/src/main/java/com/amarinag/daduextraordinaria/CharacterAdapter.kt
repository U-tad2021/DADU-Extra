package com.amarinag.daduextraordinaria

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.amarinag.daduextraordinaria.model.Character

class CharacterAdapter :
    ListAdapter<Character, CharacterAdapter.ViewHolder>(CharacterDiffUtilCallback) {


    // TODO: RUB2 Completar los métodos para que funcione el adaptador (+1 punto)
    // TODO: RUB5 Añadir ViewBinding (estan añadidas las dependencias) (+1 punto)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    // TODO: RUB2 Completar los métodos para que funcione el adaptador (+1 punto)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    // TODO: RUB5 Añadir ViewBinding (estan añadidas las dependencias) (+1 punto)
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}


object CharacterDiffUtilCallback : DiffUtil.ItemCallback<Character>() {
    override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean =
        oldItem == newItem
}