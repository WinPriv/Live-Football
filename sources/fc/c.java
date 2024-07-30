package fc;

import android.content.ComponentName;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.LinkedList;

/* compiled from: ShortcutBadger.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedList f28350a;

    /* renamed from: b, reason: collision with root package name */
    public static a f28351b;

    /* renamed from: c, reason: collision with root package name */
    public static ComponentName f28352c;

    static {
        LinkedList linkedList = new LinkedList();
        f28350a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r4, android.content.Context r5) throws fc.b {
        /*
            fc.a r0 = fc.c.f28351b
            if (r0 != 0) goto Ld1
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r1 = r5.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to find launch intent for package "
            r0.<init>(r1)
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ShortcutBadger"
            android.util.Log.e(r1, r0)
            goto Lc5
        L2b:
            android.content.ComponentName r0 = r0.getComponent()
            fc.c.f28352c = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            java.lang.String r1 = "android.intent.category.HOME"
            r0.addCategory(r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r2 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r0, r2)
            if (r0 == 0) goto Lc5
            android.content.pm.ActivityInfo r1 = r0.activityInfo
            java.lang.String r1 = r1.name
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "resolver"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L5a
            goto Lc5
        L5a:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r0 = r0.packageName
            java.util.LinkedList r1 = fc.c.f28350a
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L77
            fc.a r2 = (fc.a) r2     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r2 = 0
        L78:
            if (r2 == 0) goto L64
            java.util.List r3 = r2.a()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L64
            fc.c.f28351b = r2
        L86:
            fc.a r0 = fc.c.f28351b
            if (r0 != 0) goto Lc3
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "ZUK"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L9c
            com.onesignal.shortcutbadger.impl.ZukHomeBadger r0 = new com.onesignal.shortcutbadger.impl.ZukHomeBadger
            r0.<init>()
            fc.c.f28351b = r0
            goto Lc3
        L9c:
            java.lang.String r1 = "OPPO"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lac
            com.onesignal.shortcutbadger.impl.OPPOHomeBader r0 = new com.onesignal.shortcutbadger.impl.OPPOHomeBader
            r0.<init>()
            fc.c.f28351b = r0
            goto Lc3
        Lac:
            java.lang.String r1 = "VIVO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lbc
            com.onesignal.shortcutbadger.impl.VivoHomeBadger r0 = new com.onesignal.shortcutbadger.impl.VivoHomeBadger
            r0.<init>()
            fc.c.f28351b = r0
            goto Lc3
        Lbc:
            com.onesignal.shortcutbadger.impl.DefaultBadger r0 = new com.onesignal.shortcutbadger.impl.DefaultBadger
            r0.<init>()
            fc.c.f28351b = r0
        Lc3:
            r0 = 1
            goto Lc6
        Lc5:
            r0 = 0
        Lc6:
            if (r0 == 0) goto Lc9
            goto Ld1
        Lc9:
            fc.b r4 = new fc.b
            java.lang.String r5 = "No default launcher available"
            r4.<init>(r5)
            throw r4
        Ld1:
            fc.a r0 = fc.c.f28351b     // Catch: java.lang.Exception -> Ld9
            android.content.ComponentName r1 = fc.c.f28352c     // Catch: java.lang.Exception -> Ld9
            r0.b(r5, r1, r4)     // Catch: java.lang.Exception -> Ld9
            return
        Ld9:
            r4 = move-exception
            fc.b r5 = new fc.b
            java.lang.String r0 = "Unable to execute badge"
            r5.<init>(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.c.a(int, android.content.Context):void");
    }
}
