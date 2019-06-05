package com.android2ee.android.tuto.tabhost.tabhostlikeviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class TabSwipperActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Instanciation of the View
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_swipper);
		// Instanciation of the Tab Host the one that contains the tabPanels
		TabHost tabs = (TabHost) findViewById(R.id.tabhost);
		tabs.setup();
		// Instanciation of the first tab component
		TabHost.TabSpec spec = tabs.newTabSpec("digital");
		spec.setContent(R.id.digital);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Digital Clock");
		// Adding the first tabPanel to the TabHost
		tabs.addTab(spec);

		// Instanciation of the second tab component
		spec = tabs.newTabSpec("analogic");
		spec.setContent(R.id.analog);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Analogic Clock");
		// Adding the second tabPanel to the TabHost
		tabs.addTab(spec);

		// Instanciation of the second tab component
		spec = tabs.newTabSpec("analogic1");
		spec.setContent(R.id.analog1);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Analogic Clock1");
		// Adding the second tabPanel to the TabHost
		tabs.addTab(spec);

		// Instanciation of the second tab component
		spec = tabs.newTabSpec("analogic2");
		spec.setContent(R.id.analog2);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Analogic Clock2");
		// Adding the second tabPanel to the TabHost
		tabs.addTab(spec);

		// Instanciation of the second tab component
		spec = tabs.newTabSpec("digital1");
		spec.setContent(R.id.digital1);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Digital Clock1");
		// Adding the second tabPanel to the TabHost
		tabs.addTab(spec);
		// Instanciation of the second tab component
		spec = tabs.newTabSpec("digital2");
		spec.setContent(R.id.digital2);
		// Definition of the label to display for the tabPanel
		spec.setIndicator("Digital Clock2");
		// Adding the second tabPanel to the TabHost
		tabs.addTab(spec);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_tab_swipper, menu);
		return true;
	}
}
