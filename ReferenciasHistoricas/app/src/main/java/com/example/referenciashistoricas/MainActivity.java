package com.example.referenciashistoricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView ivItems;
    private Adactador adaptador;
    ArrayList<Lugares> listItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivItems = findViewById(R.id.lvItems);
        adaptador =new Adactador(this, getArrarList());
        ivItems.setAdapter(adaptador);

        ivItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Position: " + position,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),String.valueOf( listItems.get(position).getImagen()),Toast.LENGTH_LONG).show();


                datospublicos.nombreImagen=listItems.get(position).getImagen();
                Intent intent = new Intent(getApplicationContext(),Informacion.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


               startActivity(intent);
            }
        });

    }
    private ArrayList<Lugares> getArrarList(){

        listItems.add(new Lugares(R.drawable.iglesia, "Visitar la Catedral de León", "Las iglesias son lugares emblemáticos, llenos de religiosidad y escepticismo, " +
                "                                             muchos de los visitantes se dirigen a las iglesias para magnificarse con los diseños de interiores o la antigüedad."));

        listItems.add(new Lugares(R.drawable.img4, "Visitar la Catedral de León", "Las iglesias son lugares emblemáticos, llenos de religiosidad y escepticismo, " +
                "                                             muchos de los visitantes se dirigen a las iglesias para magnificarse con los diseños de interiores o la antigüedad."));
        return listItems;
    }
}
