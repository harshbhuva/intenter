package com.clas.harsh.intenter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button email, playstore, maps;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(Button)findViewById(R.id.email);
        playstore=(Button)findViewById(R.id.playstore);
        maps=(Button)findViewById(R.id.maps);
        email.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","abc@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }


    });
playstore.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View view)
        {
        try
        {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en_IN"));
        startActivity(i);
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        }
        });
        maps.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick(View view)
        {
        Intent intent = new Intent(Intent.ACTION_VIEW,
        Uri.parse("http://maps.google.com/maps?q=22.246790,73.204439"));
        startActivity(intent);

        }
        });
        }
        }
