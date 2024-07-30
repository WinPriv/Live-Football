package com.anythink.expressad.atsignalcommon.b;

import com.anythink.expressad.atsignalcommon.b.c;
import com.huawei.openalliance.ad.constant.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final long f6950a = 1;

    /* renamed from: b, reason: collision with root package name */
    private List<c.b.a> f6951b;

    private a(String str) {
        super(str);
        this.f6951b = new ArrayList();
    }

    private void a(c.b.a aVar) {
        this.f6951b.add(aVar);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c.b.a aVar : this.f6951b) {
            sb2.append(aVar.toString());
            sb2.append(w.aG);
            try {
                int i10 = 0;
                if (aVar.getCause() instanceof NoSuchFieldException) {
                    Field[] declaredFields = aVar.a().getDeclaredFields();
                    sb2.append(aVar.a().getName());
                    sb2.append(".");
                    sb2.append(aVar.c());
                    sb2.append(w.aG);
                    while (i10 < declaredFields.length) {
                        sb2.append(declaredFields[i10].getName());
                        sb2.append("/");
                        i10++;
                    }
                } else if (aVar.getCause() instanceof NoSuchMethodException) {
                    Method[] declaredMethods = aVar.a().getDeclaredMethods();
                    sb2.append(aVar.a().getName());
                    sb2.append("->");
                    sb2.append(aVar.b());
                    sb2.append(w.aG);
                    while (i10 < declaredMethods.length) {
                        if (aVar.b().equals(declaredMethods[i10].getName())) {
                            sb2.append(declaredMethods[i10].toGenericString());
                            sb2.append("/");
                        }
                        i10++;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            sb2.append("@@@@");
        }
        return sb2.toString();
    }

    private void a(List<c.b.a> list) {
        this.f6951b.addAll(list);
    }

    private List<c.b.a> a() {
        return this.f6951b;
    }

    private static a a(a aVar, a aVar2) {
        if (aVar == null) {
            return aVar2;
        }
        if (aVar2 == null) {
            return aVar;
        }
        a aVar3 = new a(aVar.getMessage() + w.aG + aVar2.getMessage());
        aVar3.a(aVar.f6951b);
        aVar3.a(aVar2.f6951b);
        return aVar3;
    }
}
