package com.labas.bozidar.foi.codebox.mvp.interactors;

import android.app.Fragment;

import com.labas.bozidar.foi.codebox.mvp.listeners.onDataListener;

import java.util.ArrayList;

/**
 * Created by bozidar on 09.04.15..
 */
public interface QuizInteractor {
    public void fetchData(onDataListener listener);
    public void checkAnswer(String answer, String correct, onDataListener listener);
    public void addFragment(Fragment fragment);
    public ArrayList<Fragment> getFragments();
    public void startTimer(onDataListener listener);
}
