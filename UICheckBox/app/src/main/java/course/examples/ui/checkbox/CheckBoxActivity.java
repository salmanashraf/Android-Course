package course.examples.ui.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TextView textView = (TextView)findViewById(R.id.textView);
		final CheckBox checkbox = (CheckBox)findViewById(R.id.checkbox);
		final Button button  = (Button)findViewById(R.id.button);

		checkbox.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(checkbox.isChecked()){
					checkbox.setText(getString(R.string.checked));
				}else{
					checkbox.setText(getString(R.string.im_not_checked_string));
				}
			}
		});


		// Get a reference to the Hide CheckBox Button
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				// Toggle the CheckBox's visibility state
				// Set the Button text accordingly
				if (checkbox.isShown()) {
					checkbox.setVisibility(View.INVISIBLE);
					button.setText("Unhide CheckBox");
				}else {
                    checkbox.setVisibility(View.VISIBLE);
                    button.setText("Hide CheckBox");
                }
			}
		});
	}
}