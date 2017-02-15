package com.theironyard.gardenofeden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlantPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_page);

        String plantInfo = getIntent().getExtras().getString("commonName");
        PlantData data = new PlantData();
        for (PlantData pd : SearchResults.plantList) {
            if (pd.commonName.equals(plantInfo)) {
                data = pd;
            }
        }
        TextView commonName = (TextView) findViewById(R.id.commonNameTextView);
        TextView scientificName = (TextView) findViewById(R.id.scientificNameTextView);

        commonName.setText(data.commonName);
        scientificName.setText(data.scientificName);

        TextView category = (TextView) findViewById(R.id.categoryTextView);
        TextView genus = (TextView) findViewById(R.id.genusTextView);
        TextView family = (TextView) findViewById(R.id.familyTextView);
        TextView duration = (TextView) findViewById(R.id.durationTextView);
        TextView growthHabit = (TextView) findViewById(R.id.growthHabitTextView);
        TextView activeGrowPeriod = (TextView) findViewById(R.id.activeGrowPeriodTextView);
        TextView shapeOrientation = (TextView) findViewById(R.id.shapeOrientationTextView);


        category.setText(data.category);
        genus.setText(data.genus);
        family.setText(data.family);
        duration.setText(data.duration);
        growthHabit.setText(data.growthHabit);
        activeGrowPeriod.setText(data.activeGrowthPeriod);
        shapeOrientation.setText(data.shapeOrientation);



    }
}
