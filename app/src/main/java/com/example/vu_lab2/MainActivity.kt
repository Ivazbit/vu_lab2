package com.example.vu_lab2

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedSpinnerChoice = ""
        val textEditorValue = edit_text.text

        spinner_commands.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedSpinnerChoice = parent?.selectedItem.toString()
            }
                override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
        var counterValue: Int

        button_count.setOnClickListener {
            when {
                selectedSpinnerChoice == String.format(getString(R.string.spinner_count_words)) -> {
                    counterValue = CountingActivity().wordCount(textEditorValue.toString())
                    counter_text.text = String.format(getString(R.string.word_count_toast, counterValue))
                }
                textEditorValue.isEmpty() || textEditorValue.isNullOrBlank()-> {
                    Toast.makeText(this, R.string.edit_text_empty_toast, Toast.LENGTH_SHORT).show()
                }
                selectedSpinnerChoice == String.format(getString(R.string.spinner_count_punctuation)) -> {
                    counterValue = CountingActivity().punctuationCount(textEditorValue.toString())
                    counter_text.text = String.format(getString(R.string.word_punct_toast, counterValue))
                }
                else -> {
                    Toast.makeText(this, R.string.edit_text_error_toast, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

