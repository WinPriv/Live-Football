package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24575a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24576b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24577c;

    /* renamed from: d, reason: collision with root package name */
    public final d f24578d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24579e;
    public final ArrayList<Pair<String, String>> f;

    /* renamed from: com.ironsource.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0317a {

        /* renamed from: a, reason: collision with root package name */
        public final String f24580a;

        /* renamed from: d, reason: collision with root package name */
        public d f24583d;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24581b = false;

        /* renamed from: c, reason: collision with root package name */
        public String f24582c = "POST";

        /* renamed from: e, reason: collision with root package name */
        public boolean f24584e = false;
        public ArrayList<Pair<String, String>> f = new ArrayList<>();

        public C0317a(String str) {
            this.f24580a = "";
            if (str != null && !str.isEmpty()) {
                this.f24580a = str;
            }
        }
    }

    public a(C0317a c0317a) {
        this.f24579e = false;
        this.f24575a = c0317a.f24580a;
        this.f24576b = c0317a.f24581b;
        this.f24577c = c0317a.f24582c;
        this.f24578d = c0317a.f24583d;
        this.f24579e = c0317a.f24584e;
        if (c0317a.f != null) {
            this.f = new ArrayList<>(c0317a.f);
        }
    }
}
