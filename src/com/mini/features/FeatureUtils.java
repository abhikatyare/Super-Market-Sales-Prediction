package com.mini.features;

import java.util.ArrayList;
import java.util.List;

import com.mini.features.LFeature;

public class FeatureUtils {

	public static List<LFeature> extractFeatures(List<Feature> features) {
		// TODO Auto-generated method stub
		List<LFeature> lfeatures = new ArrayList<>();
		for(Feature f: features)
			lfeatures.add(new LFeature(f));
		return lfeatures;
	}

}
