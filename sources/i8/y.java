package i8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29310a;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f29314e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f29313d = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f29311b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    public final String f29312c = ",";

    public y(SharedPreferences sharedPreferences, Executor executor) {
        this.f29310a = sharedPreferences;
        this.f29314e = executor;
    }

    public static y a(SharedPreferences sharedPreferences, Executor executor) {
        y yVar = new y(sharedPreferences, executor);
        synchronized (yVar.f29313d) {
            yVar.f29313d.clear();
            String string = yVar.f29310a.getString(yVar.f29311b, "");
            if (!TextUtils.isEmpty(string) && string.contains(yVar.f29312c)) {
                String[] split = string.split(yVar.f29312c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        yVar.f29313d.add(str);
                    }
                }
            }
        }
        return yVar;
    }
}
