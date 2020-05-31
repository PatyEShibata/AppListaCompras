package edu.br.unifcv.applistacompras;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editItem;
    private ListView listCompras;
    private ArrayList<String> arrayListItem;
    ArrayAdapter<String> adaptadorListCompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editItem = findViewById(R.id.descricao);
        listCompras = findViewById(R.id.listCompras);

        arrayListItem = new ArrayList<>();

        this.listCompras.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        adaptadorListCompras = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,
                arrayListItem
        );

        this.listCompras.setAdapter(adaptadorListCompras);

    }

    public void adicionarItem(View view) {
        String itemText = editItem.getText().toString();
        adaptadorListCompras.add(itemText);
        editItem.setText("");
    }

}
