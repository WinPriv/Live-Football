package com.vungle.warren;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class RuntimeValues {
    final AtomicReference<HeaderBiddingCallback> headerBiddingCallback = new AtomicReference<>();
    final AtomicReference<InitCallback> initCallback = new AtomicReference<>();
    final AtomicReference<VungleSettings> settings = new AtomicReference<>();
}
