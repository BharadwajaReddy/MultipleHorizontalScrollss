package filters.com.multiplehorizontalscrolls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SendBroadCast extends BroadcastReceiver {
    UpdateProgressListener progressListener;

    @Override
    public void onReceive(Context context, Intent intent) {
       // progressListener = (UpdateProgressListener) new AvaliableHotelsAdaptor();
        progressListener= (UpdateProgressListener) context;
        progressListener.onUpdateProgress(intent.getExtras().getInt("progress_id"), intent.getExtras().getInt("progress_val"));
        Log.v("progresss_vales3", intent.getExtras().getInt("progress_val") + "");
        Log.v("progresss_vales4", intent.getExtras().getInt("progress_id") + "");
    }
}
