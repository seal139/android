package com.septianPramana.latihan2a.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;

import com.septianPramana.latihan2a.Model.Contact;
import com.septianPramana.latihan2a.R;

import java.io.File;

public class ContactView extends AbstractView<Contact> {
    public ContactView(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void onDataFilled() {
        TextView name = itemView.findViewById(R.id.contact_name);
        TextView address = itemView.findViewById(R.id.contact_address);


        name.setText(getEntity().getName());
        address.setText(getEntity().getAddress() + " - " + getEntity().getCity() + "\n(" + getEntity().getPhone() + ")");

        ImageView img = itemView.findViewById(R.id.contact_picture);
        img.setImageDrawable(getEntity().getImg());


    }
}
