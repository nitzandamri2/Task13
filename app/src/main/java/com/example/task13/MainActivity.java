package com.example.task13;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // הגדרת המשתנים
    LinearLayout mainLayout;
    Switch mySwitch;
    RadioGroup myRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // קישור לרכיבים מה-XML
        mainLayout = findViewById(R.id.mainLayout);
        mySwitch = findViewById(R.id.mySwitch);
        myRadioGroup = findViewById(R.id.myRadioGroup);
    }

    // פונקציה שנקראת כשלוחצים על אחד מכפתורי הרדיו
    public void checkRadio(View v) {
        // החלפת צבע רקע במסך מיד בכל לחיצה על לחצן שנבחר ב-RG (כשהסוויץ' דולק)
        if (mySwitch.isChecked()) {
            changeBackgroundColor();
        }
    }

    // פונקציה שנקראת כשלוחצים על הכפתור למטה
    public void buttonClick(View v) {
        // החלפת צבע רקע במסך רק כאשר נלחץ לחצן ההפעלה (כשהסוויץ' כבוי)
        if (!mySwitch.isChecked()) {
            changeBackgroundColor();
        }
    }

    // פונקציית עזר שבודקת מה נבחר ומשנה את הצבע
    public void changeBackgroundColor() {
        int checkedId = myRadioGroup.getCheckedRadioButtonId();

        if (checkedId == R.id.rbRed) {
            mainLayout.setBackgroundColor(Color.RED);
        } else if (checkedId == R.id.rbGreen) {
            mainLayout.setBackgroundColor(Color.GREEN);
        } else if (checkedId == R.id.rbBlue) {
            mainLayout.setBackgroundColor(Color.BLUE);
        } else if (checkedId == R.id.rbYellow) {
            mainLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}