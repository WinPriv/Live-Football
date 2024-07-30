package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MetaData {

    /* renamed from: a, reason: collision with root package name */
    public final String f25604a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f25605b;

    /* renamed from: c, reason: collision with root package name */
    public final List<MetaDataValueTypes> f25606c;

    /* loaded from: classes2.dex */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f25604a = str;
        this.f25605b = list;
        this.f25606c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f25606c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.f25604a;
    }

    public List<String> getMetaDataValue() {
        return this.f25605b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f25606c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f25604a = str;
        this.f25605b = list;
        this.f25606c = list2;
    }
}
