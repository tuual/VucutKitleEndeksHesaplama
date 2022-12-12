package tual.gokmen.edittext_uyg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBoy,etKilo;
    Button btnHesapla;
    TextView tvSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBoy = findViewById(R.id.etBoy);
        etKilo = findViewById(R.id.etKilo);
        btnHesapla = findViewById(R.id.btnHesapla);
        tvSonuc = findViewById(R.id.tvSonuc);

        btnHesapla.setOnClickListener(view -> {
            float boyDeger = Float.parseFloat(etBoy.getText().toString().trim());
            float kiloDeger = Float.parseFloat(etKilo.getText().toString().trim());
            boyDeger = boyDeger/100;
            float degerSonuc = kiloDeger/(boyDeger*boyDeger);
            if ( degerSonuc <= 18){
                tvSonuc.setText(degerSonuc + " "+ "Zayıfsınız");

            }
            if (degerSonuc > 19){
                tvSonuc.setText(degerSonuc+" "+"Kilonuz İdeal");
            }
            if (degerSonuc > 30){
                tvSonuc.setText(degerSonuc + " " + "Kilonuz Fazla");
            }
        });

    }

}