package com.mini.dataset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mini.features.Feature;

public class Dataset {

	@SuppressWarnings("deprecation")
	public static List<Feature> readDataset() throws NumberFormatException, ParseException{

		
		List<Feature> features = new ArrayList<>();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader("dataset.csv"));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] featuresArray = line.split(cvsSplitBy);
				features.add(new Feature(
						featuresArray[0],
						Integer.valueOf(featuresArray[1]),
						featuresArray[2],
						featuresArray[3],
						featuresArray[4],
						featuresArray[5],
						Integer.valueOf(featuresArray[6]),
						featuresArray[7],
						Double.valueOf(featuresArray[8]),
						Integer.valueOf(featuresArray[9]),
						Double.valueOf(featuresArray[10])
						));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return features;
	}

}
