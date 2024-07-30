package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.p;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    private String f19206a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19207b;

    /* loaded from: classes.dex */
    public static class a<T> extends c.a<T> {
        private String o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f19208p;

        public a(p pVar) {
            super(pVar);
            this.f19112h = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cW)).intValue();
            this.f19113i = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cV)).intValue();
            this.f19114j = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.f18720dd)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f19108c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f19106a = str;
            return this;
        }

        public a g(String str) {
            this.o = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Object obj) {
            return b((a<T>) obj);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f19107b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f19113i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f19114j = i10;
            return this;
        }

        public a g(boolean z10) {
            this.f19208p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a b(Map map) {
            return d((Map<String, String>) map);
        }

        public a d(Map<String, String> map) {
            this.f19110e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(boolean z10) {
            this.f19117m = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a d(boolean z10) {
            this.f19118n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Map map) {
            return c((Map<String, String>) map);
        }

        public a c(Map<String, String> map) {
            this.f19109d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f19112h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public a b(T t10) {
            this.f19111g = t10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l<T> a() {
            return new l<>(this);
        }
    }

    public l(a aVar) {
        super(aVar);
        this.f19206a = aVar.o;
        this.f19207b = aVar.f19208p;
    }

    public static a b(p pVar) {
        return new a(pVar);
    }

    public boolean p() {
        if (this.f19206a != null) {
            return true;
        }
        return false;
    }

    public String q() {
        return this.f19206a;
    }

    public boolean r() {
        return this.f19207b;
    }
}
