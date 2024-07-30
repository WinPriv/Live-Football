package n;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.browser.trusted.TrustedWebActivityService;

/* compiled from: NotificationApiHelperForO.java */
/* loaded from: classes.dex */
public final class a {
    public static Notification a(TrustedWebActivityService trustedWebActivityService, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }
}
