package com.zengwq.lambda;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<User> userlist = new ArrayList<>();
        userlist.add(new User("name1", 1));
        userlist.add(new User("name2", 2));
        userlist.add(new User("name3", 3));
        userlist.add(new User("name4", 4));
        userlist.add(new User("name5", 5));
        // userlist.stream().collect(Collectors.toMap(user -> user.getUsername(), user -> user)).forEach((s, user) -> System.out.println(s + "," + user));
        // LongStream.rangeClosed()
    }
}
