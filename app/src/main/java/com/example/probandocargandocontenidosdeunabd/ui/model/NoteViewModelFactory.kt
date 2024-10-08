package com.example.probandocargandocontenidosdeunabd.ui.model

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//creamos la fabrica para pdoer crear instancias de viewmodel
class NoteViewModelFactory(private val application: Application): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(application) as T
    }
}
