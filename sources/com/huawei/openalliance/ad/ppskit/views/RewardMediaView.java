package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.k9;
import ka.n7;
import ka.p9;

/* loaded from: classes2.dex */
public abstract class RewardMediaView extends AutoScaleSizeRelativeLayout implements p9 {
    public int A;
    public boolean B;
    public String C;
    public long D;
    public final a E;

    /* renamed from: x, reason: collision with root package name */
    public ua.b f23322x;
    public VideoInfo y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet f23323z;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String concat;
            boolean z10;
            RewardMediaView rewardMediaView = RewardMediaView.this;
            try {
                if (1 == message.what) {
                    HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
                    long currentTimeMillis = System.currentTimeMillis();
                    rewardMediaView.getClass();
                    a aVar = rewardMediaView.E;
                    int i10 = (int) ((currentTimeMillis - 0) - 0);
                    rewardMediaView.A = i10;
                    if (i10 >= rewardMediaView.D) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        RewardMediaView.r(rewardMediaView);
                    } else {
                        RewardMediaView.s(rewardMediaView);
                        aVar.removeMessages(1);
                        aVar.sendEmptyMessageDelayed(1, 100L);
                    }
                }
            } catch (IllegalStateException unused) {
                concat = "handleMessage IllegalStateException";
                n7.g("RewardMediaView", concat);
            } catch (Throwable th) {
                concat = "handleMessage ".concat(th.getClass().getSimpleName());
                n7.g("RewardMediaView", concat);
            }
        }
    }

    public RewardMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23323z = new CopyOnWriteArraySet();
        this.A = 0;
        this.B = false;
        this.D = 0L;
        this.E = new a(Looper.myLooper());
    }

    public static void r(RewardMediaView rewardMediaView) {
        Iterator it = rewardMediaView.f23323z.iterator();
        while (it.hasNext()) {
            ((k9) it.next()).k(rewardMediaView.A, rewardMediaView.C);
        }
    }

    public static void s(RewardMediaView rewardMediaView) {
        if (rewardMediaView.D > 0 && !rewardMediaView.B) {
            Iterator it = rewardMediaView.f23323z.iterator();
            while (it.hasNext()) {
                k9 k9Var = (k9) it.next();
                String str = rewardMediaView.C;
                int i10 = rewardMediaView.A;
                long j10 = i10 / rewardMediaView.D;
                k9Var.a(str, i10);
            }
        }
    }

    public abstract /* synthetic */ int getPlayedProgress();

    public abstract /* synthetic */ int getPlayedTime();

    public ua.b getRewardAd() {
        return this.f23322x;
    }
}
