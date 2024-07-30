package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {
    public static final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static a f27252g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27253a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f27254b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f27255c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f27256d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final HandlerC0354a f27257e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0354a extends Handler {
        public HandlerC0354a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f27254b) {
                    size = aVar.f27256d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    aVar.f27256d.toArray(bVarArr);
                    aVar.f27256d.clear();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = bVarArr[i10];
                    int size2 = bVar.f27260b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c cVar = bVar.f27260b.get(i11);
                        if (!cVar.f27264d) {
                            cVar.f27262b.onReceive(aVar.f27253a, bVar.f27259a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f27259a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f27260b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f27259a = intent;
            this.f27260b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f27261a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f27262b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f27263c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27264d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f27261a = intentFilter;
            this.f27262b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f27262b);
            sb2.append(" filter=");
            sb2.append(this.f27261a);
            if (this.f27264d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f27253a = context;
        this.f27257e = new HandlerC0354a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f) {
            if (f27252g == null) {
                f27252g = new a(context.getApplicationContext());
            }
            aVar = f27252g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f27254b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f27254b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f27254b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f27255c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f27255c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void c(Intent intent) {
        boolean z10;
        ArrayList<c> arrayList;
        int i10;
        String str;
        ?? r12;
        String str2;
        synchronized (this.f27254b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f27253a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i11 = 1;
            boolean z11 = false;
            if ((intent.getFlags() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList2 = this.f27255c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    c cVar = arrayList2.get(i12);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f27261a);
                    }
                    if (cVar.f27263c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i10 = i12;
                        str = action;
                        r12 = i11;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i10 = i12;
                        str = action;
                        r12 = i11;
                        int match = cVar.f27261a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(cVar);
                            cVar.f27263c = r12;
                        } else if (z10) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str2 = "unknown reason";
                                        } else {
                                            str2 = "type";
                                        }
                                    } else {
                                        str2 = "data";
                                    }
                                } else {
                                    str2 = "action";
                                }
                            } else {
                                str2 = w.cl;
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i12 = i10 + 1;
                    i11 = r12;
                    arrayList2 = arrayList;
                    action = str;
                    z11 = false;
                }
                int i13 = i11;
                if (arrayList3 != null) {
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        ((c) arrayList3.get(i14)).f27263c = false;
                    }
                    this.f27256d.add(new b(intent, arrayList3));
                    if (!this.f27257e.hasMessages(i13)) {
                        this.f27257e.sendEmptyMessage(i13);
                    }
                }
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f27254b) {
            ArrayList<c> remove = this.f27254b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f27264d = true;
                for (int i10 = 0; i10 < cVar.f27261a.countActions(); i10++) {
                    String action = cVar.f27261a.getAction(i10);
                    ArrayList<c> arrayList = this.f27255c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f27262b == broadcastReceiver) {
                                cVar2.f27264d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f27255c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
