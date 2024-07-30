package jc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ sc.a f30215s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f30216t;

    public d(b bVar, sc.a aVar) {
        this.f30216t = bVar;
        this.f30215s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size;
        b bVar = this.f30216t;
        try {
            Context context = bVar.f30202a;
            if (context == null) {
                return;
            }
            ArrayList arrayList = null;
            try {
                if (bVar.f30204c != null) {
                    a b10 = a.b(context);
                    BroadcastReceiver broadcastReceiver = bVar.f30204c;
                    Context context2 = b10.f30200a;
                    try {
                        d1.a.a(context2).d(broadcastReceiver);
                    } catch (Throwable unused) {
                    }
                    try {
                        d1.a.a(context2).d(broadcastReceiver);
                    } catch (Throwable unused2) {
                    }
                    bVar.f30204c = null;
                }
            } catch (Throwable unused3) {
            }
            bVar.f30204c = new ic.c();
            IntentFilter intentFilter = new IntentFilter();
            sc.a aVar = this.f30215s;
            if (aVar != null) {
                arrayList = aVar.f35307c;
            }
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    intentFilter.addAction((String) arrayList.get(i10));
                }
            }
            a b11 = a.b(bVar.f30202a);
            BroadcastReceiver broadcastReceiver2 = bVar.f30204c;
            Context context3 = b11.f30200a;
            try {
                d1.a.a(context3).b(broadcastReceiver2, intentFilter);
            } catch (Throwable unused4) {
            }
            d1.a.a(context3).b(broadcastReceiver2, intentFilter);
        } catch (Throwable unused5) {
        }
    }
}
