package com.example.complistsyspinnsrnbe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSelecionaTuPaisVariable = findViewById<TextView>(R.id.txtViewIDSelecionarPais)
        val spinnerPaisesVariable = findViewById<Spinner>(R.id.spinnerIDListaPaises)
        val botonSiguienteVariable = findViewById<Button>(R.id.botonIDNext)

        // Lista de países
        val paises = arrayOf("EUA","México","Brasil", "Francia","Alemania","Italia")
        // se crea el adapter y se le asigna a la variable antes creada "spinnerPaisesVariable" junto con el layout/estilo del spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, paises)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPaisesVariable.adapter = adapter


        //Creacion del objeto y funcion para cambiar el idioma del texto y el boton
        spinnerPaisesVariable.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {//se obtiene la posición del país selecionado en (INT)
                val paisSeleccionado = parent?.getItemAtPosition(position).toString()//Se obtiene el item(lo que contiene) de la posición del país seleccionado y se convierte a cadena

                //Segun el país seleccionado se cambia el idioma del texto y el boton, por las cadenas dentro del strings.xml
                when (paisSeleccionado) {
                    "EUA" -> {
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_en)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_en)
                    }
                    "México" -> {
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_es)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_es)
                    }
                    "Brasil" -> {
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_pt)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_pt)
                    }
                    "Francia" ->{
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_fr)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_fr)
                    }
                    "Alemania" ->{
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_de)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_de)
                    }
                    "Italia" ->{
                        txtSelecionaTuPaisVariable.text = getString(R.string.txt_it)
                        botonSiguienteVariable.text = getString(R.string.txt_boton_it)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                txtSelecionaTuPaisVariable.text = getString(R.string.txt_en)
                botonSiguienteVariable.text = getString(R.string.txt_boton_en)
            }
        }

        // Función del Alert cuando se presiona el botón
        botonSiguienteVariable.setOnClickListener {
            // Obtener el país seleccionado en el Spinner y convertirlo a String para asignarle una bienvenida en su idioma
            val paisSeleccionado = spinnerPaisesVariable.selectedItem.toString()

            // Mostrar un AlertDialog con un mensaje de bienvenida en el idioma seleccionado
            val mensajeBienvenida = when (paisSeleccionado) {
                "EUA" -> "Selected language \"English\" Welcome!"
                "México" -> "Idioma seleccionado \"Español\" ¡Bienvenido!"
                "Brasil" -> "Idioma selecionado \"Português\" Bem-vindo!"
                "Francia" -> "Langue sélectionnée \"Français\" Bienvenue!"
                "Alemania" -> "Ausgewählte Sprache „Deutsch“ Willkommen!"
                "Italia" -> "Lingua selezionata \"Italiano\" Benvenuto!"
                else -> "Welcome!"
            }
            //Código para crear el Alert
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setMessage(mensajeBienvenida)
            alertDialogBuilder.setPositiveButton("OK") {dialog, _ ->
                dialog.dismiss()
            }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }
}
