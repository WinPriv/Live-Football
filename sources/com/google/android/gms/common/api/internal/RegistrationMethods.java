package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {

    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;
    public final UnregisterListenerMethod<A, L> zaa;
    public final Runnable zab;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder<A extends Api.AnyClient, L> {
        private RemoteCall<A, TaskCompletionSource<Void>> zaa;
        private RemoteCall<A, TaskCompletionSource<Boolean>> zab;
        private ListenerHolder<L> zad;
        private Feature[] zae;
        private int zag;
        private Runnable zac = zacj.zaa;
        private boolean zaf = true;

        private Builder() {
        }

        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z10;
            boolean z11;
            boolean z12 = true;
            if (this.zaa != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "Must set register function");
            if (this.zab != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Must set unregister function");
            if (this.zad == null) {
                z12 = false;
            }
            Preconditions.checkArgument(z12, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null")), this.zac, null);
        }

        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> register(RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z10) {
            this.zaf = z10;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setFeatures(Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setMethodKey(int i10) {
            this.zag = i10;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> unregister(RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> withHolder(ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }

        public /* synthetic */ Builder(zacm zacmVar) {
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(null);
    }
}
