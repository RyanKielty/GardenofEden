package com.theironyard.gardenofeden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Search extends AppCompatActivity implements View.OnClickListener {

    public Spinner stateSpinner;
    public Spinner growthSpinner;
    public Spinner toxicitySpinner;
    public Spinner humanConsumptionSpinner;
    public Button searchPlantsButton;

//    static final int LISTING_PAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        stateSpinner = (Spinner) findViewById(R.id.stateSpinner);
        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this, R.array.states_array, android.R.layout.simple_spinner_item);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(stateAdapter);

        growthSpinner = (Spinner) findViewById(R.id.growthSpinner);
        ArrayAdapter<CharSequence> growthAdapter = ArrayAdapter.createFromResource(this, R.array.growth_array, android.R.layout.simple_spinner_item);
        growthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        growthSpinner.setAdapter(growthAdapter);

        toxicitySpinner = (Spinner) findViewById(R.id.toxicitySpinner);
        ArrayAdapter<CharSequence> toxicityAdapter = ArrayAdapter.createFromResource(this, R.array.toxicity_array, android.R.layout.simple_spinner_item);
        toxicityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toxicitySpinner.setAdapter(toxicityAdapter);

        humanConsumptionSpinner  = (Spinner) findViewById(R.id.humanConsumptionSpinner);
        ArrayAdapter<CharSequence> humanConsumptionAdapter = ArrayAdapter.createFromResource(this, R.array.human_consumption_array, android.R.layout.simple_spinner_item);
        humanConsumptionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        humanConsumptionSpinner.setAdapter(humanConsumptionAdapter);

        searchPlantsButton = (Button) findViewById(R.id.searchPlantsButton);

        searchPlantsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent searchIntent = new Intent(Search.this, SearchResults.class);

        searchIntent.putExtra("states", stateSpinner.getSelectedItem().toString());
        searchIntent.putExtra("seasons", growthSpinner.getSelectedItem().toString());
        searchIntent.putExtra("toxicity", toxicitySpinner.getSelectedItem().toString());
        searchIntent.putExtra("consumption", humanConsumptionSpinner.getSelectedItem().toString());

        startActivity(searchIntent);
    }

}
