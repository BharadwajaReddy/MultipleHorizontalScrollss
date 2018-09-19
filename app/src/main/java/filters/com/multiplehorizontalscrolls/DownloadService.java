package filters.com.multiplehorizontalscrolls;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class DownloadService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new ShowProgressAsyncTask().execute();
        return super.onStartCommand(intent, flags, startId);
    }

    class ShowProgressAsyncTask extends AsyncTask<String, Integer, Integer> {


        @Override
        protected Integer doInBackground(String... strings) {


            for (int i = 0; i <= 100; i++) {

                Intent intent = new Intent("com.updateprogress");
                intent.putExtra("progress_val", i);
                intent.putExtra("progress_id", 3);

                sendBroadcast(intent);
                Log.v("progresss_vales1", i + "");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);


        }

        @Override
        protected void onPostExecute(Integer s) {
            super.onPostExecute(s);


        }
    }


}
