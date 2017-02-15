package com.theironyard.gardenofeden;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchResults extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static ArrayList<PlantData> plantList = new ArrayList<>();
    ListView searchResultsListView;
    ArrayAdapter<String> individualPlant;
    final static String stateMNData = "Minnesota.txt";

    /* This section will eventually add more states to the fold, leading with Arizona

    final static String stateAZData = "Arizona.txt";

    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_listing);

        searchResultsListView = (ListView) findViewById(R.id.searchResultsListView);

        String stateSelection = getIntent().getStringExtra("states");
        String seasonSelection = getIntent().getStringExtra("seasons");
        String toxicitySelection = getIntent().getStringExtra("toxicity");
        String consumptionSelection = getIntent().getStringExtra("consumption");

        individualPlant = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        readMNData(seasonSelection, toxicitySelection, consumptionSelection);
        searchResultsListView.setAdapter(individualPlant);
    }

    public void readMNData(String seasonSelection, String toxicitySelection, String consumptionSelection) {
        BufferedReader MNReader = null;
        try {
            MNReader = new BufferedReader(new InputStreamReader(getAssets().open("Minnesota.txt")));
            String MNLine;
            while ((MNLine = MNReader.readLine()) != null) {
                String[] MNColumns = MNLine.split(",");
                if (!MNColumns[0].equals("\"Accepted Symbol\"")) {
                    PlantData plantPageData = new PlantData(MNColumns[0].replace("\"", ""), MNColumns[2].replace("\"", ""),
                            MNColumns[3].replace("\"", ""), MNColumns[4].replace("\"", ""), MNColumns[5].replace("\"", ""),
                            MNColumns[6].replace("\"", ""), MNColumns[7].replace("\"", ""), MNColumns[8].replace("\"", ""),
                            MNColumns[9].replace("\"", ""), MNColumns[10].replace("\"", ""), MNColumns[11].replace("\"", ""),
                            MNColumns[12].replace("\"", ""), MNColumns[15].replace("\"", ""), MNColumns[16].replace("\"", ""),
                            MNColumns[17].replace("\"", ""), MNColumns[18].replace("\"", ""), MNColumns[19].replace("\"", ""));

                    String firstLetter = plantPageData.commonName.substring(0, 1).toUpperCase();
                    String MNLineCapitalized = firstLetter + plantPageData.commonName.substring(1);
                    plantPageData.commonName = MNLineCapitalized;

                    if ((seasonSelection.equals(plantPageData.activeGrowthPeriod) || seasonSelection.equals("All")) &&
                            (toxicitySelection.equals(plantPageData.toxicity) || toxicitySelection.equals("All")) &&
                            (consumptionSelection.equals(plantPageData.humanConsumption) || consumptionSelection.equals("All"))) {


                        individualPlant.add(plantPageData.commonName);
                        plantList.add(plantPageData);
                    }
                }
            }


            individualPlant.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (MNReader != null) {
                try {
                    MNReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

///*   File readers for each state added
//
//
//        public void readAZData() {
//        BufferedReader AZReader = null;
//        try {
//            AZReader = new BufferedReader(new InputStreamReader(getAssets().open("Arizona.txt")));
//            String AZLine;
//            while ((AZLine = AZReader.readLine()) != null) {
//                String[] AZColumns = AZLine.split(",");
//                PlantData plantPageData = new PlantData(AZColumns[0], AZColumns[2], AZColumns[3], AZColumns[4], AZColumns[5],
//                        AZColumns[6], AZColumns[7], AZColumns[8], AZColumns[9], AZColumns[10], AZColumns[11], AZColumns[12],
//                        AZColumns[15], AZColumns[16], AZColumns[17], AZColumns[18], AZColumns[19]);
//                plantList.add(plantPageData);
//                individualPlant.add(plantPageData.commonName);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (AZReader != null) {
//                try {
//                    AZReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//*/


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent plantIntent = new Intent(SearchResults.this, PlantPage.class);

        plantIntent.putExtra("plant", individualPlant.getItem(position));

        startActivity(plantIntent);
    }
}
