package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.annotations.DataKeep;

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
        public Integer f22249a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f22250b;

        /* renamed from: c, reason: collision with root package name */
        public String f22251c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f22252d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f22253e;
        public Integer f;

        /* renamed from: g, reason: collision with root package name */
        public Float f22254g;
    }

    public MaterialClickInfo() {
    }

    public MaterialClickInfo(a aVar) {
        this.clickX = aVar.f22249a;
        this.clickY = aVar.f22250b;
        this.creativeSize = aVar.f22251c;
        this.sld = aVar.f22252d;
        this.density = aVar.f22254g;
        this.upX = aVar.f22253e;
        this.upY = aVar.f;
    }

    public final Integer a() {
        return this.upX;
    }

    public final Integer b() {
        return this.upY;
    }

    public final Integer c() {
        return this.clickX;
    }

    public final void d(Float f) {
        this.density = f;
    }

    public final void e(Integer num) {
        this.sld = num;
    }

    public final String f() {
        return this.creativeSize;
    }

    public final void g(Integer num) {
        this.upY = num;
    }

    public final Float h() {
        return this.density;
    }

    public final Integer i() {
        return this.clickY;
    }

    public final void j(Integer num) {
        this.upX = num;
    }

    public final Integer k() {
        return this.sld;
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
