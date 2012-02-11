package com.example.lightswitch;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class LightSwitchActivity extends Activity {

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final ImageView lightBulb = (ImageView) findViewById(R.id.light_bulb);
		final ToggleButton lightSwitch = (ToggleButton) findViewById(R.id.light_switch);
		lightSwitch.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				TransitionDrawable drawable = (TransitionDrawable) lightBulb
						.getDrawable();
				if (lightSwitch.isChecked()) {
					drawable.startTransition(500);
				} else {
					drawable.reverseTransition(500);
				}
			}
		});
	}
}