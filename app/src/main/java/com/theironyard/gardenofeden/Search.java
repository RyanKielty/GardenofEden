package com.theironyard.gardenofeden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends AppCompatActivity implements View.OnClickListener {

    Spinner stateSpinner = (Spinner) findViewById(R.id.stateSpinner);
    Spinner growthSpinner = (Spinner) findViewById(R.id.growthSpinner);
    Spinner toxicitySpinner = (Spinner) findViewById(R.id.toxicitySpinner);
    Spinner humanConsumptionSpinner  = (Spinner) findViewById(R.id.humanConsumptionSpinner);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this, R.array.states_array, android.R.layout.simple_spinner_item);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);

        ArrayAdapter<CharSequence> growthAdapter = ArrayAdapter.createFromResource(this, R.array.growth_array, android.R.layout.simple_spinner_item);
        growthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        growthSpinner.setAdapter(growthAdapter);

        ArrayAdapter<CharSequence> toxicityAdapter = ArrayAdapter.createFromResource(this, R.array.toxicity_array, android.R.layout.simple_spinner_item);
        toxicityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toxicitySpinner.setAdapter(toxicityAdapter);

        ArrayAdapter<CharSequence> humanConsumptionAdapter = ArrayAdapter.createFromResource(this, R.array.human_consumption_array, android.R.layout.simple_spinner_item);
        humanConsumptionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        humanConsumptionSpinner.setAdapter(humanConsumptionAdapter);
    }

    @Override
    public void onClick(View action) {
        Intent searchIntent = new Intent(Search.this, )

//        growthSpinner

//        toxicitySpinner

//        humanConsumptionSpinner

    }

}
