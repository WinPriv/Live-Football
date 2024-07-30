package v1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import r1.h;

/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f35908b = h.e("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f35909a;

    public a(Context context) {
        this.f35909a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
