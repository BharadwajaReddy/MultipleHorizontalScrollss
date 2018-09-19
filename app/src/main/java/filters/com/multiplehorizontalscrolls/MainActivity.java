package filters.com.multiplehorizontalscrolls;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements UpdateProgressListener {

    RecyclerView recyclerView1, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7;
    LinearLayoutManager layoutManager1, layoutManager2, layoutManager3, layoutManager4, layoutManager5, layoutManager6, layoutManager7;
    AvaliableHotelsAdaptor avaliableHotelsAdaptor1, avaliableHotelsAdaptor2, avaliableHotelsAdaptor3, avaliableHotelsAdaptor4, avaliableHotelsAdaptor5, avaliableHotelsAdaptor6, avaliableHotelsAdaptor7;
    ArrayList<Hotels> hotel_list;
    SendBroadCast sendBroadCast;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(sendBroadCast);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBroadCast = new SendBroadCast();
        IntentFilter intent_filter = new IntentFilter("com.updateprogress");
        registerReceiver(sendBroadCast, intent_filter);
        layoutManager1 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager3 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager4 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager5 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager6 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager7 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        intialiseViews1();
        intialiseViews2();
        intialiseViews3();
        intialiseViews4();
        intialiseViews5();
        intialiseViews6();
        intialiseViews7();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, DownloadService.class);
                startService(i);

            }
        }, 5000);
        // avaliableHotelsAdaptor.

    }

    public void intialiseViews1() {
        recyclerView1 = findViewById(R.id.recycler_view1);
        recyclerView1.setLayoutManager(layoutManager1);
        hotelsListt();
        avaliableHotelsAdaptor1 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView1.setAdapter(avaliableHotelsAdaptor1);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }

    public void intialiseViews2() {
        recyclerView2 = findViewById(R.id.recycler_view2);
        recyclerView2.setLayoutManager(layoutManager2);
        hotelsListt();
        avaliableHotelsAdaptor2 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView2.setAdapter(avaliableHotelsAdaptor2);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }


    public void intialiseViews3() {
        recyclerView3 = findViewById(R.id.recycler_view3);
        recyclerView3.setLayoutManager(layoutManager3);
        hotelsListt();
        avaliableHotelsAdaptor3 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView3.setAdapter(avaliableHotelsAdaptor3);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }

    public void intialiseViews4() {
        recyclerView4 = findViewById(R.id.recycler_view4);
        recyclerView4.setLayoutManager(layoutManager4);
        hotelsListt();
        avaliableHotelsAdaptor4 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView4.setAdapter(avaliableHotelsAdaptor4);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }

    public void intialiseViews5() {
        recyclerView5 = findViewById(R.id.recycler_view5);
        recyclerView5.setLayoutManager(layoutManager5);
        hotelsListt();
        avaliableHotelsAdaptor5 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView5.setAdapter(avaliableHotelsAdaptor5);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }

    public void intialiseViews6() {
        recyclerView6 = findViewById(R.id.recycler_view6);
        recyclerView6.setLayoutManager(layoutManager6);
        hotelsListt();
        avaliableHotelsAdaptor6 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView6.setAdapter(avaliableHotelsAdaptor6);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }

    public void intialiseViews7() {
        recyclerView7 = findViewById(R.id.recycler_view7);
        recyclerView7.setLayoutManager(layoutManager7);
        hotelsListt();
        avaliableHotelsAdaptor7 = new AvaliableHotelsAdaptor(hotel_list, getApplicationContext());
        recyclerView7.setAdapter(avaliableHotelsAdaptor7);


       /* Intent intent = new Intent(Intent.ACTION_SYNC, null, this, HotelsIntentService.class);
        intent.putExtra("url", "abc");
        intent.putExtra("receiver", mReceiver);
        intent.putExtra("request_id", 101);
        startService(intent);*/


        /*new Handler().post(new Runnable() {
            @Override
            public void run() {

            }
        });*/


       /* recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (!recyclerView.canScrollVertically(1)) {
                    Toast.makeText(MainActivity.this, "LAst2", Toast.LENGTH_LONG).show();

                }
            }
        });*/


    }


    public void hotelsListt() {
        hotel_list = new ArrayList<>();
        hotel_list.add(new Hotels(1, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(2, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(3, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(4, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(5, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(6, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(7, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(8, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(9, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(10, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(11, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(12, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(13, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(14, null, null, 0, 0, false, 0));

        hotel_list.add(new Hotels(15, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(16, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(17, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(18, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(19, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(20, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(21, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(22, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(23, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(24, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(25, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(26, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(27, null, null, 0, 0, false, 0));
        hotel_list.add(new Hotels(28, null, null, 0, 0, false, 0));
        Collections.shuffle(hotel_list);
    }

    @Override
    public void onUpdateProgress(final int id, final int val) {
        Log.v("update_this1", "cxv");
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                avaliableHotelsAdaptor1.UpdateProgress(id, val);
                avaliableHotelsAdaptor2.UpdateProgress(id, val);
                avaliableHotelsAdaptor3.UpdateProgress(id, val);
                avaliableHotelsAdaptor4.UpdateProgress(id, val);
                avaliableHotelsAdaptor5.UpdateProgress(id, val);
                avaliableHotelsAdaptor6.UpdateProgress(id, val);
                avaliableHotelsAdaptor7.UpdateProgress(id, val);




            }
        });

    }
}
