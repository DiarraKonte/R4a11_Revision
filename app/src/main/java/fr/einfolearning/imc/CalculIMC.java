package fr.einfolearning.imc;



import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import parcelable_imc.FicheIMC;



/**
 * Calcul et affichage l'IMC
 * @author B. LEMAIRE
 * @version 2025
 */
public class CalculIMC extends Activity {

	/*
	 * Parcelable transportable par un Intent
	 * Servira à la communication entre les deux acctivités
	 */
	private FicheIMC ficheIMC = null;

	// Label
	private TextView tv_nom = null;
	private	TextView tv_imc = null;


	private Button bt_back=null; // Pour la désérialisation du bouton nack

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		 	setContentView(R.layout.calcul_imc);

			this.deserialiserRessource();
			this.initConnections();


			// A compléter

	}


	// Affiche le nom et l'IMC calculé à paetir de la ficheIMC
	private void printIMCDetail(FicheIMC ficheIMC) {

	}

	private void deserialiserRessource() {

		this.tv_imc = (TextView) findViewById(R.id.tv_imc);
		this.tv_nom = (TextView) findViewById(R.id.tv_nom);
		this.bt_back = findViewById(R.id.bt_back);
	}

	private void initConnections() {

		// Mettre en place l'écouteur
		this.bt_back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
			  finish();
			}
		});
	}


	// Calcule et retourne l'IMC
	private float calculateIMC(float taille, float poids) {
		// A compléter

		return 0.0f;
	}

	
	
}
