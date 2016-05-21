package pravin.bluesoft.hotelapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        
        //img=(ImageView)findViewById(R.id.imageView);
       /* Glide.with(this).load("http://goo.gl/gEgYUd").fitCenter()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade().into(img);*/

    }
}
