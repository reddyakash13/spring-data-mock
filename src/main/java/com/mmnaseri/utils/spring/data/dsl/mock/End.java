package com.mmnaseri.utils.spring.data.dsl.mock;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (10/14/15)
 */
public interface End {

    <E> E mock(Class<E> repositoryInterface);

}
