package com.amarinag.daduextraordinaria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amarinag.daduextraordinaria.model.Character

class CharacterListFragment : Fragment() {
    private val adapter = CharacterAdapter()

    // TODO: RUB5 Añadir ViewBinding (estan añadidas las dependencias) (+1 punto)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configRecyclerView()
        doRequest()
    }

    // TODO: RUB1 configurar RecyclerView (+1 punto)
    private fun configRecyclerView() {

    }

    // TODO: RUB3 Configurar retrofit y hacer la petición para obtener el listado de personajes (+2 punto)
    private fun doRequest() {
        showLoading()

    }

    private fun populateData(characters: List<Character>) {
        hideLoading()
        adapter.submitList(characters)
    }

    // TODO: RUB4 Mostrar loading durante las peticiones de carga (+1 punto)
    private fun showLoading() {

    }

    // TODO: RUB4 Ocultar loading al terminar las peticiones de carga (+1 punto)
    private fun hideLoading() {

    }

    // TODO: RUB8 Gestionar los errores con una funcion llamada 'showError(message: String)' (+1 punto)

}