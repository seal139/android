package com.septianPramana.latihan2a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.septianPramana.latihan2a.Model.Contact;
import com.septianPramana.latihan2a.Adapter.GenericAdapter;
import com.septianPramana.latihan2a.view.ContactView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        RecyclerView rView = (RecyclerView) findViewById(R.id.rView);

        setData();

        GenericAdapter adapter = new GenericAdapter(R.layout.contact_item, ContactView.class);

        adapter.addItems(contacts);
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(ContactActivity.this);
        rView.setLayoutManager(lManager);
        rView.setAdapter(adapter);
    }

    void setData(){
        System.out.println("fo");
        System.out.println(getApplicationContext().getPackageName());

        Resources res = getResources();

        Contact c1 = new Contact("1", "Seal", true);
        c1.setAddress("Jl Kenanga");
        c1.setCity("Jakarta");
        c1.setPhone("089811112222");
        c1.setImg(ResourcesCompat.getDrawable(res, R.drawable.autumn_lake, null));

        Contact c2 = new Contact("2", "Alice", false);
        c2.setAddress("Jl Mawar");
        c2.setCity("Jakarta");
        c2.setPhone("087833334444");
        c2.setImg(ResourcesCompat.getDrawable(res, R.drawable.curug, null));

        Contact c3 = new Contact("3", "Bob", true);
        c3.setAddress("Jl Cempaka");
        c3.setCity("Bogor");
        c3.setPhone("086855556666");
        c3.setImg(ResourcesCompat.getDrawable(res, R.drawable.end_of_the_river, null));

        Contact c4 = new Contact("3", "John Doe", true);
        c4.setAddress("Jl Kamboja");
        c4.setCity("Depok");
        c4.setPhone("084377778888");
        c4.setImg(ResourcesCompat.getDrawable(res, R.drawable.lake_1, null));

        Contact c5 = new Contact("4", "Eve", false);
        c5.setAddress("Jl Anggrek");
        c5.setCity("Tangerang");
        c5.setPhone("086799991111");
        c5.setImg(ResourcesCompat.getDrawable(res, R.drawable.riverside_indo, null));

        Contact c6 = new Contact("4", "Maria", false);
        c6.setAddress("Jl Sakura");
        c6.setCity("Tangerang");
        c6.setPhone("085711223344");
        c6.setImg(ResourcesCompat.getDrawable(res, R.drawable.baseline_person_24, null));

        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);
        contacts.add(c4);
        contacts.add(c5);
        contacts.add(c6);
    }

}