package com.ulp.tp2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.ulp.tp2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainViewModel viewModel = new MainViewModel(); // Asumiendo que has creado una instancia de tu ViewModel aquí.
        viewModel.cargarDatos();
        viewModel.getLista().observe(this, lista -> {
            ListaAdapter adapter = new ListaAdapter(this, R.layout.item, lista, getLayoutInflater());
            binding.milista.setAdapter(adapter);
        });
    }
}
