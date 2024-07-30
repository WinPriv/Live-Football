package com.huawei.openalliance.ad.ppskit.msgnotify;

import android.content.Intent;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ka.n7;

@OuterVisible
/* loaded from: classes2.dex */
public class PersistentMessageCenter {

    /* renamed from: c, reason: collision with root package name */
    public static PersistentMessageCenter f22704c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f22705d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22706a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22707b = new HashMap();

    /* loaded from: classes2.dex */
    public class a implements xa.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f22708s;

        public a(Object obj) {
            this.f22708s = obj;
        }

        @Override // xa.a
        public final void n(String str, Intent intent) {
            n.s(this.f22708s, "onMessageNotify", new Class[]{String.class, Intent.class}, new Object[]{str, intent}, true);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ xa.a f22709s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f22710t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Intent f22711u;

        public b(xa.a aVar, String str, Intent intent) {
            this.f22709s = aVar;
            this.f22710t = str;
            this.f22711u = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22709s.n(this.f22710t, this.f22711u);
        }
    }

    private PersistentMessageCenter() {
    }

    @OuterVisible
    public static PersistentMessageCenter getInstance() {
        PersistentMessageCenter persistentMessageCenter;
        synchronized (f22705d) {
            if (f22704c == null) {
                f22704c = new PersistentMessageCenter();
            }
            persistentMessageCenter = f22704c;
        }
        return persistentMessageCenter;
    }

    public final void a(String str, String str2, xa.a aVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && aVar != null) {
            synchronized (this.f22706a) {
                String str3 = str + "_" + str2;
                n7.e("PersistentMessageCenter", "register notify: " + str3);
                Set set = (Set) this.f22707b.get(str3);
                if (set == null) {
                    set = new HashSet();
                    this.f22707b.put(str3, set);
                }
                set.add(aVar);
            }
        }
    }

    @OuterVisible
    public void notifyMessage(String str, String str2, Intent intent) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (this.f22706a) {
                String str3 = str + "_" + str2;
                n7.e("PersistentMessageCenter", "notifyMessage " + str3);
                Set<xa.a> set = (Set) this.f22707b.get(str3);
                if (set != null) {
                    for (xa.a aVar : set) {
                        if (aVar != null) {
                            p2.a(new b(aVar, str2, intent), 0);
                        }
                    }
                }
            }
        }
    }

    @OuterVisible
    public void registerNotifyCallbackFromSdk(String str, String str2, Object obj) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && obj != null) {
            a(str, str2, new a(obj));
        }
    }

    @OuterVisible
    public void unregisterAll(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (this.f22706a) {
                String str3 = str + "_" + str2;
                n7.e("PersistentMessageCenter", "unregister all notify: " + str3);
                this.f22707b.remove(str3);
            }
        }
    }
}
