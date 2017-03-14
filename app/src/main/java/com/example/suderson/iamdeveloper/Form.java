package com.example.suderson.iamdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.widget.AdapterView;
import android.app.DatePickerDialog;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Spinner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import android.app.DatePickerDialog.OnDateSetListener;
import android.text.InputType;
import android.view.Menu;
import android.widget.EditText;

    public class Form extends AppCompatActivity implements View.OnClickListener{

        DatabaseHelper myDb;
        EditText Name,EmployeeId,EmailId,fromdate,todate;
        Spinner SelectTiming;
        Button BookSeat;
        private Spinner Timings;
        private EditText fromDateEtxt;
        private EditText toDateEtxt;

        private DatePickerDialog fromDatePickerDialog;
        private DatePickerDialog toDatePickerDialog;

        private SimpleDateFormat dateFormatter;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_form);
            myDb = new DatabaseHelper(this);
            Name = (EditText) findViewById(R.id.etName);
            EmployeeId = (EditText) findViewById(R.id.etEmployeeId);
            EmailId = (EditText) findViewById(R.id.etEmailId);
            SelectTiming = (Spinner)findViewById(R.id.Timings);
            fromdate = (EditText) findViewById(R.id.etxt_fromdate);
            todate = (EditText) findViewById(R.id.etxt_todate);
            BookSeat = (Button) findViewById(R.id.bBookSeat);
            AddData();

            dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

            findViewsById();

            setDateTimeField();

            addItemsOnSpinner();
            addListenerOnButton();
            addListenerOnSpinnerItemSelection();
        }

        public void addItemsOnSpinner() {
            Spinner Timings = (Spinner) findViewById(R.id.Timings);


            List<String> list = new ArrayList<>();
            list.add("Morning Shift(6 A.M - 3 P.M)");
            list.add("Noon Shift(1 P.M - 10 P.M)");
            list.add("Night Shift(8 P.M - 5 A.M)");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Timings.setAdapter(dataAdapter);
        }

        public void addListenerOnSpinnerItemSelection() {
            Timings = (Spinner) findViewById(R.id.Timings);
            Timings.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }

        public void addListenerOnButton() {
            Timings = (Spinner) findViewById(R.id.Timings);



        }

        private void findViewsById() {
            fromDateEtxt = (EditText) findViewById(R.id.etxt_fromdate);
            fromDateEtxt.setInputType(InputType.TYPE_NULL);
            fromDateEtxt.requestFocus();

            toDateEtxt = (EditText) findViewById(R.id.etxt_todate);
            toDateEtxt.setInputType(InputType.TYPE_NULL);
        }

        private void setDateTimeField() {
            fromDateEtxt.setOnClickListener(this);
            toDateEtxt.setOnClickListener(this);

            Calendar newCalendar = Calendar.getInstance();
            fromDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {

                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);
                    fromDateEtxt.setText(dateFormatter.format(newDate.getTime()));
                }

            }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

            toDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {

                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);
                    toDateEtxt.setText(dateFormatter.format(newDate.getTime()));
                }

            }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        }


        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the acti
            // on bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }


        public void onClick(View view) {
            if (view == fromDateEtxt) {
                fromDatePickerDialog.show();
            } else if (view == toDateEtxt) {
                toDatePickerDialog.show();
            }
        }

        public void AddData(){
            BookSeat.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            boolean isInserted = myDb.insertData(Name.getText().toString(),
                                    EmployeeId.getText().toString(),
                                    EmailId.getText().toString(),
                                    SelectTiming.getSelectedItem().toString(),
                                    fromdate.getText().toString(),
                                    todate.getText().toString());

                            if(isInserted=true)
                                Toast.makeText(Form.this, "Seat-Booked", Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(Form.this, "Seat is not booked, please try again", Toast.LENGTH_SHORT).show();

                        }
                    });
            }
    }



