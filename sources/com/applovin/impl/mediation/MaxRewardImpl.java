package com.applovin.impl.mediation;

import a3.l;
import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f17507a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17508b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 >= 0) {
            this.f17507a = str;
            this.f17508b = i10;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f17508b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f17507a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f17508b);
        sb2.append(", label=");
        return l.p(sb2, this.f17507a, "}");
    }
}
