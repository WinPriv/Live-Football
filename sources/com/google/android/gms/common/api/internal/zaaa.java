package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.huawei.openalliance.ad.constant.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import q.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaaa implements zaca {
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    private final zabi zad;
    private final zabi zae;
    private final Map<Api.AnyClientKey<?>, zabi> zaf;
    private final Api.Client zah;
    private Bundle zai;
    private final Lock zam;
    private final Set<SignInConnectionListener> zag = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult zaj = null;
    private ConnectionResult zak = null;
    private boolean zal = false;

    @GuardedBy("mLock")
    private int zan = 0;

    private zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zat> arrayList, ArrayList<zat> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.zaa = context;
        this.zab = zabeVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.zae = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, null));
        b bVar = new b();
        Iterator<Api.AnyClientKey<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            bVar.put(it.next(), this.zad);
        }
        Iterator<Api.AnyClientKey<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            bVar.put(it2.next(), this.zae);
        }
        this.zaf = Collections.unmodifiableMap(bVar);
    }

    @GuardedBy("mLock")
    private final void zaA(ConnectionResult connectionResult) {
        int i10 = this.zan;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zan = 0;
            }
            this.zab.zaa(connectionResult);
        }
        zaB();
        this.zan = 0;
    }

    @GuardedBy("mLock")
    private final void zaB() {
        Iterator<SignInConnectionListener> it = this.zag.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.zag.clear();
    }

    @GuardedBy("mLock")
    private final boolean zaC() {
        ConnectionResult connectionResult = this.zak;
        if (connectionResult != null && connectionResult.getErrorCode() == 4) {
            return true;
        }
        return false;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zabi zabiVar = this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.zae);
    }

    private static boolean zaE(ConnectionResult connectionResult) {
        if (connectionResult != null && connectionResult.isSuccess()) {
            return true;
        }
        return false;
    }

    public static zaaa zag(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList) {
        b bVar = new b();
        b bVar2 = new b();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (true == value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                bVar.put(entry.getKey(), value);
            } else {
                bVar2.put(entry.getKey(), value);
            }
        }
        Preconditions.checkState(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        b bVar3 = new b();
        b bVar4 = new b();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> zab = api.zab();
            if (bVar.containsKey(zab)) {
                bVar3.put(api, map2.get(api));
            } else if (bVar2.containsKey(zab)) {
                bVar4.put(api, map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zat zatVar = arrayList.get(i10);
            if (bVar3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else if (bVar4.containsKey(zatVar.zaa)) {
                arrayList3.add(zatVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, bVar, bVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, bVar3, bVar4);
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaaVar, int i10, boolean z10) {
        zaaaVar.zab.zac(i10, z10);
        zaaaVar.zak = null;
        zaaaVar.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaaVar, Bundle bundle) {
        Bundle bundle2 = zaaaVar.zai;
        if (bundle2 == null) {
            zaaaVar.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        if (zaE(zaaaVar.zaj)) {
            if (!zaE(zaaaVar.zak) && !zaaaVar.zaC()) {
                ConnectionResult connectionResult2 = zaaaVar.zak;
                if (connectionResult2 != null) {
                    if (zaaaVar.zan == 1) {
                        zaaaVar.zaB();
                        return;
                    } else {
                        zaaaVar.zaA(connectionResult2);
                        zaaaVar.zad.zar();
                        return;
                    }
                }
                return;
            }
            int i10 = zaaaVar.zan;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    zaaaVar.zan = 0;
                    return;
                }
                ((zabe) Preconditions.checkNotNull(zaaaVar.zab)).zab(zaaaVar.zai);
            }
            zaaaVar.zaB();
            zaaaVar.zan = 0;
            return;
        }
        if (zaaaVar.zaj != null && zaE(zaaaVar.zak)) {
            zaaaVar.zae.zar();
            zaaaVar.zaA((ConnectionResult) Preconditions.checkNotNull(zaaaVar.zaj));
            return;
        }
        ConnectionResult connectionResult3 = zaaaVar.zaj;
        if (connectionResult3 != null && (connectionResult = zaaaVar.zak) != null) {
            if (zaaaVar.zae.zaf < zaaaVar.zad.zaf) {
                connectionResult3 = connectionResult;
            }
            zaaaVar.zaA(connectionResult3);
        }
    }

    private final PendingIntent zaz() {
        if (this.zah == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.zaa(this.zaa, System.identityHashCode(this.zab), this.zah.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zac(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zad(Api<?> api) {
        if (Objects.equal(this.zaf.get(api.zab()), this.zae)) {
            if (zaC()) {
                return new ConnectionResult(4, zaz());
            }
            return this.zae.zad(api);
        }
        return this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(T t10) {
        if (zaD(t10)) {
            if (zaC()) {
                t10.setFailedResult(new Status(4, (String) null, zaz()));
                return t10;
            }
            this.zae.zae(t10);
            return t10;
        }
        this.zad.zae(t10);
        return t10;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(T t10) {
        if (zaD(t10)) {
            if (zaC()) {
                t10.setFailedResult(new Status(4, (String) null, zaz()));
                return t10;
            }
            return (T) this.zae.zaf(t10);
        }
        return (T) this.zad.zaf(t10);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(w.bE);
        this.zae.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(w.bE);
        this.zad.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.zam.lock();
        try {
            boolean zax = zax();
            this.zae.zar();
            this.zak = new ConnectionResult(4);
            if (zax) {
                new com.google.android.gms.internal.base.zaq(this.zac).post(new zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.zan == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = r2
        L22:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        boolean z10;
        this.zam.lock();
        try {
            if (this.zan == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            return z10;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            if ((zax() || zaw()) && !this.zae.zaw()) {
                this.zag.add(signInConnectionListener);
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
                return true;
            }
            this.zam.unlock();
            return false;
        } finally {
            this.zam.unlock();
        }
    }
}
