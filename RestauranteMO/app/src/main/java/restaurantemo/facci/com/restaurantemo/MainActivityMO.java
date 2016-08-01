package restaurantemo.facci.com.restaurantemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityMO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mo);
    }

    public void click1(View v){
        Toast.makeText(MainActivityMO.this,"PannaCotta de Frutos Rojos", Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityMO.this,"Pie de Manzana", Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityMO.this,"Tiramisú", Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityMO.this,"Cheesecake de Frutilla", Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityMO.this,"Flan de Coco", Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityMO.this,"Dulce de Tres Leches", Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityMO.this,"Torta de Zanahoria con Nueces", Toast.LENGTH_SHORT).show();
    }
}
