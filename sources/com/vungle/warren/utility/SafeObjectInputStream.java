package com.vungle.warren.utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* loaded from: classes2.dex */
class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    public SafeObjectInputStream(InputStream inputStream, List<Class<?>> list) throws IOException {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> resolveClass = super.resolveClass(objectStreamClass);
        if (this.allowed != null && !Number.class.isAssignableFrom(resolveClass) && !String.class.equals(resolveClass) && !Boolean.class.equals(resolveClass) && !resolveClass.isArray() && !this.allowed.contains(resolveClass)) {
            throw new IOException("Deserialization is not allowed for " + objectStreamClass.getName());
        }
        return resolveClass;
    }
}
