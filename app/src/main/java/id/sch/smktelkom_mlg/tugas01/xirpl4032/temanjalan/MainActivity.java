package id.sch.smktelkom_mlg.tugas01.xirpl4032.temanjalan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAlamat, etAlamat2;
    RadioGroup rgTempat;
    Button buttonOK;
    TextView tvHasil;
    CheckBox cbM, cbR, cbT, cbL;
    Spinner spWilayah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etAlamat2 = (EditText) findViewById(R.id.editTextAlamat2);
        rgTempat = (RadioGroup) findViewById(R.id.radiogroupT);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        cbM = (CheckBox) findViewById(R.id.checkBoxM);
        cbR = (CheckBox) findViewById(R.id.checkBoxR);
        cbT = (CheckBox) findViewById(R.id.checkBoxTU);
        cbL = (CheckBox) findViewById(R.id.checkBoxL);
        spWilayah = (Spinner) findViewById(R.id.spinner);

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doProcess();

            }
        });

    }

    private void doProcess() {
        String alamat = etAlamat.getText().toString();

        if (alamat.isEmpty()) {
            etAlamat.setError("Kelas belum diisi");
        } else {
            etAlamat.setError(null);
        }

        String alamat2 = etAlamat2.getText().toString();
        if (alamat2.isEmpty()) {
            etAlamat2.setError("Kelas belum diisi");
        } else {
            etAlamat2.setError(null);
        }


        String tempat = null;

        if (rgTempat.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton) findViewById(rgTempat.getCheckedRadioButtonId());
            tempat = rb.getText().toString();
        }
        if (tempat == null) {
            tvHasil.setText("Belum Memilih Tempat Penjemputan");
        } else {
            tvHasil.setText("Kamu mimiliih Tempat Penjemputan : " + tempat);
        }


        String tempat2 = "";

        int startlen = tempat2.length();
        if (cbM.isChecked()) tempat2 += cbM.getText() + "\n";
        if (cbR.isChecked()) tempat2 += cbR.getText() + "\n";
        if (cbT.isChecked()) tempat2 += cbT.getText() + "\n";
        if (cbL.isChecked()) tempat2 += cbL.getText() + "\n";

        if (tempat2.length() == startlen) tempat2 += "Belum Memilih";

        tvHasil.setText("Alamat Penjemputan di " + alamat + "\n" + "Tepatnya di " + tempat + " kota " + spWilayah.getSelectedItem().toString() + "\n" + "Dan Pengantaran ke " +
                alamat2 + " tepatnya di " + alamat2);

    }
    }
