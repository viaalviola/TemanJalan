package id.sch.smktelkom_mlg.tugas01.xirpl4032.temanjalan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAlamat, etAlamat2;
    RadioButton rbM, rbS, rbH, rbR;
    Button buttonOK;
    TextView tvHasil;
    CheckBox cbM, cbR, cbT, cbL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etAlamat2 = (EditText) findViewById(R.id.editTextAlamat2);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbS = (RadioButton) findViewById(R.id.radioButtonS);
        rbR = (RadioButton) findViewById(R.id.radioButtonR);
        rbH = (RadioButton) findViewById(R.id.radioButtonH);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        cbM = (CheckBox) findViewById(R.id.checkBoxM);
        cbR = (CheckBox) findViewById(R.id.checkBoxR);
        cbT = (CheckBox) findViewById(R.id.checkBoxTU);
        cbL = (CheckBox) findViewById(R.id.checkBoxL);

    }
}