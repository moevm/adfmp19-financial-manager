package com.example.fm

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_transaction.*
import java.text.SimpleDateFormat
import java.util.*

class AddTransactionActivity : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_transaction)

        //Calendar
        val now = Calendar.getInstance()

        var formate = SimpleDateFormat( "dd MMM, YYYY", Locale.US)
        val selectedDate = Calendar.getInstance()
        val date = formate.format(selectedDate.time)
        date_input_selector.setText(date )
        //set TextView
     /*   date_input_selector.setText(
            "" + now.get(Calendar.DAY_OF_MONTH) + "/" + now.get(Calendar.MONTH) + "/" + now.get(
                Calendar.YEAR
            )
        )*/




      //  var formate = SimpleDateFormat( pattern: "dd MMM, YYYY", Locale.US)




        //button clicked to show datePickerDialog
        date_input_selector.setOnClickListener {

            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    val selectedDate = Calendar.getInstance()
                    selectedDate.set(Calendar.YEAR, year)
                    selectedDate.set(Calendar.MONTH, month)
                    selectedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                    val date = formate.format(selectedDate.time)
                    date_input_selector.setText(date )

                },
                now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH)
            )
            datePicker.show()

        }

     /*   date_input_selector.apply {
           setText(mediumDateFormat.format(Date()))
        }*/

  /*      val mediumDateFormat = SimpleDateFormat("E, dd MMMM")
        var operationDate = Date()

        dateButton.apply {
            text = mediumDateFormat.format(Date())
        }

        dateButton.setOnClickListener {
            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    val selectedDate = Calendar.getInstance()
                    selectedDate.set(Calendar.YEAR, year)
                    selectedDate.set(Calendar.MONTH, month)
                    selectedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                    val date = formate.format(selectedDate.time)
                    dateButton.setText(date )


                },
                now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH)
            )
            datePicker.show()

        }
*/




    }

}