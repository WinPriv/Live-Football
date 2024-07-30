package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    static final int f6337a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final String f6338b = "InnerBroadcastManager";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f6339c = false;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f6340i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static m f6341j;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6342d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f6343e = new HashMap<>();
    private final HashMap<String, ArrayList<b>> f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f6344g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Handler f6345h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f6347a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f6348b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f6347a = intent;
            this.f6348b = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f6349a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f6350b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6351c;

        /* renamed from: d, reason: collision with root package name */
        boolean f6352d;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f6349a = intentFilter;
            this.f6350b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f6350b);
            sb2.append(" filter=");
            sb2.append(this.f6349a);
            if (this.f6352d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private m(Context context) {
        this.f6342d = context;
        this.f6345h = new Handler(context.getMainLooper()) { // from class: com.anythink.core.common.m.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    m.this.a();
                }
            }
        };
    }

    public static m a(Context context) {
        m mVar;
        synchronized (f6340i) {
            if (f6341j == null) {
                f6341j = new m(context.getApplicationContext());
            }
            mVar = f6341j;
        }
        return mVar;
    }

    private void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f6343e) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList<b> arrayList = this.f6343e.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f6343e.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<b> arrayList2 = this.f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6343e) {
            ArrayList<b> remove = this.f6343e.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    b bVar = remove.get(size);
                    bVar.f6352d = true;
                    for (int i10 = 0; i10 < bVar.f6349a.countActions(); i10++) {
                        String action = bVar.f6349a.getAction(i10);
                        ArrayList<b> arrayList = this.f.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = arrayList.get(size2);
                                if (bVar2.f6350b == broadcastReceiver) {
                                    bVar2.f6352d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean a(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        synchronized (this.f6343e) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6342d.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<b> arrayList3 = this.f.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: ".concat(String.valueOf(arrayList3)));
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    b bVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f6349a);
                    }
                    if (bVar.f6351c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = bVar.f6349a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(bVar);
                            bVar.f6351c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: ".concat(match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : com.huawei.openalliance.ad.constant.w.cl));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((b) arrayList5.get(i12)).f6351c = false;
                    }
                    this.f6344g.add(new a(intent, arrayList5));
                    if (!this.f6345h.hasMessages(1)) {
                        this.f6345h.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f6343e) {
                size = this.f6344g.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f6344g.toArray(aVarArr);
                this.f6344g.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = aVarArr[i10];
                int size2 = aVar.f6348b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = aVar.f6348b.get(i11);
                    if (!bVar.f6352d) {
                        bVar.f6350b.onReceive(this.f6342d, aVar.f6347a);
                    }
                }
            }
        }
    }
}
