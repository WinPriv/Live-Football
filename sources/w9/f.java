package w9;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public static class a<TResult> implements v9.b, v9.c<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f36182a = new CountDownLatch(1);

        @Override // v9.b
        public final void onFailure(Exception exc) {
            this.f36182a.countDown();
        }

        @Override // v9.c
        public final void onSuccess(TResult tresult) {
            this.f36182a.countDown();
        }
    }
}
