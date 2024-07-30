package com.onesignal;

import java.util.ArrayList;
import java.util.Date;

/* compiled from: OSDynamicTriggerController.java */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static Date f26920c = new Date();

    /* renamed from: a, reason: collision with root package name */
    public final a f26921a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f26922b = new ArrayList<>();

    /* compiled from: OSDynamicTriggerController.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public m0(v0 v0Var) {
        this.f26921a = v0Var;
    }

    public static boolean a(double d10, double d11) {
        if (Math.abs(d10 - d11) < 0.3d) {
            return true;
        }
        return false;
    }
}
