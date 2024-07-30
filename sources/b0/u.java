package b0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b0.x;
import com.huawei.openalliance.ad.constant.av;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2760a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f2761b;

    /* renamed from: c, reason: collision with root package name */
    public final q f2762c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2763d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2764e;

    public u(q qVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Bundle bundle;
        ArrayList<l> arrayList;
        Bundle[] bundleArr;
        int i10;
        Icon icon;
        Bundle bundle2;
        int i11;
        new ArrayList();
        this.f2763d = new Bundle();
        this.f2762c = qVar;
        Context context = qVar.f2734a;
        this.f2760a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2761b = new Notification.Builder(context, qVar.f2750s);
        } else {
            this.f2761b = new Notification.Builder(context);
        }
        Notification notification = qVar.f2753v;
        ArrayList<String> arrayList2 = null;
        Notification.Builder lights = this.f2761b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i12 = 0;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(qVar.f2738e).setContentText(qVar.f).setContentInfo(null).setContentIntent(qVar.f2739g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(qVar.f2740h).setNumber(qVar.f2741i).setProgress(0, 0, false);
        this.f2761b.setSubText(null).setUsesChronometer(false).setPriority(qVar.f2742j);
        Iterator<l> it = qVar.f2735b.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.f2722b == null && (i11 = next.f2727h) != 0) {
                next.f2722b = IconCompat.b("", i11);
            }
            IconCompat iconCompat = next.f2722b;
            if (iconCompat != null) {
                icon = IconCompat.a.f(iconCompat, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(icon, next.f2728i, next.f2729j);
            y[] yVarArr = next.f2723c;
            if (yVarArr != null) {
                int length = yVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (yVarArr.length <= 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        builder.addRemoteInput(remoteInputArr[i13]);
                    }
                } else {
                    y yVar = yVarArr[0];
                    throw null;
                }
            }
            Bundle bundle3 = next.f2721a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z13 = next.f2724d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            int i14 = Build.VERSION.SDK_INT;
            builder.setAllowGeneratedReplies(z13);
            int i15 = next.f;
            bundle2.putInt("android.support.action.semanticAction", i15);
            if (i14 >= 28) {
                builder.setSemanticAction(i15);
            }
            if (i14 >= 29) {
                builder.setContextual(next.f2726g);
            }
            if (i14 >= 31) {
                builder.setAuthenticationRequired(next.f2730k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f2725e);
            builder.addExtras(bundle2);
            this.f2761b.addAction(builder.build());
        }
        Bundle bundle4 = qVar.f2747p;
        if (bundle4 != null) {
            this.f2763d.putAll(bundle4);
        }
        int i16 = Build.VERSION.SDK_INT;
        this.f2761b.setShowWhen(qVar.f2743k);
        this.f2761b.setLocalOnly(qVar.o).setGroup(qVar.f2745m).setGroupSummary(qVar.f2746n).setSortKey(null);
        this.f2764e = qVar.f2751t;
        this.f2761b.setCategory(null).setColor(qVar.f2748q).setVisibility(qVar.f2749r).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<x> arrayList3 = qVar.f2736c;
        ArrayList<String> arrayList4 = qVar.f2754w;
        if (i16 < 28) {
            if (arrayList3 != null) {
                arrayList2 = new ArrayList<>(arrayList3.size());
                Iterator<x> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    x next2 = it2.next();
                    String str = next2.f2789c;
                    if (str == null) {
                        CharSequence charSequence = next2.f2787a;
                        if (charSequence == null) {
                            str = "";
                        } else {
                            str = "name:" + ((Object) charSequence);
                        }
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    q.d dVar = new q.d(arrayList4.size() + arrayList2.size());
                    dVar.addAll(arrayList2);
                    dVar.addAll(arrayList4);
                    arrayList4 = new ArrayList<>(dVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator<String> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                this.f2761b.addPerson(it3.next());
            }
        }
        ArrayList<l> arrayList5 = qVar.f2737d;
        if (arrayList5.size() > 0) {
            if (qVar.f2747p == null) {
                qVar.f2747p = new Bundle();
            }
            Bundle bundle5 = qVar.f2747p.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i12 < arrayList5.size()) {
                String num = Integer.toString(i12);
                l lVar = arrayList5.get(i12);
                Object obj = v.f2765a;
                Bundle bundle8 = new Bundle();
                if (lVar.f2722b == null && (i10 = lVar.f2727h) != 0) {
                    lVar.f2722b = IconCompat.b("", i10);
                }
                IconCompat iconCompat2 = lVar.f2722b;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.c() : i17);
                bundle8.putCharSequence("title", lVar.f2728i);
                bundle8.putParcelable("actionIntent", lVar.f2729j);
                Bundle bundle9 = lVar.f2721a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", lVar.f2724d);
                bundle8.putBundle(av.K, bundle);
                y[] yVarArr2 = lVar.f2723c;
                if (yVarArr2 == null) {
                    bundleArr = null;
                    arrayList = arrayList5;
                } else {
                    Bundle[] bundleArr2 = new Bundle[yVarArr2.length];
                    arrayList = arrayList5;
                    if (yVarArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        y yVar2 = yVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", lVar.f2725e);
                bundle8.putInt("semanticAction", lVar.f);
                bundle7.putBundle(num, bundle8);
                i12++;
                i17 = 0;
                arrayList5 = arrayList;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (qVar.f2747p == null) {
                qVar.f2747p = new Bundle();
            }
            qVar.f2747p.putBundle("android.car.EXTENSIONS", bundle5);
            this.f2763d.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        this.f2761b.setExtras(qVar.f2747p).setRemoteInputHistory(null);
        if (i18 >= 26) {
            this.f2761b.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(qVar.f2751t);
            if (!TextUtils.isEmpty(qVar.f2750s)) {
                this.f2761b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i18 >= 28) {
            Iterator<x> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                x next3 = it4.next();
                Notification.Builder builder2 = this.f2761b;
                next3.getClass();
                builder2.addPerson(x.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2761b.setAllowSystemGeneratedContextualActions(qVar.f2752u);
            this.f2761b.setBubbleMetadata(null);
        }
    }
}
