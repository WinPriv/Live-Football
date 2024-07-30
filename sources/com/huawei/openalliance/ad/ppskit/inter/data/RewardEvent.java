package com.huawei.openalliance.ad.ppskit.inter.data;

import com.huawei.openalliance.ad.ppskit.annotations.OuterVisible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@OuterVisible
/* loaded from: classes2.dex */
public final class RewardEvent {
    private static final /* synthetic */ RewardEvent[] $VALUES;
    public static final RewardEvent CLOSE;
    private final String event = "userclose";

    static {
        RewardEvent rewardEvent = new RewardEvent();
        CLOSE = rewardEvent;
        $VALUES = new RewardEvent[]{rewardEvent};
    }

    public static RewardEvent valueOf(String str) {
        return (RewardEvent) Enum.valueOf(RewardEvent.class, str);
    }

    public static RewardEvent[] values() {
        return (RewardEvent[]) $VALUES.clone();
    }

    public final String a() {
        return this.event;
    }
}
