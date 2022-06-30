package com.amarinag.daduextraordinaria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amarinag.daduextraordinaria.model.Character

class CharacterDetailFragment : Fragment() {

    // TODO: RUB5 Añadir ViewBinding (estan añadidas las dependencias) (+1 punto)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val characterId: Int = 1
        doRequest(characterId)

    }

    // TODO: RUB3 Configurar retrofit y hacer la petición para obtener el listado de personajes (+2 punto)
    private fun doRequest(characterId: Int) {
        showLoading()

    }

    private fun populateData(character: Character) {

    }

    // TODO: RUB4 Mostrar loading durante las peticiones de carga (+1 punto)
    private fun showLoading() {

    }

    // TODO: RUB4 Ocultar loading al terminar las peticiones de carga (+1 punto)
    private fun hideLoading() {

    }

    // TODO: RUB8 Gestionar los errores con una funcion llamada 'showError(message: String)' (+1 punto)

}