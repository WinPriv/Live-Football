package com.esotericsoftware.kryo.factories;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;

/* loaded from: classes.dex */
public interface SerializerFactory {
    Serializer makeSerializer(Kryo kryo, Class<?> cls);
}
