package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.hamkho.livefoot.R;
import java.util.ArrayList;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2734a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2738e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f2739g;

    /* renamed from: h, reason: collision with root package name */
    public Bitmap f2740h;

    /* renamed from: i, reason: collision with root package name */
    public int f2741i;

    /* renamed from: j, reason: collision with root package name */
    public int f2742j;

    /* renamed from: l, reason: collision with root package name */
    public s f2744l;

    /* renamed from: m, reason: collision with root package name */
    public String f2745m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2746n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f2747p;

    /* renamed from: s, reason: collision with root package name */
    public String f2750s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2752u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f2753v;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f2754w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<l> f2735b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<x> f2736c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<l> f2737d = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public boolean f2743k = true;
    public boolean o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f2748q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2749r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f2751t = 0;

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.f2753v = notification;
        this.f2734a = context;
        this.f2750s = str;
        notification.when = System.currentTimeMillis();
        this.f2753v.audioStreamType = -1;
        this.f2742j = 0;
        this.f2754w = new ArrayList<>();
        this.f2752u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        u uVar = new u(this);
        q qVar = uVar.f2762c;
        s sVar = qVar.f2744l;
        if (sVar != null) {
            sVar.b(uVar);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = uVar.f2761b;
        if (i10 >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i11 = uVar.f2764e;
            if (i11 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i11 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults = build.defaults & (-2) & (-3);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i11 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults = build.defaults & (-2) & (-3);
                }
            }
            notification = build;
        }
        if (sVar != null) {
            qVar.f2744l.getClass();
        }
        if (sVar != null && (bundle = notification.extras) != null) {
            sVar.a(bundle);
        }
        return notification;
    }

    public final void c(int i10) {
        Notification notification = this.f2753v;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i10, boolean z10) {
        if (z10) {
            Notification notification = this.f2753v;
            notification.flags = i10 | notification.flags;
        } else {
            Notification notification2 = this.f2753v;
            notification2.flags = (~i10) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f2734a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.f2740h = bitmap;
    }

    public final void f(Uri uri) {
        Notification notification = this.f2753v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void g(s sVar) {
        if (this.f2744l != sVar) {
            this.f2744l = sVar;
            if (sVar != null && sVar.f2756a != this) {
                sVar.f2756a = this;
                g(sVar);
            }
        }
    }
}
