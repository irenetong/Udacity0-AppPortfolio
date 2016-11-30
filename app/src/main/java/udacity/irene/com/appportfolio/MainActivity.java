package udacity.irene.com.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_build_it_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.build_it_bigger)),
                        Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button_stock_hawk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.stock_hawk)),
                        Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button_capstone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.capstone_my_own_app)),
                        Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button_go_ubiquitous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.go_ubiquitous)),
                        Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button_make_material).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.make_your_app_material)),
                        Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.button_popular_movies).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), String.format(getString(R.string.this_will_launch), getString(R.string.popular_movies)),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
