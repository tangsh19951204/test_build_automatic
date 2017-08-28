package tangsh.com.tangdemo.Notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

import tangsh.com.tangdemo.R;

/**
 * Created by Administrator on 2017/7/7.
 */
public class NotificationActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        init();
    }

    private void init() {
        findViewById(R.id.notification_but).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.notification_but:
                pullnotification();
                break;
        }
    }
    private void pullnotification()
    {
        Notification notification;
        NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder builder=new Notification.Builder(this);
        builder.setContentTitle("i'm title");
        notification=builder.build();
        notificationManager.notify(1,notification);
    }
}
