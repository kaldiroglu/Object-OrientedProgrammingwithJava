package org.javaturk.oopj.ch15.domain;

import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // hashCode() and equals() overridden
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return name.equals(user.name);
    }
}
