package com.vungle.warren.vision;

import n8.b;

/* loaded from: classes2.dex */
public class VisionConfig {

    @b("aggregation_filters")
    public String[] aggregationFilters;

    @b("aggregation_time_windows")
    public int[] aggregationTimeWindows;

    @b("enabled")
    public boolean enabled;

    @b("view_limit")
    public Limits viewLimit;

    /* loaded from: classes2.dex */
    public static class Limits {

        @b("device")
        public int device;

        @b("mobile")
        public int mobile;

        @b("wifi")
        public int wifi;
    }
}
