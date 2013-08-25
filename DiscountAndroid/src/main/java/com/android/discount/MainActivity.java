package com.android.discount;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import com.android.discount.models.Product;
import com.android.discount.services.IService;
import com.android.discount.services.ServiceImpl;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.txtHello);

        IService service = new ServiceImpl();

        //Product product = service.getProduct("1");

        List<Product> products = service.getProducts();

        textView.setText(products.size() + " !!!!");


//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                String testStr=HTTPRequestPoster.sendGetRequest("http://www.google.com/finance/converter",  "a=1&from=USD&to=INR");
//                Log.i(TAG, "TEST");
//                result.setText(testStr);
//            }
//        }).run();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
