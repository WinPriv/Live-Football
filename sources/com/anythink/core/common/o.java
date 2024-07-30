package com.anythink.core.common;

import android.content.Context;
import android.os.CountDownTimer;
import com.anythink.core.common.e.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o<T extends com.anythink.core.common.e.q> {

    /* renamed from: c, reason: collision with root package name */
    protected CountDownTimer f6360c;

    /* renamed from: e, reason: collision with root package name */
    protected Context f6362e;

    /* renamed from: a, reason: collision with root package name */
    final String f6358a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<T> f6359b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    String f6361d = com.anythink.core.common.b.n.a().p();

    public o(Context context) {
        this.f6362e = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public final synchronized void a(T t10, boolean z10) {
        boolean z11 = true;
        if (z10) {
            this.f6359b.add(t10);
            a(true);
            return;
        }
        final com.anythink.core.c.a b10 = com.anythink.core.c.b.a(this.f6362e).b(this.f6361d);
        if (this.f6359b.isEmpty()) {
            if (b10.aa() > 0) {
                com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.core.common.o.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.this.f6360c = new CountDownTimer(b10.aa(), b10.aa()) { // from class: com.anythink.core.common.o.1.1
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                o.this.a(true);
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j10) {
                            }
                        };
                        o.this.f6360c.start();
                    }
                });
            }
            this.f6359b.add(t10);
            a(z11);
        }
        z11 = false;
        this.f6359b.add(t10);
        a(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z10) {
        if (z10) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f6359b);
            if (arrayList.size() > 0) {
                a(arrayList);
            }
            this.f6359b.clear();
        } else {
            com.anythink.core.c.a b10 = com.anythink.core.c.b.a(this.f6362e).b(this.f6361d);
            ArrayList arrayList2 = new ArrayList();
            if (this.f6359b.size() >= b10.Y()) {
                for (int Y = b10.Y() - 1; Y >= 0; Y--) {
                    arrayList2.add(this.f6359b.get(Y));
                    this.f6359b.remove(Y);
                }
                if (arrayList2.size() > 0) {
                    a(arrayList2);
                }
            }
        }
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.core.common.o.2
            @Override // java.lang.Runnable
            public final void run() {
                CountDownTimer countDownTimer;
                if (o.this.f6359b.isEmpty() && (countDownTimer = o.this.f6360c) != null) {
                    countDownTimer.cancel();
                }
            }
        });
    }
}
