package com.mini.algorithm;

public interface Regression<T> {
    /**
     * Predicts the dependent variable of an instance.
     * @param x the instance.
     * @return the predicted value of dependent variable.
     */
    public double predict(T x);

    /**
     * Predicts the dependent variables of an array of instances.
     *
     * @param x the instances.
     * @return the predicted values.
     */
    default public double[] predict(T[] x) {
        double[] y = new double[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = predict(x[i]);
        }
        return y;
    }
}
