package com.example.unitconverter_basic;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Esta clase contiene el funcionamiento general del conversor. Toda la funcionalidad de la vista excepto los cálculos.
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente a partir de la librería de jdstruck
 * @version: 29/04/2021
 * @see <a href = "https://github.com/jdstruck/UnitConverter-Android"/>UnitConverter-Android</a>
 */
public class MainActivity extends AppCompatActivity {

    private String inputUnit;
    private String inputCategory;
    private EditText inputField;
    private LinearLayout parentLinearLayout;
    private List<String> inputUnitSpinnerAdapterList;
    private Spinner unitCategorySpinner;
    private Spinner inputUnitSpinner;
    private ArrayAdapter<String> inputUnitSpinnerArrayAdapter;

    /**
     * Método original de la librería
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputField = findViewById(R.id.input_field);
        this.parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);
        this.unitCategorySpinner = (Spinner) findViewById(R.id.unit_category_spinner);
        this.inputUnitSpinner = (Spinner) findViewById(R.id.input_unit_spinner);

        initializeApp();
    }

    /**
     * Método original de la librería
     */
    public void initializeApp() {
        configureUnitCategorySpinner(Unit.unidadesCategorias);
        configureUnitCategorySpinnerListener();
        configureInputUnitSpinner(Unit.unidadesTemperatura);
        configureInputUnitSpinnerListener();
        configureInputFieldTextListener();
    }

    /**
     * Método original de la librería
     */
    private void configureUnitCategorySpinner(String[] unitsArray) {

        List<String> unitCategorySpinnerAdapterList = new ArrayList<>(Arrays.asList(unitsArray));

        ArrayAdapter<String> unitCategorySpinnerArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, unitCategorySpinnerAdapterList);

        unitCategorySpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitCategorySpinner.setAdapter(unitCategorySpinnerArrayAdapter);
    }

    /**
     * Método original de la librería
     */
    private void configureInputUnitSpinner(String[] unitsArray) {

        inputUnitSpinnerAdapterList = new ArrayList<>(Arrays.asList(unitsArray));

        inputUnitSpinnerArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, inputUnitSpinnerAdapterList);

        inputUnitSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputUnitSpinner.setAdapter(inputUnitSpinnerArrayAdapter);
    }

    /**
     * Método original de la librería
     */
    private void configureUnitCategorySpinnerListener() {
        this.unitCategorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            /**
             * Método original de la librería. Se han añadido nuevos case para las distintas unidades
             * Se ha arreglado un bug del original asignando valor a la inputUnit en cada case
             */
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                TextView spinnerTextView = (TextView) selectedItemView;
                String selectedText = spinnerTextView.getText().toString();
                TextView tv = (TextView) unitCategorySpinner.getSelectedView();
                tv.setTextColor(Color.WHITE);
                tv.setTextSize(20);
                inputField.setText("");
                inputCategory = selectedText;

                switch (selectedText) {
                    case "Temperatura":
                        inflateOutputUnitFields(Unit.unidadesTemperaturaOut);
                        resetInputUnitsSpinner(Unit.unidadesTemperatura);
                        inputUnit = "Celsius";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Longitud":
                        inflateOutputUnitFields(Unit.unidadesLongitudOut);
                        resetInputUnitsSpinner(Unit.unidadesLongitud);
                        inputUnit = "Kilómetros";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Almacenamiento digital":
                        inflateOutputUnitFields(Unit.unidadesAlmacenamientoDigitalOut);
                        resetInputUnitsSpinner(Unit.unidadesAlmacenamientoDigital);
                        inputUnit = "Bit";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Área":
                        inflateOutputUnitFields(Unit.unidadesAreaOut);
                        resetInputUnitsSpinner(Unit.unidadesArea);
                        inputUnit = "Kilómetro cuadrado";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Masa":
                        inflateOutputUnitFields(Unit.unidadesMasaOut);
                        resetInputUnitsSpinner(Unit.unidadesMasa);
                        inputUnit = "Kilogramos";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Velocidad":
                        inflateOutputUnitFields(Unit.unidadesVelocidadOut);
                        resetInputUnitsSpinner(Unit.unidadesVelocidad);
                        inputUnit = "Kilómetros por segundo";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Tiempo":
                        inflateOutputUnitFields(Unit.unidadesTiempoOut);
                        resetInputUnitsSpinner(Unit.unidadesTiempo);
                        inputUnit = "Segundos";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Fuerza":
                        inflateOutputUnitFields(Unit.unidadesFuerzaOut);
                        resetInputUnitsSpinner(Unit.unidadesFuerza);
                        inputUnit = "Newtons";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Volumen":
                        inflateOutputUnitFields(Unit.unidadesVolumenOut);
                        resetInputUnitsSpinner(Unit.unidadesVolumen);
                        inputUnit = "Litros";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Presión":
                        inflateOutputUnitFields(Unit.unidadesPresionOut);
                        resetInputUnitsSpinner(Unit.unidadesPresion);
                        inputUnit = "Bar";
                        inputField.setHint("Escribe aquí");
                        break;
                    case "Energía y trabajo":
                        inflateOutputUnitFields(Unit.unidadesEnergiaTrabajoOut);
                        resetInputUnitsSpinner(Unit.unidadesEnergiaTrabajo);
                        inputUnit = "Julios";
                        inputField.setHint("Escribe aquí");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {}
        });
    }

    /**
     * Método original de la librería
     */
    private void configureInputUnitSpinnerListener() {
        inputUnitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /**
             * Método original de la librería
             */
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                TextView spinnerTextView = (TextView) selectedItemView;
                String selectedText = spinnerTextView.getText().toString();
                TextView tv = (TextView) inputUnitSpinner.getSelectedView();
                tv.setTextSize(20);
                onInputSpinnerChange(selectedText);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {}

        });
    }

    /**
     * Método original de la librería
     */
    private void resetInputUnitsSpinner(String[] unitsList) {
        inputUnitSpinnerAdapterList.clear();
        inputUnitSpinnerAdapterList.addAll(Arrays.asList(unitsList));
        inputUnitSpinnerArrayAdapter.notifyDataSetChanged();
    }

    /**
     * Método original de la librería
     */
    private void inflateOutputUnitFields(String[] unitsArray) {
        this.parentLinearLayout.removeAllViews();
        for (String unit: unitsArray) {
            addField(this.parentLinearLayout, unit);
       }
    }

    /**
     * Método original de la librería
     */
    private void onInputSpinnerChange(String selectedText) {
        this.inputUnit = selectedText;
        convertUnits();
    }

    /**
     * Método original de la librería
     */
    private void configureInputFieldTextListener() {
        this.inputField.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            /**
             * Método original de la librería
             */
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (inputField.length() == 2) {
                    if (s.charAt(0) == '0') {
                        inputField.setText(s.subSequence(1, s.length()).toString());
                        inputField.setSelection(inputField.length());
                    } else if (s.charAt(0) == '-' && (s.charAt(1) == '-' || s.charAt(1) == '0')) {
                        inputField.setText(s.subSequence(1, s.length()).toString());
                        inputField.setSelection(inputField.length());
                    }
                }
                convertUnits();
            }
        });
    }

    /**
     * Método original de la librería
     */
    private void addField(View v, String unitTypeString) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        final View rowView = inflater.inflate(R.layout.field, null);
        EditText editText = (EditText)rowView.findViewById(R.id.output_item_field_template);
        TextView textView = (TextView)rowView.findViewById(R.id.output_item_label_template);
        editText.setTag(unitTypeString);
        textView.setText(unitTypeString);
        // Add the new row before the add field button.
        parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
    }

    /**
     * Método original de la librería
     */
    private void convertUnits() {
        if (inputField.length() == 0 || inputField.getText().toString().equals("-") || inputField.getText().toString().equals("+")) {
            clearOutputFields();
            return;
        }

        Editable inputFieldEditable = this.inputField.getText();
        Double inputFieldValue = Double.parseDouble(inputFieldEditable.toString());
        Double outputValue = 0.0;

        for (int i = 0; i < parentLinearLayout.getChildCount(); i++) {
            LinearLayout childLinearLayout = (LinearLayout) parentLinearLayout.getChildAt(i);
            EditText childElemEditText;
            for (int j = 0; j < childLinearLayout.getChildCount(); j++) {
                View childElem = childLinearLayout.getChildAt(j);
                if (childElem instanceof EditText) {
                    childElemEditText = (EditText) childElem;
                    String outputUnit = (String) childElem.getTag();
                    outputValue = Unit.convert(inputCategory, inputUnit, outputUnit, inputFieldValue);
                    childElemEditText.setText(Double.toString(outputValue));
                }
            }
        }
    }

    /**
     * Método original de la librería
     */
    private void clearOutputFields() {
        ViewGroup group = (ViewGroup)parentLinearLayout;
        for (int i = 0, count = group.getChildCount(); i < count; ++i) {
            LinearLayout outputItemContainer = (LinearLayout) group.getChildAt(i);
            View outputItemField = outputItemContainer.findViewById(R.id.output_item_field_template);
            if (outputItemField instanceof EditText) {
                ((EditText)outputItemField).setText("");
            }
        }
    }

    /**
     * Método original de la librería
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Método original de la librería
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}