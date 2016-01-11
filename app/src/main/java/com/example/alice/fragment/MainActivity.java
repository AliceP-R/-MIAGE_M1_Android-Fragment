package com.example.alice.fragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.FrameL) != null)
        {
            if(savedInstanceState != null)
                return;
            PremierFrag frag1 = new PremierFrag();
            // FragmentTransaction permet d'ajouter ou d'enlever des fragments d'une vue.
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // on ajoute un PremierFrag dans le FrameLayout du main
            transaction.add(R.id.FrameL, frag1);
            // optionnel : sauvegarde dans le backstack l'ajout du frag1
            transaction.addToBackStack(null);
            // obligatoire : si on ne commit pas, il ne se passe rien
            transaction.commit();
        }
    }

    public void onClickButton(View v)
    {
        DeuxiemeFragment frag2 = new DeuxiemeFragment();
        // FragmentTransaction permet d'ajouter ou d'enlever des fragments d'une vue.
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        // on ajoute un PremierFrag dans le FrameLayout du main
        transaction.replace(R.id.FrameL, frag2);
        // optionnel : sauvegarde dans le backstack l'ajout du frag1
        transaction.addToBackStack(null);
        // obligatoire : si on ne commit pas, il ne se passe rien
        transaction.commit();
    }
}
