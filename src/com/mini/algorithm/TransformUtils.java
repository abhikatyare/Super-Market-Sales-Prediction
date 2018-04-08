package com.mini.algorithm;

import java.util.List;

import com.mini.features.LFeature;

public class TransformUtils {

	public static double[][] getMatrix(List<LFeature> lfeatureList) {
		double[][] lFeatureMatrix = new double[lfeatureList.size()][];
		for(int i=0;i<lfeatureList.size();i++) {
			lFeatureMatrix[i]=lfeatureList.get(i).getFeatureArray();
		}
		return lFeatureMatrix;
	}
	
	public static double[] getYArray(List<LFeature> lfeatureList) {
		double[] yArray = new double[lfeatureList.size()];
		for(int i=0;i<lfeatureList.size();i++) {
			yArray[i]=lfeatureList.get(i).getY();
		}
		return yArray;
	}
	
}
