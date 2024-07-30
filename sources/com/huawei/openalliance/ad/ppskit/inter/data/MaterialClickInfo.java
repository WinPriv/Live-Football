package com.huawei.openalliance.ad.ppskit.inter.data;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class MaterialClickInfo {
    private Integer clickX;
    private Integer clickY;
    private String creativeSize;
    private Float density;
    private Integer sld;
    private Integer upX;
    private Integer upY;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f22639a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f22640b;

        /* renamed from: c, reason: collision with root package name */
        public String f22641c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f22642d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f22643e;
        public Integer f;

        /* renamed from: g, reason: collision with root package name */
        public Float f22644g;
    }

    public MaterialClickInfo(a aVar) {
        this.clickX = aVar.f22639a;
        this.clickY = aVar.f22640b;
        this.creativeSize = aVar.f22641c;
        this.sld = aVar.f22642d;
        this.density = aVar.f22644g;
        this.upX = aVar.f22643e;
        this.upY = aVar.f;
    }

    public final Integer a() {
        return this.sld;
    }

    public final void b(Float f) {
        this.density = f;
    }

    public final void c(Integer num) {
        this.sld = num;
    }

    public final Integer d() {
        return this.upX;
    }

    public final void e(Integer num) {
        this.upX = num;
    }

    public final Integer f() {
        return this.upY;
    }

    public final void g(Integer num) {
        this.upY = num;
    }

    public final Float h() {
        return this.density;
    }

    public final Integer i() {
        return this.clickX;
    }

    public final Integer j() {
        return this.clickY;
    }

    public final String k() {
        return this.creativeSize;
    }

    public final String toString() {
        return "MaterialClickInfo{clickX=" + this.clickX + ", clickY=" + this.clickY + ", creativeSize='" + this.creativeSize + "', sld=" + this.sld + ", density=" + this.density + ", upX=" + this.upX + ", upY=" + this.upY + '}';
    }

    public MaterialClickInfo(Integer num, Integer num2, String str) {
        this.clickX = num;
        this.clickY = num2;
        this.creativeSize = str;
    }
}
