package com.example.ismael.infosaude.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ismael.infosaude.R;
import com.example.ismael.infosaude.R2;
import com.example.ismael.infosaude.singletons.ConfigurationsProperties;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ConfigurationsProperties.init(getApplicationContext());
    }

    @OnClick(R2.id.btn_buscar_remedio)
    public void irBuscarRemedio() {
        Intent brIntent = new Intent("android.intent.action.CALL");
        startActivity(brIntent);
    }

    @OnClick(R2.id.btn_buscar_estabelecimento)
    public void irBuscarEstabelecimento() {
        Intent beIntent = new Intent(this, BuscaEstabelecimentoActivity.class);
        startActivity(beIntent);
    }
}
