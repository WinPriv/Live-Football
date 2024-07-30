package com.anythink.core.common.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f4968b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4969c;

        public a(String str, boolean z10) {
            this.f4968b = str;
            this.f4969c = z10;
        }

        private boolean b() {
            return this.f4969c;
        }

        public final String a() {
            return this.f4968b;
        }
    }

    /* renamed from: com.anythink.core.common.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0074c implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        private IBinder f4974b;

        public C0074c(IBinder iBinder) {
            this.f4974b = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f4974b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f4974b;
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.f4974b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public final a a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                byte b10 = 0;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b(this, b10);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0 && context.bindService(intent, bVar, 1)) {
                    try {
                        C0074c c0074c = new C0074c(bVar.a());
                        return new a(c0074c.a(), c0074c.b());
                    } finally {
                    }
                } else {
                    throw new IOException("Google Play connection failed");
                }
            } catch (Exception e10) {
                throw e10;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* loaded from: classes.dex */
    public final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f4970a;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f4972c;

        private b() {
            this.f4970a = false;
            this.f4972c = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() {
            if (!this.f4970a) {
                this.f4970a = true;
                return this.f4972c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f4972c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public /* synthetic */ b(c cVar, byte b10) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
