package com.example.dialer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView callKrishnan,callAmbika,callVijayan,callHarshitha,
              callBasker,callRamani,callHarsha,callDhananjayan,
              callRaman,callDevi,callSanjeev,
              callUsha,callVasudevan,callKrishna,callShakeeshya,
              callMadhavan,callSelvam,callMalini,callSenthil,callSangeetha,callNarayana,callSaranya,callManikandan,callAnitha,
              callKasthuri,callPradeep,callMythili,callSundaramoorthy;

    String[] permission = {"android.permission.CALL_PHONE"};
    public void call(String call)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permission,80);
        }
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(call));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callKrishnan = findViewById(R.id.imgKrishnan);
        callAmbika = findViewById(R.id.imgAmbika);
        callVijayan = findViewById(R.id.imgVijayan);
        callHarshitha = findViewById(R.id.imgHarshitha);
        callBasker = findViewById(R.id.imgBasker);
        callRamani = findViewById(R.id.imgRamani);
        callHarsha = findViewById(R.id.imgHarsha);
        callDhananjayan = findViewById(R.id.imgDhananjayan);
        callRaman = findViewById(R.id.imgRaman);
        callDevi = findViewById(R.id.imgDevi);
        callSanjeev = findViewById(R.id.imgSanjeev);
        callKrishna = findViewById(R.id.imgKrishna);
        callUsha = findViewById(R.id.imgUsha);
        callVasudevan = findViewById(R.id.imgUshaBhava);
        callShakeeshya = findViewById(R.id.imgShakeeshya);
        callMadhavan = findViewById(R.id.imgMadhavan);
        callSelvam = findViewById(R.id.imgSelvam);
        callMalini = findViewById(R.id.imgMalini);
        callSenthil = findViewById(R.id.imgSenthil);
        callSangeetha = findViewById(R.id.imgSangeetha);
        callNarayana = findViewById(R.id.imgNarayana);
        callSaranya = findViewById(R.id.imgSaranya);
        callManikandan = findViewById(R.id.imgMani);
        callAnitha = findViewById(R.id.imgAnitha);
        callKasthuri = findViewById(R.id.imgKasthuri);
        callPradeep = findViewById(R.id.imgPradeep);
        callMythili = findViewById(R.id.imgMythili);
        callSundaramoorthy = findViewById(R.id.imgSundaramoorthy);

        callKrishnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9492906905";
                call(call);
            }
        });
        callAmbika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9441439335";
                call(call);
            }
        });
        callVijayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9655885331";
                call(call);
            }
        });
        callHarshitha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9080945456";
                call(call);
            }
        });

        callBasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9443833963";
                call(call);
            }
        });
        callRamani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9486309343";
                call(call);
            }
        });
        callHarsha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9092246701";
                call(call);
            }
        });
        callDhananjayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:8056772048";
                call(call);
            }
        });

        callRaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9486467227";
                call(call);
            }
        });
        callDevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9894320207";
                call(call);
            }
        });
        callSanjeev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:6381740911";
                call(call);
            }
        });

        callKrishna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9600533453";
                call(call);
            }
        });
        callShakeeshya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9444303263";
                call(call);
            }
        });
        callUsha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9442137590";
                call(call);
            }
        });
        callVasudevan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9443307532";
                call(call);
            }
        });

        callMadhavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9566114248";
                call(call);
            }
        });
        callSelvam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9944952525";
                call(call);
            }
        });
        callMalini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9944952525";
                call(call);
            }
        });
        callSenthil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9791620947";
                call(call);
            }
        });
        callSangeetha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9791271732";
                call(call);
            }
        });

        callNarayana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:8778035099";
                call(call);
            }
        });
        callSaranya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9487741274";
                call(call);
            }
        });
        callManikandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9840513421";
                call(call);
            }
        });
        callAnitha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:9600062638";
                call(call);
            }
        });

        callKasthuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:";
                call(call);
            }
        });
        callMythili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:7010997151";
                call(call);
            }
        });
        callPradeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:600829498";
                call(call);
            }
        });
        callSundaramoorthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "tel:6381740911";
                call(call);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 80)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this, "Access Granted", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Access Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}